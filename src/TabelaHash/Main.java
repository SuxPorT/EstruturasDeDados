package TabelaHash;

import TabelaHash.Classes.TabelaHash;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int chave;

        System.out.print("Tamanho da tabela: ");
        int tamanho = input.nextInt();

        TabelaHash tabela = new TabelaHash(tamanho);

        tabela.imprimir();
        System.out.println("Número de colisões: " + tabela.colisoes() + "\n");

        while (loop) {
            System.out.print("Insira uma chave para buscar: ");
            chave = input.nextInt();

            if (chave == -1) {
                System.out.println("Saindo da busca...");
                loop = false;
            }
            else {
                System.out.println(chave + " está na tabela? " + tabela.busca(chave) + "\n");
            }
        }
    }
}