/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.module.role.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import armor.core.infrastructure.exception.BusinessException;
import poet.oauth.module.role.entity.Country;
import poet.oauth.module.role.mapper.CountryMapper;
import poet.oauth.module.role.service.intf.ICountryService;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年6月13日
 */
@Service
public class CountryService2 implements ICountryService {
	
	@Autowired
	private CountryMapper countryMapper;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int updateUseless(Country country) {
		if("184".equals(country.getId())){
			countryMapper.updateByPrimaryKeySelective(country);
			throw new BusinessException("不能更新哦");
		}else{
			return countryMapper.updateByPrimaryKeySelective(country);
		}
	}

}
