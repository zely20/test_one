import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Main {
    public static void main(String[] args) {
        String text = String.format("Почтовое отправление %s вручено %s", "SR123123123123BY", LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println(text);
    }
}
