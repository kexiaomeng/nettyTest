package tracy;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aop {
	@Pointcut("@annotation(tracy.Action)")
	public void anno() {};
	
	
	@Before("anno()")
	public void before(JoinPoint joinPoint) {
		
//		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//		Method method = signature.getMethod();
//		Action action = method.getAnnotation(Action.class);
		System.out.println(111111111111l);
	}
	
	
	

}
