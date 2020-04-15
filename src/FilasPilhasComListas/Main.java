package FilasPilhasComListas;

import FilasPilhasComListas.Classes.Fila;
import FilasPilhasComListas.Classes.Pilha;

public class Main {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        // Pilha: [ ]
        mostrarPilha(pilha);

        for (int i = 1; i <= 3; i++) {
            pilha.empilha(i);
        }

        // Pilha: [1, 2, 3]
        mostrarPilha(pilha);

        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento desempilhado: " + pilha.desempilha());
        }

        // Valor inválido (-1)
        //Pilha: [ ]
        mostrarPilha(pilha);

        Fila fila = new Fila();

        // Fila: [ ]
        mostrarFila(fila);

        for (int i = 4; i <=7; i++) {
            fila.insere(i);
        }

        // Fila: [4, 5, 6, 7]
        mostrarFila(fila);

        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento desinfileirado: " + fila.remove());
        }

        // Fila: [ ]
        mostrarFila(fila);

        // Valor inválido (-1)
        System.out.println("Elemento desinfileirado: " + fila.remove());
    }

    public static void mostrarPilha(Pilha pilha) {
        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Pilha está vazia: " + pilha.vazia());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());
        System.out.println("Pilha: " + pilha.mostra_pilha() + "\n");
    }

    public static void mostrarFila(Fila fila) {
        System.out.println("Fila está vazia: " + fila.vazia());
        System.out.println("Tamanho da fila: " + fila.tamanho());
        System.out.println("Fila: " + fila.mostra_fila() + "\n");
    }
}