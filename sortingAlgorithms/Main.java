package sortingAlgorithms;

import sortingAlgorithms.classes.*;

public class Main {

    public static void main(String[] args) {
        int length = (int) Math.pow(10, 7);
        int[] elements = new int[length];

        // Tipo de array ordenado
        for (int i = 0; i < elements.length; i++) {
            // Quase ordenado
            elements[i] = length--;

            if (elements[i] % 4 == 0 || elements[i] % 7 == 0 || elements[i] % 13 == 0) {
                elements[i] = (int) (Math.random() * length);
            }

            // Desordenado
            // elements[i] = (int) (Math.random() * length);

            // Ordem descrescente
            // elements[i] = length--;
        }

        System.out.println("Algoritmo desordenado");

        StringBuilder toString = new StringBuilder("[" + elements[0]);

        for (int i = 1; i < elements.length; i++) {
            toString.append(", ").append(elements[i]);
        }

        System.out.println(toString + "]");

        double executionTime = System.nanoTime();

        // Tipo de algoritmo utilizado
        // BubbleSort.sort(elements);
        InsertionSort.sort(elements);
        // MergeSort.sort(elements, 0, elements.length - 1);
        // QuickSort.sort(elements);
        // SelectionSort.sort(elements);

        executionTime = (System.nanoTime() - executionTime) / Math.pow(10, 9);

        System.out.println("\nAlgoritmo ordenado");

        toString = new StringBuilder("[" + elements[0]);

        for(int i = 1; i < elements.length; i++){
            toString.append(", ").append(elements[i]);
        }

        System.out.println(toString + "]");
        System.out.println("\nTempo do algoritmo (segundos): " + executionTime);
    }
}