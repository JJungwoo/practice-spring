package aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("AOPTest2.xml");
        Calculator cal = context.getBean("calculator",Calculator.class);

        cal.add();
        cal.divide(1 , 2);
        cal.multiply(2, 3);

        System.out.println(" ===== coffee within test ===== ");

        Coffee coffee = context.getBean("coffee", Coffee.class);
        coffee.add(1);
    }
}
