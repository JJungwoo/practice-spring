package factory;

// factory pattern
public class TvFactory {

    public static Tv makeTv(String brand) {
        Tv tv = null;
        if (brand.startsWith("S")) {
            tv = new SamsungTv("model");
        } else if (brand.startsWith("L")) {
            tv = new LgTv();
        }
        return tv;
    }
}
