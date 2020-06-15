package AlgoritmosDeOrdenacao;

// Autor: HenriqueIni
// Fonte: https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/InsertionSort/Java/InsertionSort.java

public class InsertionSort {
    public static void insertionSort(int[] A){
        for(int i = 1; i < A.length; i++){
            int elemento = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > elemento){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = elemento;
        }
    }

    public static void insertionSort(Comparable[] A){
        for(int i = 1; i < A.length; i++){
            Comparable elemento = A[i];
            int j = i - 1;
            while(j >= 0 && A[j].compareTo(elemento) > 0){
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = elemento;
        }
    }

    // Código de testes
    public static void main(String[] args) {
        int elementos[] = new int[100000];
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
        insertionSort(elementos);
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