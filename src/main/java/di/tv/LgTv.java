package di.tv;

public class LgTv implements Tv {

    public void turnOn() {
        System.out.println(getClass().getSimpleName()+ " 전원을 켠다.");
    }

    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " 전원을 끈다.");
    }
}
