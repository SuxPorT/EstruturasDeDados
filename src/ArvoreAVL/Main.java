package ArvoreAVL;

import ArvoreAVL.Classes.ArvoreAVL;

public class Main {

    public static void main(String[] args) {
        int[] listaElementos = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 8};

        ArvoreAVL arvore = new ArvoreAVL();

        for (int elemento : listaElementos) {
            arvore.inserirElemento(elemento);
        }

        mostrarArvore(arvore);
        System.out.println();

        int[] removerElementos = {15, 8, 9};

        for (int elemento: removerElementos) {
            System.out.println("Elemento removido: " + arvore.remove(elemento).getInfo());
        }

        mostrarArvore(arvore);
    }

    public static void mostrarArvore(ArvoreAVL arvore) {
        System.out.print("Pré-ordem: ");
        arvore.preOrdem();
        System.out.println();

        System.out.print("In-ordem: ");
        arvore.inOrdem();
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem();
        System.out.println();
    }
}
