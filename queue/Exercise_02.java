package queue;

import queue.classes.*;

public class Exercise_02 {

    public static void main(String[] args) {
        int[] elementsA = {12, 35, 52, 64};
        int[] elementsB = {5, 15, 23, 55, 75};

        Queue queueA = new Queue(elementsA.length);
        Queue queueB = new Queue(elementsB.length);

        for (int element : elementsA) {
            queueA.insert(element);
        }

        for (int element : elementsB) {
            queueB.insert(element);
        }

        System.out.println("Fila A: " + queueA.toString());
        System.out.println("Fila B: " + queueB.toString() + "\n");

        Merge queueC = new Merge(queueA, queueB);

        System.out.println("Fila A: " + queueA.toString());
        System.out.println("Fila B: " + queueB.toString());
        System.out.println("Fila C: " + queueC.toString());
    }
}