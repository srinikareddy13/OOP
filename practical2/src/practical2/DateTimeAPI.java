import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);

        LocalTime time = LocalTime.now();
        System.out.println("Current Time: " + time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date & Time: " + dateTime);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTime.format(format);
        System.out.println("Formatted Date & Time: " + formattedDateTime);
    }
}
