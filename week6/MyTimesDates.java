import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);

        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);

        System.out.println("Today is " +currentDay+ ", " +currentMonth+ " " +currentDayNumber+ "th, " +currentYear+ " :)");
    }
}
