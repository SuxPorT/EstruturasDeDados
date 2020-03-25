package Filas;

import Filas.Classes.Fila;

public class Ex01 {

    public static void main(String[] args) {
        Fila fila = new Fila(5);
        // Fila vazia
        imprimeResultado(fila);

        for (int i = 1; i <= 6; i++) {
            fila.insere(i);
        }
        // Fila [1, 2, 3, 4, 5]
        imprimeResultado(fila);

        for (int i = 0; i < 4; i++) {
            System.out.println("Removendo o elemento " + fila.remove());
        }
        // Fila [0, 0, 0, 0, 5]
        imprimeResultado(fila);

        for (int i = 6; i <= 11; i++) {
            fila.insere(i);
        }
        // Fila [6, 7, 8, 9, 5]
        imprimeResultado(fila);

        for (int i = 0; i < 4; i++) {
            System.out.println("Removendo o elemento " + fila.remove());
        }
        // Fila [0, 0, 0, 9, 0]
        imprimeResultado(fila);

        System.out.println("Adicionando o elemento 8");
        fila.insere(8);
        // Fila [0, 0, 0, 9, 8]
        imprimeResultado(fila);

        System.out.println("Removendo o elemento " + fila.remove());
        // Fila [0, 0, 0, 0, 8]
        imprimeResultado(fila);

        System.out.println("Removendo o elemento " + fila.remove());
        // Fila [0, 0, 0, 0, 0]
        imprimeResultado(fila);

        for (int i = 1; i <= 3; i++) {
            fila.insere(i);
        }
        // Fila [1, 2, 3, 0, 0]
        imprimeResultado(fila);

    }

    public static void imprimeResultado(Fila fila) {
        System.out.println("Fila cheia: " + fila.cheia());
        System.out.println("Fila vazia: " + fila.vazia());
        System.out.println("Elementos da fila: " + fila.imprime() + "\n");
    }
}