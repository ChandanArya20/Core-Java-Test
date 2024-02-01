import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalUnit;

public class DateTimeAPI {
    public static void main(String[] args) {

        LocalDateTime currentDatTime = LocalDateTime.now();
        System.out.println(currentDatTime);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime localDateTime = LocalDateTime.of(currentDate, currentTime);
        System.out.println(localDateTime);

        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);

        LocalDate birthDate = LocalDate.of(2002, 8, 10);
        System.out.println(birthDate);

        LocalDate brother1BirthDate=LocalDate.of(2005,10,15);
        LocalDate brothe2BirthDate=LocalDate.of(2008,4,12);

        if(brothe2BirthDate.isBefore(brother1BirthDate)){
            System.out.println("Brother 2 is elder");
        } else {
            System.out.println("Brother 1 is elder");
        }

        System.out.println(birthDate.plusDays(12));
        System.out.println(birthDate.minusDays(10));

        LocalDate localDate1 = LocalDate.of(2024, Month.FEBRUARY, 12);
        System.out.println(localDate1);


    }
}
