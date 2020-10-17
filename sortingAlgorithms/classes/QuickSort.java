package sortingAlgorithms.classes;

import java.util.Random;

public class QuickSort {
    /**
     *  @author Henrique Felipe (https://github.com/HenriqueIni)
     *  @source https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/Quicksort/Aleatorizado/QuicksortAleatorizado.java
     **/

    public static void sort(int[] elements){
        sort(elements, 0, elements.length - 1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start < end) {
            int partition = partition(array, start, end);

            sort(array, start, partition - 1);
            sort(array, partition + 1, end);
        }
    }

    private static int partition(int[] elements, int start, int end){
        int randomIndex = new Random().nextInt(end - start + 1) + start;

        swap(elements, randomIndex, end);

        int pivot = elements[end], i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (elements[j] <= pivot) {
                i++;

                swap(elements, i, j);
            }
        }

        swap(elements, i + 1, end);

        return i + 1;
    }

    private static void swap(int[] elements, int i, int j){
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
}