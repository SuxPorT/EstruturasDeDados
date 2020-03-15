package Pilhas;
import Pilhas.Classes.Pilha;

public class Ex01 {

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        System.out.println("Pilha vazia: " + pilha.vazia());
        System.out.println("Pilha cheia: " + pilha.cheia());
        System.out.println("Topo da pilha: " + pilha.topo());

        pilha.empilha(1);
        pilha.empilha(2);
        System.out.println("\nPilha vazia: " + pilha.vazia());
        System.out.println("Pilha cheia: " + pilha.cheia());
        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Elementos da pilha: " + pilha.toString());

        pilha.empilha(3);
        pilha.empilha(4);
        pilha.empilha(5);
        System.out.println("\nElemento desempilhado: " + pilha.desempilha());
        pilha.empilha(6);
        System.out.println("Pilha cheia: " + pilha.cheia());
        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Elementos da pilha: " + pilha.toString() + "\n");

        pilha.empilha(7);

        pilha.cria_pilha(10);
        System.out.println("Pilha vazia: " + pilha.vazia());
        System.out.println("Pilha cheia: " + pilha.cheia());
        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Elementos da pilha: " + pilha.toString());
    }
}
