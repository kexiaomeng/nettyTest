package tracy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sun.org.apache.xml.internal.security.Init;


public class Service {

	public void init() {
		System.out.println("初始化");
	}
	@Action(name="注解式拦截")
	public void add() {
		System.out.println("addddddddddddddddd");
	}
	
	public void destroy() {
		System.out.println("销毁");
	}
}
