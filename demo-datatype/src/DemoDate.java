import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args){
    //Store Date vale
    //LocalDate
    LocalDate day1 = LocalDate.of(2025, 12, 9);
    LocalDate day2 = LocalDate.of(1996, 3, 5);
    System.err.println(day1.isAfter(day2));

    LocalDate newDay = day1.plusDays(2);
    System.out.println(newDay);
    //plusWeek,pluseMonth,minusDay

    Month m1 = day1.getMonth();
    System.out.println(m1.toString());
    System.out.println(day1.getDayOfWeek());
    //getDay, getMonth, getWeek, getDayOfWeek...etc

    LocalDateTime data = LocalDateTime.of(2026, 3, 5, 9, 30);
    System.err.println(data.toString());


  }
  
}
