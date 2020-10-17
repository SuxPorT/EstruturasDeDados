package sortingAlgorithms.classes;

public class MergeSort {
    /**
     *  @author Henrique Felipe (https://github.com/HenriqueIni)
     *  @source https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/MergeSort/Java/MergeSort.java
     **/

    public static void sort(int[] elements, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;

            sort(elements, start, middle);
            sort(elements, middle + 1, end);
            merge(elements, start, middle, end);
        }
    }

    private static void merge(int[] elements, int start, int middle, int end) {
        int leftLength = middle - start + 1, rightLength = end - middle;
        int leftIndex = 0, rightIndex = 0;
        int[] left = new int[leftLength], right = new int[rightLength];

        for (int i = 0; i < leftLength; i++) {
            left[i] = elements[start + i];
        }

        for (int j = 0; j < rightLength; j++) {
            right[j] = elements[middle + 1 + j];
        }

        for (int k = start; k <= end; k++) {

            if (leftIndex < leftLength) {
                if (rightIndex < rightLength) {
                    if (left[leftIndex] < right[rightIndex]) {
                        elements[k] = left[leftIndex++];
                    } else {
                        elements[k] = right[rightIndex++];
                    }
                } else {
                    elements[k] = left[leftIndex++];
                }
            } else {
                elements[k] = right[rightIndex++];
            }
        }
    }
}