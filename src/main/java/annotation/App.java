package annotation;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        Car c = context.getBean("car", Car.class);
        System.out.println(c);

        Book b = context.getBean("book", Book.class);
        System.out.println(b);

        People p = context.getBean("people", People.class);
        System.out.println(p);
    }

}
