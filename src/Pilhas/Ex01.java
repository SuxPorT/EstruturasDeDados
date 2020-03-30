package Pilhas;

import Pilhas.Classes.Pilha;

public class Ex01 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        imprimeResultado(pilha);

        pilha.empilha(1);
        pilha.empilha(2);
        imprimeResultado(pilha);

        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);
        imprimeResultado(pilha);

        System.out.println("Elemento desempilhado: " + pilha.desempilha());
        pilha.empilha(6);
        imprimeResultado(pilha);

        pilha.empilha(7);
        imprimeResultado(pilha);

        pilha.cria_pilha(10);
        imprimeResultado(pilha);
    }

    public static void imprimeResultado(Pilha pilha) {
        System.out.println("Pilha vazia: " + pilha.vazia());
        System.out.println("Pilha cheia: " + pilha.cheia());
        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Elementos da pilha: " + pilha.toString() + "\n");
    }
}
