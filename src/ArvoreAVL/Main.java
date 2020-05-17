package ArvoreAVL;

import ArvoreAVL.Classes.ArvoreAVL;

public class Main {

    public static void main(String[] args) {
        ArvoreAVL arvore = new ArvoreAVL();

        int[] desbalanceamentoEsquerdo = {14, 15, 4, 9, 3};

        for (int elemento : desbalanceamentoEsquerdo) {
            arvore.inserirElemento(elemento);
        }

        System.out.println("Árvore desbalanceada à esquerda");
        mostrarArvore(arvore);
        System.out.println();

        arvore.inserirElemento(1);

        System.out.println("Árvore rotacionada à direita");
        mostrarArvore(arvore);
        System.out.println();

        arvore = new ArvoreAVL();

        int[] desbalanceamentoDireito = {14, 16, 4, 18, 15};

        for (int elemento: desbalanceamentoDireito) {
            arvore.inserirElemento(elemento);
        }

        System.out.println("Elemento 21 está dentro da árvore: " + arvore.busca(21));
        System.out.println("Árvore desbalanceada à direita");
        mostrarArvore(arvore);
        System.out.println();

        arvore.inserirElemento(21);

        System.out.println("Elemento 21 está dentro da árvore: " + arvore.busca(21));
        System.out.println("Árvore rotacionada à esquerda");
        mostrarArvore(arvore);
        System.out.println();

        arvore.remove(15);
        arvore.remove(14);

        System.out.println("Árvore desbalanceada com elementos removidos à esquerda");
        mostrarArvore(arvore);
        System.out.println();

        arvore.remove(4);
        System.out.println("Árvore balanceada");
        mostrarArvore(arvore);
        System.out.println();
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
