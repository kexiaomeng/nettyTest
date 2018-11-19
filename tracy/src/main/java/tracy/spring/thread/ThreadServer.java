package tracy.spring.thread;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

@Service
public class ThreadServer {

	@Async
	public void doTask() {
		System.out.println("hello Thread");
	}
	
	@Async
	public void doTask1() {
		System.out.println("hello1111111111 Thread");
	}
}
