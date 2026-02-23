import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDate staticFormatedDate = LocalDate.parse("2022-07-20");

        LocalDate d08 = LocalDate.parse("2022/07/20", formatter);

        System.out.println("Hora atual: " + time.toString());
        System.out.println("Data e hora atual: " + dateTime.toString());
        System.out.println("Instante atual: " + instant.toString());
        System.out.println("Data formatada: " + staticFormatedDate.toString());
        System.out.println("d08 : " + d08);
    }
}