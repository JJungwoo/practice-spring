package annotation;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Car {

    private String model;
    private int price;

    public void add(int a, int b) {
        System.out.println("Car aop test : " + (a + b));
    }
}
