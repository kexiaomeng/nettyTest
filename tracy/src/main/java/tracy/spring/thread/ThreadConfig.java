package tracy.spring.thread;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;

@Configuration
@EnableAsync
@ComponentScan("tracy.spring.thread")
public class ThreadConfig implements AsyncConfigurer {
	

	public Executor getAsyncExecutor() {
		 ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
         executor.setCorePoolSize(5);
         executor.setMaxPoolSize(1000);
         executor.setQueueCapacity(25);
         executor.initialize();
         return executor;

		}
	
	
	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}
}
