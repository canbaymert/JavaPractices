package _13_dateTime;

import java.time.LocalTime;

public class C02_localTime {
    public static void main(String[] args) {
        LocalTime time= LocalTime.now();
        System.out.println(time); //05:18:53.222728100
        double nano=time.getNano();
        double seconds=time.getSecond();
        double minute=time.getMinute();
    }

}
