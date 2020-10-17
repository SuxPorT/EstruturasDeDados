package sortingAlgorithms.classes;

public class SelectionSort {
    /**
     *  @author Henrique Felipe (https://github.com/HenriqueIni)
     *  @source https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/SelectionSort/Java/SelectionSort.java
     **/

    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int minimum = minimum(elements, i, elements.length - 1);

            swap(elements, i, minimum);
        }
    }

    private static int minimum(int[] elements, int i, int j) {
        if (i > j) {
            throw new IllegalArgumentException("i > j");
        }

        int minimum = i;

        for (int k = i + 1; k <= j; k++) {
            if (elements[minimum] > elements[k]) {
                minimum = k;
            }
        }

        return minimum;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}