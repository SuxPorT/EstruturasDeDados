package hashTable;

import hashTable.classes.HashTable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int key, length;

        System.out.print("Tamanho da tabela: ");
        length = scanner.nextInt();

        HashTable hashTable = new HashTable(length);
        hashTable.print();

        System.out.println("Número de colisões: " + hashTable.getCollisions() + "\n");

        while (loop) {
            System.out.print("Insira uma chave para buscar: ");
            key = scanner.nextInt();

            if (key == -1) {
                System.out.println("Saindo da busca...");
                loop = false;
            }
            else {
                System.out.println(key + " está na tabela? " + hashTable.search(key) + "\n");
            }
        }
    }
}