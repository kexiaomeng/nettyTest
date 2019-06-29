package tracy.spring.event;

import java.security.KeyStore.PrivateKeyEntry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

@Component
public class PublishEvent {
	
	@Autowired
	private ApplicationContext context;
	
	public void publish(Object eevent) {
		context.publishEvent(eevent);
	}
	
}
