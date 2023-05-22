package testes_processo_seletivo;

import java.time.LocalDate;
import java.util.Calendar;

public class HackerRank {
    public static void main(String[] args) {
        System.out.println(findDay(10, 4, 1999));
    }
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return LocalDate.of(year, month, day).getDayOfWeek().toString();

    }

}
