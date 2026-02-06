package classes;

import entities.CollegeStudent;
import entities.Leitor;
import entities.Room;

public class PensionatoDesafio {

    public void run() {

        int n;
        final int ROOMS = 10;
        Room[] pensionato = new Room[ROOMS];

        for(int i = 0; i < ROOMS; i++) {
            pensionato[i] = new Room();
        }

        Leitor sc = new Leitor();

        System.out.print("How many rooms will be rented? "); n = Integer.parseInt(sc.scanner().nextLine());

        for(int i = 0; i < n; i++) {

            String name;
            String email;
            int roomNumber;

            System.out.printf("Rent #%.0f:%n", (double) i + 1);
            System.out.print("Name: "); name = sc.scanner().nextLine();
            System.out.print("Email: "); email = sc.scanner().nextLine();
            System.out.print("Room: "); roomNumber = Integer.parseInt(sc.scanner().nextLine());

            CollegeStudent patron = new CollegeStudent(name, email);

            pensionato[roomNumber].rent(patron, roomNumber);
        }

        System.out.println("Busy rooms:");
        pensionato[0].info(pensionato);
    }
}
