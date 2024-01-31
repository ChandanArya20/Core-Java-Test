import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI3 {
    public static void main(String[] args) {

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        String format1 = currentTime.format(DateTimeFormatter.ofPattern("hh:mm:s"));
        String format2 = currentTime.format(DateTimeFormatter.ofPattern("HH:m:ss"));
        String format3 = currentTime.format(DateTimeFormatter.ofPattern("h:m:s a"));
        String format4 = currentTime.format(DateTimeFormatter.ofPattern("hh:mm:ss"));


        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
//        System.out.println(format5);



    }
}
