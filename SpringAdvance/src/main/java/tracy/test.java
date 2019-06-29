package tracy;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tracy.profile.ProfileTestConfig;

public class test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();
		
		configApplicationContext.getEnvironment().setActiveProfiles("prod");
		configApplicationContext.register(ProfileTestConfig.class);
		configApplicationContext.refresh();
		
		Service service = configApplicationContext.getBean(Service.class);
		configApplicationContext.getBean("servicesdsf1");
//		service.add();
		
		Service service1 = configApplicationContext.getBean(Service.class);
		System.out.println(service1.equals(service));
		
//		Config config = configApplicationContext.getBean(Config.class);
//		config.say();
		configApplicationContext.close();
	}
}
