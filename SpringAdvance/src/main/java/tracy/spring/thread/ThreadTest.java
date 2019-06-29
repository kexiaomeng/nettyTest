package tracy.spring.thread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ThreadTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThreadConfig.class);
		ThreadServer server = context.getBean(ThreadServer.class);
		for(int i =0;i<1000;i++) {
			server.doTask();
			server.doTask1();
			System.out.println(i);
		}
		
		context.close();
	}
}
