package AlgoritmosDeOrdenacao;

// Autor: HenriqueIni
// Fonte: https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/SelectionSort/Java/SelectionSort.java

public class SelectionSort {
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = min(a, i, a.length - 1);
            trocar(a, i, minIndex);
        }
    }

    private static int min(int[] a, int i, int j) {
        if (i > j) {
            throw new IllegalArgumentException("i > j");
        }
        int minIndex = i;
        for (int k = i + 1; k <= j; k++) {
            if (a[minIndex] > a[k]) {
                minIndex = k;
            }
        }
        return minIndex;
    }

    private static void trocar(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    // Código de testes
    public static void main(String[] args) {
        int[] elementos = new int[100000];
        int tamanho = elementos.length;

        for (int i = 0; i < elementos.length; i++) {
            // Quase ordenado
            elementos[i] = tamanho--;

            if (elementos[i] % 4 == 0 || elementos[i] % 7 == 0) {
                elementos[i] = (int) (Math.random() * tamanho);
            }

            // Desordenado
            //elementos[i] = (int) (Math.random() * tamanho);

            // Ordem descrescente
            //elementos[i] = tamanho--;
        }

        System.out.println("Algoritmo desordenado");

        String ax = "[" + elementos[0];

        for (int i = 1; i < elementos.length; i++) {
            ax += ", " + elementos[i];
        }

        System.out.println(ax + "]");

        double startTime = System.nanoTime();
        selectionSort(elementos);
        double endTime   = System.nanoTime();
        double totalTime = (endTime - startTime) / 1000000000;

        System.out.println("\nAlgoritmo ordenado");

        String aux = "["+elementos[0];

        for(int i = 1; i < elementos.length; i++){
            aux += ", " + elementos[i];
        }

        System.out.println(aux + "]");

        System.out.println("\nTempo do algoritmo: " + totalTime);
    }
}