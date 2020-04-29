package ArvoreBinaria;

import ArvoreBinaria.Classes.ArvoreBinaria;
import ArvoreBinaria.Classes.Node;

public class Ex01 {

    public static void main(String[] args) {
        Node nodeRaiz = new Node(14);

        Node[] listaNodes = {
                new Node(15), new Node(4), new Node(9), new Node(7),
                new Node(18), new Node(3), new Node(5), new Node(16),
                new Node(4), new Node(20), new Node(17), new Node(9),
                new Node(14), new Node(5)
        };

        ArvoreBinaria arvore = new ArvoreBinaria(nodeRaiz);

        for (int i = 0; i < listaNodes.length; i++) {
            arvore.inserirElemento(nodeRaiz, listaNodes[i]);
        }

        System.out.print("Pré-ordem: ");
        arvore.preOrdem(nodeRaiz);
        System.out.println();

        System.out.print("In-ordem: ");
        arvore.inOrdem(nodeRaiz);
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem(nodeRaiz);
        System.out.println();

        System.out.println("Maior elemento: " + arvore.maiorElemento(nodeRaiz).getInfo());
        System.out.println("Menor elemento: " + arvore.menorElemento(nodeRaiz).getInfo());
    }
}