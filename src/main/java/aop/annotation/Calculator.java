package aop.annotation;

import org.springframework.stereotype.Component;

// Target -> 주관심사 (Core concern, 업무로직)
// @Component == <bean id="calcTarget" class="aop.xml.Calculator" />
@Component
public class Calculator {

	public void add() {
		System.out.println("arg 0개 가지고있는 add");
	}

	public void add(int x) {
		System.out.println("arg 1개 가지고있는 add");
	}

	public void add(int x, int y) {
		int result = x + y;
		System.out.println("arg 2개 add 결과:"+ result);
	}

	public void subtract(int x, int y) {
		int result = x - y;
		System.out.println("결과:"+ result);
	}

	public void multiply(int x, int y) {
		int result = x * y;
		System.out.println("결과:"+ result);
	}

	public void divide(int x, int y) {
		int result = x / y;
		System.out.println("결과:"+ result);
	}
}
