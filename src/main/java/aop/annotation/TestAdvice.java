package aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
@Aspect
public class TestAdvice {

    @Pointcut("execution(* *(..))")
    public void targetMethod() {

    }

    @Pointcut("within(aop.annotation.Coffee)")
    public void targetMethodWithin() {

    }

    @Before("targetMethodWithin()")
    public void testBeforeWithin() {
        System.out.println("testBeforeWithin Test");
    }

    @Around("targetMethod()")
    public void aroundTest(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundTest before");

        proceedingJoinPoint.proceed();

        MethodSignature ms = (MethodSignature)proceedingJoinPoint.getSignature();
        Method method = ms.getMethod();
        Object[] objs = proceedingJoinPoint.getArgs();
        System.out.println("메서드이름:" + method.getName() );
        for(Object param:objs) {
            System.out.println("들어온 파라메터:" + param);
        }

        System.out.println("aroundTest After");
    }
}
