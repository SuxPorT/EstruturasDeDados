package sortingAlgorithms.classes;

public class BubbleSort {
    /**
     *  @author Henrique Felipe (https://github.com/HenriqueIni)
     *  @source https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/BubbleSort/Java/BubbleSort.java
     **/

    public static void sort(int[] elements){
        if (elements == null) {
            throw new NullPointerException("O elements não existe");
        }

        for (int i = 0; i < elements.length - 1; i++) {

            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    swap(elements, j);
                }
            }
        }
    }

    private static void swap(int[] elements, int j) {
        int temp = elements[j];
        elements[j] = elements[j + 1];
        elements[j + 1] = temp;
    }
}