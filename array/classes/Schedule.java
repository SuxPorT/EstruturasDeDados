package array.classes;

public class Schedule {
    private final Student[] studentCollection;
    private int count;

    public Schedule(int capacity) {
        this.studentCollection = new Student[capacity];
        this.count = 0;
    }

    public void add(String name, int phone) {
        this.studentCollection[count++] = new Student(name, phone);
    }

    public void remove() {
        this.studentCollection[count--] = null;
    }

    public void list() {
        for (int i = 0; i < this.count; i++) {
            System.out.println("Nome: " + this.studentCollection[i].getName());
            System.out.println("Telefone: " + this.studentCollection[i].getPhone() + "\n");
        }
    }
}