/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.client.spi.support;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bohnman.squiggly.util.SquigglyUtils;

import armor.core.tool.JSONMapper;
import armor.web.config.WebMvcBasicProperties;
import armor.web.extension.spi.ApiResultHandler;
import armor.web.extension.support.BusinessCodeHolder;
import armor.web.tool.ObjectMapperHolder;
import override.com.github.bohnman.squiggly.Squiggly;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年8月28日
 */
public class SHJApiResultHandler implements ApiResultHandler {
	
	private ObjectMapper mapper = JSONMapper.withApiConfig();
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object handle(Object result) {
		ObjectMapperHolder.set(mapper);
		return result;
//		String businessCode = BusinessCodeHolder.get();
//		ObjectMapper m = JSONMapper.withApiConfig();
//		ObjectMapper objectMapper = Squiggly.init(m, "data[-name]");
////	ObjectMapper objectMapper = Squiggly.init(m, "**,as{**,bs{-name}}");
////	ObjectMapper objectMapper = Squiggly.init(JSONMapper.withGatewayConfig(), "**,as[-bs[-name]]");
//		return (SquigglyUtils.stringify(objectMapper, result));
	}

}
