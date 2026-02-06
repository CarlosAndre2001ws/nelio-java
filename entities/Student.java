package entities;

import java.util.ArrayList;

public class Student {
    private final String name;
    private final int age;
    private final double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void averageHeight(Student[] student, int n) {
        double total = 0.0;

        for (int i  = 0; i < n; i++) {
            total += student[i].getHeight();
        }

        System.out.printf("Altura média: %.2f%n", total/n);
    }

    private static ArrayList<Student> buildArrayListSixteen(Student[] listStudents, int total) {
        ArrayList<Student> newList = new ArrayList<>();

        for(int i = 0; i < total; i++) {
            if(listStudents[i].getAge() < 16) {
                newList.add(listStudents[i]);
            }
        }

        return newList;
    }

    public void percNamesBelowSixteen(Student[] listStudents, int total) {
        ArrayList<Student> listBelowSixteen;

        listBelowSixteen = buildArrayListSixteen(listStudents, total);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (listBelowSixteen.size() / (double) total) * 100);
        for(Student student: listBelowSixteen) {
            System.out.println(student.getName());
        }
    }
}
