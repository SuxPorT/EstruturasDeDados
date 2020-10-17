package sortingAlgorithms.classes;

public class InsertionSort {
    /**
     *  @author Henrique Felipe (https://github.com/HenriqueIni)
     *  @source https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/InsertionSort/Java/InsertionSort.java
     **/

    public static void sort(int[] elements) {
        int element, j;

        for (int i = 1; i < elements.length; i++) {
            element = elements[i];
            j = i - 1;

            while (j >= 0 && elements[j] > element){
                elements[j + 1] = elements[j--];
            }

            elements[j + 1] = element;
        }
    }
}