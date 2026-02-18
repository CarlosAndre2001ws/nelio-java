import exercicio.fixacao.OcorrenciaMatriz;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Hora atual: " + time);
        System.out.println("Data e hora atual: " + dateTime);
    }
}