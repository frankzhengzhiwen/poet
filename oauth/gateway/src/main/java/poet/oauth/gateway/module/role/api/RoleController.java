/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.gateway.module.role.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import poet.oauth.gateway.tool.Logs;
import poet.oauth.module.role.api.RoleServiceApi;
import poet.oauth.module.role.vo.Role;
import poet.oauth.module.user.vo.User;

import armor.core.infrastructure.exception.SystemException;
import armor.core.tool.Tools;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年5月10日
 */
@RestController
@RequestMapping("/api2/role")
public class RoleController  {
	
	private Role r1 = new Role();
	private Role r2 = new Role();
	private User u1 = new User();
	private User u2 = new User();
	private User u3 = new User();
	private User u4 = new User();
	{
		r1.setId("role-1");
		r1.setName("系统管理员");
		
		r2.setId("role-2");
		r2.setName("设计师");
		r2.setCreateDate(new Date());
		
		u1.setId("user1");
		u1.setAccount("zhangsan");
		u1.setName("张三");
		u1.setPassword("zhangpwd");
		u1.setCreateDate(new Date());
		
		u2.setId("user2");
		u2.setAccount("lisi");
		u2.setName("李四");
		u2.setPassword("lisipwd");
		
		u3.setId("user3");
		u3.setAccount("shejishi1");
		u3.setName("设计师1");
		u3.setPassword("she1pwd");
		u3.setCreateDate(new Date());
		
		u4.setId("user4");
		u4.setAccount("shejishi2");
		u4.setName("设计师2");
		u4.setPassword("she2pwd");
		
		u1.setRoles(Sets.newHashSet(r1));
		u2.setRoles(Sets.newHashSet(r2));
		u3.setRoles(Sets.newHashSet(r1,r2));
		u4.setRoles(Sets.newHashSet(r2));
	}
	
	@Autowired
	private RoleServiceApi roleServiceApi;
	
	@PostMapping("/ex/{i}")
	public Object ex(@PathVariable Integer i) {
		return roleServiceApi.ex(i);
	}
	
	@PostMapping("/upload/{orgInfo}")
	public String upload(@PathVariable String orgInfo,
			String message,
			@RequestPart("role") Role role,
			@RequestPart("user") User user,
			@RequestPart("files") MultipartFile[] files){
		if("e".equals(orgInfo)){
			throw new SystemException("文件上传出错");
		}
        try {
        	StringBuffer sb = new StringBuffer();
        	
        	sb.append("orgInfo:" + orgInfo);
        	sb.append(", message:" + message);
        	
        	if(Tools.Array.isNotEmpty(files)){
        		sb.append(", files:[");
        		boolean first = true;
        		for(MultipartFile file : files){
        			if(!file.isEmpty()) {// file can not be null since passed by springmvc validation
        				sb.append((first ? "" : ",") + "{file:"+new String(file.getBytes())+"}");
        				first = false;
        			}
        		}
        		sb.append("]");
        	}
        	
        	sb.append(",userName:{"+user.getName()+"}, userAccount:{"+user.getAccount()+"}");
        	sb.append(",roleName:{"+role.getName()+"}");
        	Logs.ROLE.debug("file upload get: \n"+sb.toString());
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException("Can't get file content", e);
        }
	}
	
	@PostMapping("/download/{orgCode}")
	public ResponseEntity<byte[]> download(@PathVariable String orgCode,
			String message,
			Role role) throws IOException{
		Logs.ROLE.debug("=========orgCode:"+orgCode+", message:"+message+", role:"+role);
	    //获取文件
		// 存在的文件
	    File file = null;
	    if("no".equals(orgCode)){
	    	file = new File("notExist");
	    }else{
	    	file = new File("E:/全部项目经理价.xls");
	    }
	    HttpHeaders headers = new HttpHeaders();  
	    headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);  
	    
	    //设置文件名
	    headers.setContentDispositionFormData("attachment", file.getName(), StandardCharsets.UTF_8);  
	    int size = (int) file.length();
	    //设置文件响应大小
	    headers.setContentLength(size);
	    FileInputStream inputStream = new FileInputStream(file);
	    byte[] bytes = new byte[size];
	    
	    int offset=0;
	    int readed;
	    while(offset<size && (readed = inputStream.read(bytes, offset,inputStream.available() )) != -1){
	    	offset+=readed;
	    }
	    inputStream.close();
	    
	    //返回
	    return new ResponseEntity<byte[]>(bytes,headers, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/list/{userId}", method = RequestMethod.POST)
	public List<Role> list(@PathVariable("userId") String userId,
			@RequestParam String message,
			@RequestBody List<User> users){
		return roleServiceApi.list(userId, message, users);
	}
	
	@RequestMapping(value = "/list2", method = RequestMethod.POST)
	public List<User> list2(){
		return Lists.newArrayList(u1,u2,u3,u4);
	}
	
	@RequestMapping(value = "/query/{roleId}", method = RequestMethod.POST)
	public Role query(@PathVariable Integer roleId,
			@RequestParam String message,
			@RequestBody User user){
		return roleServiceApi.query(roleId, message, user, r1);
	}

}
