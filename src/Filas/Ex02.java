package Filas;

import Filas.Classes.Fila;
import Filas.Classes.Merge;

public class Ex02 {

    public static void main(String[] args) {
        int elementosA[] = {12, 35, 52, 64};
        int elementosB[] = {5, 15, 23, 55, 75};

        Fila filaA = new Fila(elementosA.length);
        Fila filaB = new Fila(elementosB.length);

        for (int valor : elementosA) {
            filaA.insere(valor);
        }

        for (int valor : elementosB) {
            filaB.insere(valor);
        }

        System.out.println("Fila A: " + filaA.imprime());
        System.out.println("Fila B: " + filaB.imprime() + "\n");

        Merge filaC = new Merge(filaA, filaB);

        System.out.println("Fila A: " + filaA.imprime());
        System.out.println("Fila B: " + filaB.imprime());
        System.out.println("Fila C: " + filaC.imprime());
    }
}
