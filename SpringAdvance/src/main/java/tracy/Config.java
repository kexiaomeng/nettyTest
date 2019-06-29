package tracy;


import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;

import com.sun.org.apache.bcel.internal.util.SecuritySupport;

import sun.misc.IOUtils;

//@Configuration
//@EnableAspectJAutoProxy
//@ComponentScan("tracy")
//@PropertySource("test.properties")
//public class Config {
//	
//	@Value("${hello}")    //配置文件中的变量
//	private String hello;
//	
//	@Value("#{systemProperties['os.name']}")   //系统的变量
//	private String osName;
//	
//	@Value("http://www.baidu.com")
//	private Resource resource;
//	
//	public void say() {
//		System.out.println(hello);
//		System.out.println(osName);
//		try {
//			System.out.println(resource.getURL());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
//
//}