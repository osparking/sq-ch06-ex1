package aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
	
	@Around("execution(* services.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint) {
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
