package entities;

public class CollegeStudent {

    private String name;
    private String email;

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public CollegeStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
