package annotation;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Book {
    private String title;
    private int price;
    private String kind;
}
