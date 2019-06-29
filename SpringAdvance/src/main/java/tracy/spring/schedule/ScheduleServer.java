package tracy.spring.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServer {
	
	@Scheduled(fixedRate=1000L)
	public void secondTask() {
		System.out.println("Second task");
	}
	
	@Scheduled(cron ="0/10 27 20 * * *")
	public void secondTaskSecond() {
		System.out.println("ffffff task");
	}
}
