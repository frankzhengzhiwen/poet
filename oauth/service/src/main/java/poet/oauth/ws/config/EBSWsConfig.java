package poet.oauth.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EBSWsConfig {

	@Bean
    public EBSUpdatePasswordWsClient ebsUpdatePasswordWsClient() {
    	return new EBSUpdatePasswordWsClient();
    }
}