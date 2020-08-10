package LinkedList.Classes;

public class Stack {
    private LinkedList data;

    public Stack() {
        this.data = new LinkedList();
    }

    public void insert(int element) {
        this.data.insertLast(element);
    }

    public int remove() {
        if (!this.empty()) {
            return this.data.removeLast().getInformation();
        }

        // Valor inválido
        return -1;
    }

    public int top() {
        if (!this.empty()) {
            Node node = this.data.removeLast();
            this.data.insertLast(node.getInformation());

            return node.getInformation();
        }

        // Valor inválido
        return -1;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }

    // Métodos auxiliares
    public boolean empty() {
        return this.data.empty();
    }
}