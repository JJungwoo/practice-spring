package di.car;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {

    private String model;
    private int price;

    public Car(String model, int price) {
        this.model = model;
        this.price = price;
    }
}
