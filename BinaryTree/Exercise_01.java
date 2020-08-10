package BinaryTree;

import BinaryTree.Classes.BinarySearchTree;
import BinaryTree.Classes.Node;

public class Exercise_01 {

    public static void main(String[] args) {
        int[] elements = {14, 15, 4, 9, 7, 18, 3, 5, 16, 20, 17, 8};

        BinarySearchTree tree = new BinarySearchTree();

        for (int elemento : elements) {
            tree.insert(elemento);
        }

        binarySearchTreeDetails(tree);

        for (int i = 0; i < 4; i++) {
            Node biggest = tree.biggest();

            System.out.print("Maior elemento: ");

            if (biggest == null) {
                System.out.println("null");
            }
            else {
                System.out.println(biggest.getInformation());
            }
        }

        binarySearchTreeDetails(tree);

        for (int i = 0; i < 4; i++) {
            Node menorElemento = tree.smallest();

            System.out.print("Menor elemento: ");

            if (menorElemento == null) {
                System.out.println("null");
            }
            else {
                System.out.println(menorElemento.getInformation());
            }
        }

        binarySearchTreeDetails(tree);

        tree.insert(7);
        tree.insert(10);

        System.out.println("Nova árvore: ");
        binarySearchTreeDetails(tree);

        int[] remove = {15, 8, 9};

        for (int element: remove) {
            System.out.println("Elemento removido: " + tree.remove(element).getInformation());
        }

        System.out.println("\nÁrvore final:");
        binarySearchTreeDetails(tree);
    }

    public static void binarySearchTreeDetails(BinarySearchTree binaryTree) {
        System.out.print("Pré-ordem: ");
        binaryTree.preOrder();
        System.out.println();

        System.out.print("In-ordem: ");
        binaryTree.inOrder();
        System.out.println();

        System.out.print("Pós-ordem: ");
        binaryTree.posOrder();
        System.out.println("\n");
    }
}