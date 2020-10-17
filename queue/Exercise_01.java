package queue;

import queue.classes.Queue;

public class Exercise_01 {

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        // Fila vazia
        queueDetails(queue);

        for (int i = 1; i <= 6; i++) {
            queue.insert(i);
        }
        // Fila [1, 2, 3, 4, 5]
        queueDetails(queue);

        for (int i = 0; i < 4; i++) {
            System.out.println("Removendo o elemento " + queue.remove());
        }
        // Fila [0, 0, 0, 0, 5]
        queueDetails(queue);

        for (int i = 6; i <= 11; i++) {
            queue.insert(i);
        }
        // Fila [6, 7, 8, 9, 5]
        queueDetails(queue);

        for (int i = 0; i < 4; i++) {
            System.out.println("Removendo o elemento " + queue.remove());
        }
        // Fila [0, 0, 0, 9, 0]
        queueDetails(queue);

        System.out.println("Adicionando o elemento 8");
        queue.insert(8);
        // Fila [0, 0, 0, 9, 8]
        queueDetails(queue);

        System.out.println("Removendo o elemento " + queue.remove());
        // Fila [0, 0, 0, 0, 8]
        queueDetails(queue);

        System.out.println("Removendo o elemento " + queue.remove());
        // Fila [0, 0, 0, 0, 0]
        queueDetails(queue);

        for (int i = 1; i <= 3; i++) {
            queue.insert(i);
        }
        // Fila [1, 2, 3, 0, 0]
        queueDetails(queue);
    }

    public static void queueDetails(Queue queue) {
        System.out.println("Fila cheia: " + queue.full());
        System.out.println("Fila vazia: " + queue.empty());
        System.out.println("Elementos da fila: " + queue.toString() + "\n");
    }
}