package tracy.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
public class MyListener implements ApplicationListener<MyEevent>{

	public void onApplicationEvent(MyEevent event) {
		
		System.out.println("¼àÌýµ½ÊÂ¼þ£º"+event.getMsg());
	}

}
