package classes;

import entities.Employee;
import entities.Leitor;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    public void run () {
        int n;

        Leitor sc = new Leitor();

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? "); n = Integer.parseInt(sc.scanner().nextLine());

        for(int i = 0; i < n; i++) {
            int id;
            String name;
            double salary;
            System.out.println();
            System.out.println("Employee #" + String.format("%.0f", (double)i + 1) + ":");
            System.out.print("Id: "); id = Integer.parseInt(sc.scanner().nextLine());
            System.out.print("Name: "); name = sc.scanner().nextLine();
            System.out.print("Salary: "); salary = Double.parseDouble(sc.scanner().nextLine());

           boolean created = Employee.newEmployee(employeeList, id, name, salary);

           if(!created) {
               return;
           }
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : "); int id = Integer.parseInt(sc.scanner().nextLine());
        System.out.print("Enter the percentage: "); double perc = Double.parseDouble(sc.scanner().nextLine());

        Employee.increaseSalary(employeeList, id, perc);

        System.out.println();
        System.out.println("List of employees: ");
        for(Employee employee: employeeList) {
            System.out.println(employee.getId() + ", " + employee.getName() + ", " + String.format("%.2f", employee.getSalary()));
        }

        sc.fecharLeitor();
    }
}
