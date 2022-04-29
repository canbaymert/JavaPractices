package _13_dateTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C03_localDateTime {
    public static void main(String[] args) {
        LocalDateTime datetime= LocalDateTime.now();
        System.out.println(datetime); // 2022-04-29T05:20:53.493886200
        System.out.println(datetime.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5)); //2025-07-09T10:25:53.493886200
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter.format(datetime)); // 29/April/2022
        DateTimeFormatter formatterSaat=DateTimeFormatter.ofPattern("h:mm:ss  a");
        System.out.println(formatterSaat.format(datetime)); // 5:21:52  AM

    }
}
