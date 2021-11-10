package aop.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


// Advice : 보조업무
// @Component == <bean id="logAdvice"  class="aop.xml.LoggingAdvice" />
@Component
@Aspect // PointCut, Advice
public class LoggingAdvice {

	@Pointcut("execution(* add(int)) || execution(* add(int, int))")	// 인자값 하나 또는 두개 있는 것에 적용
	public void targetMethod() { //함수이름은 사용자가 정한다. 
		
	}

	@Pointcut("execution(* d*(int, int))")	// d로 시작하는 인자값 2개 메서드를 타겟
	public void targetMethodD() {

	}

	@Before("targetMethod()")
	public void beforeTest(JoinPoint joinPoint) {
		System.out.println("**** @Before ClassName : " + joinPoint.getTarget().getClass().getSimpleName() + " ****");
	}

	@After("targetMethod()")
	public void afterTest(JoinPoint joinPoint) {
		System.out.println("**** @After ClassName : " + joinPoint.getTarget().getClass().getSimpleName() + " ****");
	}

	@Around("targetMethod()")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable {
		// around -> before
		String methodName = joinPoint.getSignature().getName();
		System.out.println("[메서드 호출 전] : LoggingAdvice" + methodName );

		// @Before 동작 수행

		//주업무를 수행한다. 
		Object object = joinPoint.proceed();
        //주업무 수행후 돌아와서 수행한다.

		// around -> after
		System.out.println("[메서드 호출 후] LoggingAdvice: " + joinPoint );

		// @After 동작 수행

		return object;
	}

	@Around("targetMethodD()")
	public Object aroundMethodD(ProceedingJoinPoint joinPoint) throws Throwable {
		// around -> before
		String methodName = joinPoint.getSignature().getName();
		System.out.println("[메서드 호출 전] : LoggingAdvice -> aroundMethodD : " + methodName );

		// @Before 동작 수행

		// 중간에 메인 동작을 하지 않고 before에서 조건을 통해 동작을 멈출수도 있다.
		//if (true)
		//	return null;

		//주업무를 수행한다.
		Object object = joinPoint.proceed();
		//주업무 수행후 돌아와서 수행한다.

		// around -> after
		System.out.println("[메서드 호출 후] LoggingAdvice -> aroundMethodD : " + joinPoint );

		// @After 동작 수행

		return object;
	}
}
