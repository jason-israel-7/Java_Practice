import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatExample {
    public static void main(String[] args) {
        // Sample LocalDate
        LocalDate today = LocalDate.now();

        // Different DateTimeFormatter Patterns
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E");                  // Day of week short form (e.g., Mon, Tue)
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("MMM dd yyyy");        // Month short form, day and full year

        // Printing formatted dates
        System.out.println("Format 1 (yyyy-MM-dd): " + today.format(formatter1));
        System.out.println("Format 2 (dd-MMM-yyyy): " + today.format(formatter2));
        System.out.println("Format 3 (dd/MM/yyyy): " + today.format(formatter3));
        System.out.println("Format 4 (E): " + today.format(formatter4));
        System.out.println("Format 5 (MMM dd yyyy): " + today.format(formatter5));
    }
}
