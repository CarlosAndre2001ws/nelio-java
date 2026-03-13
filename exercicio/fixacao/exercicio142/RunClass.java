package exercicio.fixacao.exercicio142;

import exercicio.fixacao.exercicio142.entities.Employee;
import exercicio.fixacao.exercicio142.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class RunClass {

    public static void run() {

        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: "); int amount = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < amount; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? "); String outsourced = sc.nextLine();
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Hours: "); int hours = Integer.parseInt(sc.nextLine());
            System.out.print("Value per hour: "); Double valuePerHour = Double.parseDouble(sc.nextLine());
            if(outsourced.equals("n")){
                employees.add(new Employee(name, hours, valuePerHour));
            } else {
                System.out.print("Additional charge: "); Double additionalCharge = Double.parseDouble(sc.nextLine());
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
        }

        System.out.println("PAYMENTS:");
        for(Employee employee : employees){
            System.out.println(employee.getNome() + " - $ " + String.format("%.2f", employee.payment()));
        }

    }
}
