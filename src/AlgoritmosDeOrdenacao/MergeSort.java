package AlgoritmosDeOrdenacao;

// Autor: HenriqueIni
// Fonte: https://github.com/BlogCyberini/Algoritmos-de-Ordenacao/blob/master/MergeSort/Java/MergeSort.java

public class MergeSort {
    public static void mergeSort(int A[], int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;
            mergeSort(A, inicio, meio);
            mergeSort(A, meio + 1, fim);
            merge(A, inicio, meio, fim);
        }
    }
    private static void merge(int A[], int inicio, int meio, int fim){
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;
        int esq[] = new int[tamEsq];
        int dir[] = new int[tamDir];
        int idxEsq = 0;
        int idxDir = 0;

        for(int i = 0; i < tamEsq; i++){
            esq[i] = A[inicio + i];
        }

        for(int j = 0; j < tamDir; j++){
            dir[j] = A[meio + 1 + j];
        }

        for(int k = inicio; k <= fim; k++){
            if(idxEsq < tamEsq){
                if(idxDir < tamDir){
                    if(esq[idxEsq] < dir[idxDir]){
                        A[k] = esq[idxEsq++];
                    }else{
                        A[k] = dir[idxDir++];
                    }
                }else{
                    A[k] = esq[idxEsq++];
                }
            }else{
                A[k] = dir[idxDir++];
            }
        }
    }

    public static void mergeSort(Comparable A[], int inicio, int fim){
        if(inicio < fim){
            int meio = (inicio + fim) / 2;
            mergeSort(A, inicio, meio);
            mergeSort(A, meio + 1, fim);
            merge(A, inicio, meio, fim);
        }
    }
    private static void merge(Comparable A[], int inicio, int meio, int fim){
        int tamEsq = meio - inicio + 1;
        int tamDir = fim - meio;
        Comparable esq[] = new Comparable[tamEsq];
        Comparable dir[] = new Comparable[tamDir];
        int idxEsq = 0;
        int idxDir = 0;

        for(int i = 0; i < tamEsq; i++){
            esq[i] = A[inicio + i];
        }

        for(int j = 0; j < tamDir; j++){
            dir[j] = A[meio + 1 + j];
        }

        for(int k = inicio; k <= fim; k++){
            if(idxEsq < tamEsq){
                if(idxDir < tamDir){
                    if(esq[idxEsq].compareTo(dir[idxDir]) < 0){
                        A[k] = esq[idxEsq++];
                    }else{
                        A[k] = dir[idxDir++];
                    }
                }else{
                    A[k] = esq[idxEsq++];
                }
            }else{
                A[k] = dir[idxDir++];
            }
        }
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
        mergeSort(elementos, 0, elementos.length - 1);
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