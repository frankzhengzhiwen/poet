/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.module.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poet.oauth.module.user.mapper.TBUserMapper;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年7月27日
 */
@Service
public class TBUserServiceImpl implements TBUserService {

	@Autowired
	private TBUserMapper tBUserMapper;
}
