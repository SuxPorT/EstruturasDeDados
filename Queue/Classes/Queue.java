package Queue.Classes;

public class Queue {
    private int first, last;
    private int[] data;
    public int length;     // Variável auxiliar

    public Queue(int capacity) {
        this.first = -1;
        this.last = -1;
        this.data = new int[capacity];
        this.length = this.data.length;
    }

    public boolean full() {
        return (this.first == 0 && this.last == this.length - 1) || (this.first == this.last + 1);
    }

    public boolean empty() {
        return this.first == -1;
    }

    public void insert(int element) {
        if (!this.full()) {
            if (this.last == this.length - 1) {
                this.last = -1;
            }

            this.data[++last] = element;

            if (this.empty()) {
                this.first++;
            }
        } else {
            System.out.println("Fila está cheia. Impossível adicionar o elemento " + element);
        }
    }

    public int remove() {
        if (!this.empty()) {
            int lastElement = this.data[this.first];
            this.data[this.first++] = 0;

            if (this.first == this.length && this.last == this.length - 1) {
                this.first = -1;
                this.last = -1;
            }

            if (this.first > this.length - 1) {
                this.first = 0;
            }

            return lastElement;
        }
        else {
            System.out.println("Fila está vazia. Impossível remover o primeiro elemento");

            return -1;
        }
    }

    @Override
    public String toString() {
        String toString = "[";

        if (!this.empty()) {

            if (this.first < this.last) {
                for (int i = this.first; i < this.last; i++) {
                    toString += this.data[i] + ", ";
                }
                toString += this.data[this.last];
            }
            else if (this.first == this.last) {
                toString += this.data[this.last];
            }
            else {
                for (int i = 0; i <= this.last; i++) {
                    toString += this.data[i] + ", ";
                }

                for (int i = this.first; i < this.length - 1; i++) {
                    toString += this.data[i] + ", ";
                }

                toString += this.data[this.data.length - 1];
            }
        }

        toString += "]";
        return toString;
    }

    public void initialize(int capacity) {
        this.first = -1;
        this.last = -1;
        this.data = new int[capacity];
        this.length = this.data.length;
    }

    // Métodos auxiliares
    public int first() {
        if (!this.empty()) {
            return this.data[this.first];
        }

        return -1;
    }

    public int getLength() {
        return this.length;
    }
}