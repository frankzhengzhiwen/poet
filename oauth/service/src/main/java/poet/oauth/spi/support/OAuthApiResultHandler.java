/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.spi.support;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.bohnman.squiggly.util.SquigglyUtils;

import armor.core.tool.JSONMapper;
import armor.web.extension.spi.ApiResultHandler;
import armor.web.extension.support.BusinessCodeHolder;
import override.com.github.bohnman.squiggly.Squiggly;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年8月28日
 */
public class OAuthApiResultHandler implements ApiResultHandler {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object handle(Object result) {
		String businessCode = BusinessCodeHolder.get();
		ObjectMapper m = JSONMapper.withApiConfig();
		ObjectMapper objectMapper = Squiggly.init(m, "data[-name]");
//	ObjectMapper objectMapper = Squiggly.init(m, "**,as{**,bs{-name}}");
//	ObjectMapper objectMapper = Squiggly.init(JSONMapper.withGatewayConfig(), "**,as[-bs[-name]]");
		return (SquigglyUtils.stringify(objectMapper, result));
	}

}
