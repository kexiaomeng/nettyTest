package tracy.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class EventTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
		
		PublishEvent publishEvent = context.getBean(PublishEvent.class);
		
		publishEvent.publish(new MyEevent(publishEvent, "我的事件"));
	}
}
