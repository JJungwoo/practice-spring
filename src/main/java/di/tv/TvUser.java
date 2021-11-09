package di.tv;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TvUser {

    public static void main(String[] args) {
        usingTvToBean();
    }

    private static void usingTvToBean() {
        Resource resource = new ClassPathResource("di.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Tv tv = (Tv) factory.getBean("ltv");
        tv.turnOn();
        tv.turnOff();
        Tv tv2 = factory.getBean("stv", Tv.class);
        tv2.turnOn();
        tv2.turnOff();
    }
}
