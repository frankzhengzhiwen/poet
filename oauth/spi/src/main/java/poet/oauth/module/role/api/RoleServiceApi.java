/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.module.role.api;


import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;

import poet.oauth.module.role.vo.Role;
import poet.oauth.module.user.vo.User;

import feign.Param;
import feign.RequestLine;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年5月26日
 */
@FeignClient(name="${application.oauth-service.name}/role")
public interface RoleServiceApi {
	
	@RequestLine("GET /ex/{i}")
	public Role ex(@Param("i") Integer i);

	@RequestLine("POST /list/{userId}")
	public List<Role> list(@Param("userId")String userId,
			@Param("message")String message,
			@Param("users") List<User> users);
	
	@RequestLine("POST /query/{roleId}")
	public Role query(@Param("roleId") Integer roleId,
			@Param("message") String message,
			@Param("user") User user,
			@Param("role") Role role);
	
}
