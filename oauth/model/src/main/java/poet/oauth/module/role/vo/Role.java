/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.module.role.vo;

import java.util.Date;
import java.util.Set;

import poet.oauth.module.user.vo.User;


/**
 * 角色信息
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年5月9日
 */
public class Role {

	/**
	 * 角色主键
	 */
	private String id;
	
	/**
	 * 角色名称
	 */
	private String name;
	
	/**
	 * 创建日期
	 */
	private Date createDate;
	
	/**
	 * 角色用户
	 */
	private Set<User> users;

	/**
	 * @return property value of id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id value to be assigned to property id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return property value of name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name value to be assigned to property name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return property value of createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate value to be assigned to property createDate
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return property value of users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users value to be assigned to property users
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
