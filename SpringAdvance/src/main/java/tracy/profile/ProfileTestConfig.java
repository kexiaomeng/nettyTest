package tracy.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import tracy.Service;

@Configuration
@ComponentScan("tracy")
public class ProfileTestConfig {

	@Profile("prod")
	@Bean(initMethod="init", destroyMethod="destroy")
	
	public Service servicesdsf1() {
		return new Service();
	}
	
//	
//	@Profile("dev")
//	@Bean(initMethod="init", destroyMethod="destroy")
//	@Scope()
//	public Service service() {
//		return new Service();
//	}

}
