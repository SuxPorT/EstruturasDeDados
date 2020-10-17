package queue.classes;

public class Queue {
    private final int[] data;
    private int first, last;
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
        StringBuilder toString = new StringBuilder("[");

        if (!this.empty()) {

            if (this.first < this.last) {
                for (int i = this.first; i < this.last; i++) {
                    toString.append(this.data[i]).append(", ");
                }
                toString.append(this.data[this.last]);
            }
            else if (this.first == this.last) {
                toString.append(this.data[this.last]);
            }
            else {
                for (int i = 0; i <= this.last; i++) {
                    toString.append(this.data[i]).append(", ");
                }

                for (int i = this.first; i < this.length - 1; i++) {
                    toString.append(this.data[i]).append(", ");
                }

                toString.append(this.data[this.data.length - 1]);
            }
        }

        toString.append("]");
        return toString.toString();
    }

    // Métodos auxiliares
    public int first() {
        if (!this.empty()) {
            return this.data[this.first];
        }

        return -1;
    }
}