package _13_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class C01_localDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2=LocalDate.of(1990,3,24);
        System.out.println(date); // Current Date
        System.out.println(date2); // 1990-03-24
        System.out.println(date.getDayOfMonth()); // 24
        System.out.println(date.getDayOfWeek()); // TUESDAY
        System.out.println(date.getMonthValue()); // 3
        System.out.println(date.getYear()); // 2022
        System.out.println(date.minusWeeks(20)); // 2021-12-10
        System.out.println(date.minusWeeks(5).minusDays(3)); // 2022-03-22
        System.out.println(date.plusMonths(9).plusDays(10)); // 2023-02-08
        LocalDate timeZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(timeZone); // Local Date of Japan: 2022-04-29
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(date.isAfter(date2)); // true
        System.out.println(Period.between(date,date2)); //P-32Y-1M-5D
        System.out.println(Period.between(date,date2).getYears());//-32
    }
}

