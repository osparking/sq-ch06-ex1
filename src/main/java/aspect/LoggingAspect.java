package aspect;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import util.MyUtil;

@Aspect
public class LoggingAspect {
	private Logger logger = MyUtil.getLogger(LoggingAspect.class.getName());
	
	@Around("execution(* services.*.*(..))")
	public void log(ProceedingJoinPoint joinPoint) {
		try {
			logger.info("포인트 컷 메소드 호출 전");
			joinPoint.proceed();
			logger.info("포인트 컷 메소드 실행 후");
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
