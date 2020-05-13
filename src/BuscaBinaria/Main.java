package BuscaBinaria;

public class Main {

    public static void main(String[] args) {
        int dados[] = {10, 12, 14, 15, 22, 37};

        System.out.println(busca_binaria(dados, 22, 0, 5));
    }

    public static int busca_binaria(int dados[], int x, int inicio, int fim) {
        if (dados.length > 0 || !isOrdenado(dados)) {

            if (dados[inicio] > x || dados[fim] < x) {
                return -1;
            }

            if (inicio == fim && dados[inicio] == x) {
                return dados[inicio];
            }

            int meio = (fim + inicio) / 2;

            if (dados[meio] == x) {
                return dados[meio];
            } else if (dados[meio] < x) {
                return busca_binaria(dados, x, meio + 1, fim);
            }

            return busca_binaria(dados, x, inicio, meio - 1);
        }

        return -1;
    }

    public static boolean isOrdenado(int dados[]) {
        for (int i = 0; i < dados.length - 1; i++) {
            if (dados[i] > dados[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
