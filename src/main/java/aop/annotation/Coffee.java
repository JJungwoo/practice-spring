package aop.annotation;

import org.springframework.stereotype.Component;

@Component
public class Coffee {

    public void add(int val) {
        System.out.println(val + "샷 추가");
    }
}
