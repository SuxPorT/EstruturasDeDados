package ListaDuplamenteEncadeada;

import ListaDuplamenteEncadeada.Classes.ListaDuplamenteEncadeada;
import ListaDuplamenteEncadeada.Classes.Node;

public class Main {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        Node primeiroNode = new Node(2);
        Node segundoNode = new Node(5);

        lista.inserePrimeiro(5);
        lista.inserePrimeiro(2);
        lista.inserePrimeiro(1);
        lista.inserePrimeiro(3);

        // Lista encadeada: [3, 1, 2, 5]
        imprimirResultado(lista);

        lista.insereUltimo(6);
        lista.insereUltimo(4);
        lista.insereDepois(segundoNode, 0);

        // Lista encadeada: [3, 1, 2, 5, 0, 6, 4]
        imprimirResultado(lista);

        for (int i = 0; i < 4; i++) {
            System.out.println("Primeiro elemento: " + lista.removePrimeiro().getInformacao());
        }

        // Lista encadeada: [0, 6, 4]
        imprimirResultado(lista);

        for (int i = 0; i < 3; i++) {
            System.out.println("Último elemento: " + lista.removeUltimo().getInformacao());
        }

        // Lista encadeada: [ ]
        imprimirResultado(lista);

        lista.inserePrimeiro(2);
        lista.inserePrimeiro(5);
        lista.inserePrimeiro(1);

        // Lista encadeada: [1, 5, 2]
        imprimirResultado(lista);

        System.out.println("Elemento removido: " + lista.remove(segundoNode).getInformacao());

        // Lista encadeada: [1, 2]
        imprimirResultado(lista);

        lista.insereOrdenado(5);
        lista.insereOrdenado(-2);
        lista.insereOrdenado(0);
        lista.insereOrdenado(3);

        // Lista encadeada: [-2, 0, 1, 2, 3, 5]
        imprimirResultado(lista);

        lista.insereUltimo(2);
        lista.insereOrdenado(4);

        // Lista encadeada: [-2, 0, 1, 2, 3, 5, 2]
        imprimirResultado(lista);
    }

    public static void imprimirResultado(ListaDuplamenteEncadeada lista) {
        System.out.println("Lista encadeada: " + lista.imprimir());
        System.out.println("Lista está ordenada: " + lista.isOrdenada() + "\n");
    }
}
