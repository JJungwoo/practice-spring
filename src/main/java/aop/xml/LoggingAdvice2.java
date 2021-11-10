package aop.xml;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

// Advice : 보조업무
public class LoggingAdvice2 implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("******KOSTA:" + invocation.getMethod() + "메서드 호출 전(LoggingAdvice2)");
		//보조업무
		StopWatch watch = new StopWatch("계산시간");
		watch.start();
		
		
		//주업무를 수행한다. 
		Object object = invocation.proceed();
         
		
		//보조업무
		System.out.println("*****" + invocation.getMethod() + "메서드 호출 후(LoggingAdvice2)");
		watch.stop();
		System.out.println("주업무를 수행하는데 걸리는 시간:" + watch.getTotalTimeMillis());
		System.out.println(watch.prettyPrint());
		return object;
	}
}
