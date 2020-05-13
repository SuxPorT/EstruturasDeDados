package ArvoreBinaria;

import ArvoreBinaria.Classes.ArvoreBinaria;
import ArvoreBinaria.Classes.Node;

public class Main {

    public static void main(String[] args) {
        int[] listaElementos = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 8};

        ArvoreBinaria arvore = new ArvoreBinaria();

        for (int elemento : listaElementos) {
            arvore.inserirElemento(elemento);
        }

        mostrarArvore(arvore);
        System.out.println();

        for (int i = 0; i < 4; i++) {
            Node maiorElemento = arvore.maiorElemento();

            System.out.print("Maior elemento: ");

            if (maiorElemento == null) {
                System.out.println("null");
            }
            else {
                System.out.println(maiorElemento.getInfo());
            }
        }

        mostrarArvore(arvore);
        System.out.println();

        for (int i = 0; i < 4; i++) {
            Node menorElemento = arvore.menorElemento();

            System.out.print("Menor elemento: ");

            if (menorElemento == null) {
                System.out.println("null");
            }
            else {
                System.out.println(menorElemento.getInfo());
            }
        }

        mostrarArvore(arvore);

        arvore.inserirElemento(7);
        arvore.inserirElemento(10);

        System.out.println("\nNova árvore: ");
        mostrarArvore(arvore);
        System.out.println();

        int[] removerElementos = {15, 8, 9};

        for (int elemento: removerElementos) {
            System.out.println("Elemento removido: " + arvore.remove(elemento).getInfo());
        }

        System.out.println("Árvore final:");
        mostrarArvore(arvore);
    }

    public static void mostrarArvore(ArvoreBinaria arvore) {
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