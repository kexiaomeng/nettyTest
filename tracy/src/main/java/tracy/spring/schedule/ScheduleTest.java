package tracy.spring.schedule;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ScheduleTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduleConfig.class);
		
	}
}
