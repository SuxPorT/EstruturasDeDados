package Vetores;

public class Ex01 {
    public static void main(String[] args) {
        int[] vetor1 = {5,2};

        float media = mediaAritmetica(vetor1);

        System.out.println(media);
    }

    public static float mediaAritmetica(int[] vetor) {

        if (vetor.length > 0) {
            float soma = 0;

            for (int i = 0; i < vetor.length; i++) {
                soma += vetor[i];
            }

            return soma / vetor.length;
        }

        return 0;
    }
}
