package di.car;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor // 모든 변수에 대한 인자값 들어있는 생성자
public class License {
    private String title;
    private int year;
}
