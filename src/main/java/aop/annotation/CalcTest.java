package aop.annotation;

import annotation.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// AOP 동작 순서
// 1. @Around before
// 2. @Before
// 3. @Around에서 주 업무
// 4. 주업무 끝
// 5. @AfterReturning : 정상, @AfterThrowing : 예외 발생 시
// 6. @After
// 7. @Around after
// @AfterThrowing : 예외 발생 시 동작

public class CalcTest {
	public static void main(String[] args){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("AOPTest2.xml");
		Calculator cal = context.getBean("calculator",Calculator.class);

		cal.add();
		cal.add(100);
		cal.add(100,20);

		Coffee cc = context.getBean("coffee", Coffee.class);
		cc.add(2);

		Car car = context.getBean("car", Car.class);
		car.add(1, 2);

		System.out.println();
		cal.subtract(100,20);
		System.out.println();
		cal.multiply(100,20);
		System.out.println();
		cal.divide(100,20);
	}
}

