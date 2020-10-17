package array.classes;

public class Student {
    private final String name;
    private final int phone;

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