package di.tv;

public class SamsungTv implements Tv {

    public SamsungTv(String model) {
        System.out.println(getClass().getSimpleName() + " 생성자");
    }

    public void powerOn() {
        System.out.println(getClass().getSimpleName()+ " 전원을 켠다.");
    }

    public void powerOff() {
        System.out.println(getClass().getSimpleName() + " 전원을 끈다.");
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName()+ " 전원을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName()+ " 전원을 끈다.");
    }
}
