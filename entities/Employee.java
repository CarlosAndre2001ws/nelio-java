package entities;

import java.util.List;

public class Employee {
    private long id;
    private String name;
    private double salary;

    public Employee() {}

    private Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    private static Employee getById(List<Employee> employeeList, int id) {
        for(Employee employee: employeeList) {
            if(employee.id == id) {
                return employee;
            }
        }

        return null;
    }

    public void newEmployee(List<Employee> employeeList, int id, String name, double salary) {
        Employee newEmployee = new Employee(id, name, salary);
        employeeList.add(newEmployee);
    }

    public void increaseSalary(List<Employee> employeeList, int id, double perc) {
        Employee luckyEmployee = getById(employeeList, id);

        if(luckyEmployee != null) {
            luckyEmployee.salary += luckyEmployee.salary * (perc / 100);
        } else {
            System.out.println("No employee found with this id, please try again.");
        }
    }
}
