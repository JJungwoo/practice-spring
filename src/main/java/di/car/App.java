package di.car;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    public static void main(String[] args) {
//        usingCarToBean();
//        usingCarToApplicationContext();
//        usingCarToApplicationContextArg();
//        usingCarToApplicationContextProperty();
//        usingPeopleToApplicationContextProperty();
//        usingPeopleListToApplicationContextProperty();
//        usingPeopleListClassToApplicationContextProperty();
//        usingPeopleMapToApplicationContextProperty();
        usingPeopleToApplicationContextPropertyAutowire();
    }

    private static void usingPeopleToApplicationContextProperty() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        People p = context.getBean("p", People.class);

        System.out.println(p.toString());
    }

    private static void usingPeopleListToApplicationContextProperty() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        People p = context.getBean("p-list", People.class);

        System.out.println(p.toString());
    }

    private static void usingPeopleListClassToApplicationContextProperty() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        People p = context.getBean("p-list-class", People.class);

        System.out.println(p.toString());
    }

    private static void usingPeopleMapToApplicationContextProperty() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        People p = context.getBean("p-map", People.class);

        System.out.println(p.toString());
    }

    private static void usingPeopleToApplicationContextPropertyAutowire() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        People p = context.getBean("p-autowire", People.class);

        System.out.println(p.toString());
    }


    private static void usingCarToBean() {
        Resource resource = new ClassPathResource("di.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Car car = factory.getBean("car", Car.class);

        System.out.println(car);
    }

    private static void usingCarToApplicationContext() {
        // ApplicationContext : Bean을 사용하기 전에 미리 할당하는 방법
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        Car car = context.getBean("car", Car.class);

        System.out.println(car);
    }

    private static void usingCarToApplicationContextArg() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        Car car = context.getBean("car-arg", Car.class);

        System.out.println(car);
    }

    private static void usingCarToApplicationContextProperty() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di.xml");
        Car car = context.getBean("car-property", Car.class);

        System.out.println(car);
    }
}
