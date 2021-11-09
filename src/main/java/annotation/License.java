package annotation;


import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor // 모든 변수에 대한 인자값 들어있는 생성자
@Component
public class License {
    private String title;
    private int year;
}
