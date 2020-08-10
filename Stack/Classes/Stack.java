package Stack.Classes;

public class Stack {
    private int top, max;
    private int[] data;

    public Stack(int max) {
        this.top = -1;
        this.max = max;
        this.data = new int[this.max];
    }

    public int top() {
        if (!this.empty()) {
            return this.data[this.top];
        }

        return this.top;
    }

    public boolean empty() {
        return this.top == -1;
    }

    public boolean full() {
        return this.max - 1 == this.top;
    }

    public void insert(int element) {
        if (!this.full()) {
            this.data[++this.top] = element;
        }
        else {
            System.out.println("Impossível empilhar elemento. A pilha está cheia");
        }
    }

    public int remove() {
        if (!this.empty()) {
            int element = this.data[this.top];
            this.data[this.top--] = 0;

            return element;
        }
        else {
            System.out.println("Impossível desempilhar. A pilha está vazia");

            return -1;
        }
    }

    public void createStack(int n) {
        this.top = -1;
        this.data = new int[n];
        this.max = n;
    }

    // Método auxiliar
    @Override
    public String toString() {
        String toString;

        if (!this.empty()) {
            toString = "[";

            for (int i = 0; i < this.top; i++) {
                toString += this.data[i] + ", ";
            }

            toString += this.data[this.top] + "]";
        }
        else {
            toString = "[ ]";
        }

        return toString;
    }
}