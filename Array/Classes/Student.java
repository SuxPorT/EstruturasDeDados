package Array.Classes;

public class Student {
    private String name;
    private int phone;

    public Student(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return this.name;
    }

    public int getPhone() {
        return this.phone;
    }
}