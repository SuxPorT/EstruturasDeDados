package LinkedList.Classes;

public class Queue {
    private LinkedList data;

    public Queue() {
        this.data = new LinkedList();
    }

    public void insert(int element) {
        this.data.insertLast(element);
    }

    public int remove() {
        if (!this.empty()) {
            return this.data.removeFirst().getInformation();
        }

        // Valor inválido
        return -1;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    // Métodos auxiliarex
    public boolean empty() {
        return this.data.empty();
    }
}