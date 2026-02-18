import java.time.*;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        LocalDate staticFormatedDate = LocalDate.parse("2022-07-20");

        System.out.println("Hora atual: " + time.toString());
        System.out.println("Data e hora atual: " + dateTime.toString());
        System.out.println("Instante atual: " + instant.toString());
        System.out.println("Data formatada: " + staticFormatedDate.toString());
    }
}