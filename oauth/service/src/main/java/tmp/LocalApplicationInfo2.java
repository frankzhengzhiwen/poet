/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package tmp;

import static poet.oauth.config.OAuthBusinessCode.APP_CODE;
import static poet.oauth.config.OAuthBusinessCode.ROLE;
import static poet.oauth.config.OAuthBusinessCode.ROLE_EBS;
import static poet.oauth.config.OAuthBusinessCode.ROLE_EX;
import static poet.oauth.config.OAuthBusinessCode.ROLE_LIST;
import static poet.oauth.config.OAuthBusinessCode.ROLE_QUERY;
import static poet.oauth.config.OAuthBusinessCode.ROLE_STRING;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import armor.codebinder.extension.spi.ApplicationInfoFactoryBean;
import armor.codebinder.model.ApplicationInfo;
import armor.codebinder.model.BusinessInfo;
import armor.codebinder.model.ScenarioInfo;
import armor.web.constants.ConfigKey;
import armor.web.tool.PropertiesHolder;

/**
 * TODO
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年7月24日
 */
@Component("applicationInfo333")
public class LocalApplicationInfo2 implements ApplicationInfoFactoryBean {
	
	@Value("spring.application.name")
	private String applicationName;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ApplicationInfo getObject() throws Exception {
		ApplicationInfo applicationInfo = new ApplicationInfo();
//		applicationInfo.setAppCode(PropertiesHolder.getProperty(ConfigKey.APPLICATION_NAME));
		applicationInfo.setAppCode(applicationName);
		applicationInfo.setAppCode(APP_CODE);
		ScenarioInfo s1 = new ScenarioInfo();
		s1.setScenarioCode(ROLE);
		s1.setScenarioURI("/role");
		s1.add(new BusinessInfo(ROLE_STRING, "/string"));
		s1.add(new BusinessInfo(ROLE_EX, "/ex"));
		s1.add(new BusinessInfo(ROLE_LIST, "/list"));
		s1.add(new BusinessInfo(ROLE_QUERY, "/query"));
		s1.add(new BusinessInfo(ROLE_EBS, "/ebs"));
		applicationInfo.put(ROLE, s1);
		return applicationInfo;
	}

}
