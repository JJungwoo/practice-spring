package factory;

public class User {

    public static void main(String[] args) {
        usingTvToFactory();
    }

    private static void usingTv() {
        SamsungTv tv = new SamsungTv("model");
        tv.powerOn();
        tv.powerOff();
    }

    private static void usingTvToInterface() {
        Tv tv = new LgTv();
        tv.turnOn();
        tv.turnOff();
    }

    private static void usingTvToFactory() {
        Tv tv = TvFactory.makeTv("Samsung");
        tv.turnOn();
        tv.turnOff();
    }
}
