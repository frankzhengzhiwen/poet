/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.module.user.vo;

import java.util.Date;
import java.util.Set;

import poet.oauth.module.role.vo.Role;

/**
 * 用户信息
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年5月9日
 */
public class User {
	
	/**
	 * 用户主键
	 */
	private String id;

	/**
	 * 系统账号
	 */
	private String account;
	
	/**
	 * 登录密码
	 */
	private String password;
	
	/**
	 * 姓名
	 */
	private String name;
	
	/**
	 * 手机号
	 */
	private String mobile;
	
	/**
	 * 创建日期
	 */
	private Date createDate;
	
	/**
	 * 用户角色
	 */
	private Set<Role> roles;

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
	 * @return property value of account
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param account value to be assigned to property account
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return property value of password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password value to be assigned to property password
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return property value of mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile value to be assigned to property mobile
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
	 * @return property value of roles
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles value to be assigned to property roles
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
