package annotation;

import di.car.Book;
import di.car.Car;
import di.car.License;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Setter
@Getter
@ToString
@NoArgsConstructor  // 디폴트 생성자, 인자없는 생성자
@Component  // 컴포넌트 생성
public class People {

    private String name;
    private String phone;

    private Car car;

    private List<String> major;

    private List<License> licenses;

    private Map<String, Book> bookMap;

}
