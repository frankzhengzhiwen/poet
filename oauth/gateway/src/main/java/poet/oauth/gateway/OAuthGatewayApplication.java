/**
 * Copyright (c) 2017, poet All Rights Reserved. 
 */  
 
package poet.oauth.gateway;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 权限认证系统网关
 * 
 * @author <a href="mailto:frankzhiwen@163.com">郑智文(Frank Zheng)</a>
 * @version 0.0.1
 * @date 2017年5月4日
 */
@EnableZuulProxy
@EnableEurekaClient
//@SpringCloudApplication
@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan(basePackages = {"poet.**.module.*.mapper"})
@EnableFeignClients(basePackages = {"poet"})
public class OAuthGatewayApplication {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		IPing
//		IRule
//		IPingStrategy
		new SpringApplicationBuilder(OAuthGatewayApplication.class).web(true).run(args);
	}
	
}
