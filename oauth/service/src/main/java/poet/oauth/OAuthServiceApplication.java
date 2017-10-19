/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Import;

import poet.oauth.ws.config.EBSWsConfig;

/**
 * 权限认证系统网关
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年5月4日
 */
@Import(
	{
		EBSWsConfig.class
	}
)
//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = {"poet.**.module.*.mapper"})
@EnableFeignClients(basePackages = {"poet"})
public class OAuthServiceApplication {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(OAuthServiceApplication.class).web(true).run(args);
	}

}
