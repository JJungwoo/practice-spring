package aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class LoggingAdvice2   {

	// sub로 시작하는 함수 모두 적용
	@Pointcut("execution(* sub*(..))")
	public void aa() {
	}
	
	@Before("aa()")
	public void beforeAA(JoinPoint jp) {
		System.out.println("------------before----------" + jp.toShortString());
	}

	@After("aa()")
	public void afterAA(JoinPoint jp) {
		System.out.println("------------after----------" + jp.toShortString());
	}

	@AfterReturning("aa()")
	public void afterReturnAA(JoinPoint jp) {
		System.out.println("------------afterReturning----------" + jp.toShortString());
	}

	@AfterThrowing("aa()")
	public void afterthrowAA(JoinPoint jp) {
		System.out.println("------------afterThrowing----------" + jp.toShortString());
	}

	@Around("aa()")
	public Object invoke(ProceedingJoinPoint jp) throws Throwable {
		String methodName = jp.getSignature().toShortString();
		System.out.println("[보조업무 LoggingAdvice2]" + methodName + "호출전");

		//보조업무
		StopWatch watch = new StopWatch("계산 시간");
		watch.start();
		 
		//주업무를 수행한다. 
		Object object = jp.proceed();

		//보조업무
		System.out.println("[보조업무 LoggingAdvice2]" + methodName + "호출후");
		watch.stop();

		System.out.println("주 업무를 수행하는데 걸리는 시간:" + watch.getTotalTimeMillis());
		System.out.println(watch.prettyPrint());
		System.out.println("#######################################");

		return object;
	}
}
