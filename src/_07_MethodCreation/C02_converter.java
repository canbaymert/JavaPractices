package _07_MethodCreation;

public class C02_converter {
    public static void main(String[] args) {
        double inithourdata = 5;
        double initmiledata = 5;
        double initkgdata = 6;

        double hourdata = hour2second(inithourdata);
        double miledata = mile2km(initmiledata);
        double kgdata = kg2gr(initkgdata);
        System.out.println(inithourdata + " hour:" + hourdata + " seconds");
        System.out.println(initmiledata + " mile:" + miledata + " kilometers");
        System.out.println(initkgdata + " kg:" + kgdata + " grams");
    }

    public static double kg2gr(double kilo) {
        return kilo * 1000;
    }

    public static double mile2km(double mile) {
        return mile * 1.609344;
    }

    public static double hour2second(double hour) {
        return 3600 * hour;
    }
}

