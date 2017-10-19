/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.module.role.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import armor.core.infrastructure.exception.BusinessException;
import poet.oauth.module.role.entity.Country;
import poet.oauth.module.role.mapper.CountryMapper;
import poet.oauth.module.role.service.intf.ICountryService;
import poet.oauth.module.user.entity.MyUser;
import poet.oauth.module.user.mapper.TBUserMapper;

import tk.mybatis.mapper.entity.Example;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年6月13日
 */
@Service
public class CountryService implements ICountryService {
	
	@Autowired
	private CountryMapper countryMapper;
	
	@Autowired
	private TBUserMapper tBUserMapper;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateUseless(Country country) {
		if("0".equals(country.getId())){
//			countryMapper.updateByPrimaryKeySelective(country);
			Example e = new Example(MyUser.class);
			e.createCriteria().andLike("name", "%[abc]");
			e.setOrderByClause("name");
			List<MyUser> l = tBUserMapper.selectByExample(e);
			
			throw new BusinessException("不能更新哦");
		}else{
			return countryMapper.updateByPrimaryKeySelective(country);
		}
	}

}
