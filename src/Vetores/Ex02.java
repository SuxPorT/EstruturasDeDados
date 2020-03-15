package Vetores;

public class Ex02 {
    public static void main(String[] args) {
        int[] vetor = {1, 1, 2, 3, 2};

        moda(vetor);
    }

    public static void moda(int[] vetor) {
        int contador, moda;
        int comparador = 0, quantidadeModas = 0;

        int modas[]= new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            contador = 1;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    ++contador;
                }
            }

            if (contador > comparador) {
                moda = vetor[i];
                modas[quantidadeModas] = moda;
                comparador = contador;
            }
            else if (contador == comparador){
                quantidadeModas++;
                modas[quantidadeModas] = vetor[i];
            }
        }

        if (quantidadeModas > 0){
            System.out.print("As modas são");
            for (int j = 0; j <= quantidadeModas; j++) {
                if ( j == quantidadeModas){
                    System.out.println(" e "+modas[j]+".");
                }
                else {
                    System.out.print(" " + modas[j]);
                }
            }
        }
        else {
            System.out.println("Não há moda");
        }
    }
}
