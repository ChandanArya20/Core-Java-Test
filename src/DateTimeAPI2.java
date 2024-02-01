import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI2 {
    public static void main(String[] args) {

        LocalDateTime currentDatTime = LocalDateTime.now();
        System.out.println(currentDatTime);

        LocalDate currentDate = LocalDate.of(2024, 1, 12);
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        String format1 = currentDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String format2 = currentDate.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy"));
        String format3 = currentDate.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy"));
        String format4 = currentDate.format(DateTimeFormatter.ofPattern("E dd/MMMM/yyyy"));
        String format5 = currentDate.format(DateTimeFormatter.ofPattern("EE dd/MMMM/yyyy"));
        String format6 = currentDate.format(DateTimeFormatter.ofPattern("EEE dd/MMMM/yyyy"));
        String format7 = currentDate.format(DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy"));
        String format8 = currentDate.format(DateTimeFormatter.ofPattern("dd/MMMM/yy"));
        String format9 = currentDate.format(DateTimeFormatter.ofPattern("dd/M/yyyy"));
        String format10 = currentDate.format(DateTimeFormatter.ofPattern("d/MMMM/y"));
        String format11 = currentDate.format(DateTimeFormatter.ofPattern("d-MMMM-y"));
        String format12 = currentDate.format(DateTimeFormatter.ofPattern("d MMMM y"));
        String format13 = currentDate.format(DateTimeFormatter.ofPattern("MMMM dd yyyy"));
        String format14 = currentDate.format(DateTimeFormatter.ofPattern("MMMM dd"));
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        System.out.println(format4);
        System.out.println(format5);
        System.out.println(format6);
        System.out.println(format7);
        System.out.println(format8);
        System.out.println(format9);
        System.out.println(format10);
        System.out.println(format11);
        System.out.println(format12);
        System.out.println(format13);
        System.out.println(format14);

        LocalDate ddMYyyy = LocalDate.parse("01 Jan 2024", DateTimeFormatter.ofPattern("dd MMM yyyy"));
        System.out.println(ddMYyyy);


    }
}
