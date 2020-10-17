package binaryTree;

import binaryTree.classes.BalancedBinaryTree;

public class Exercise_02 {

    public static void main(String[] args) {
        BalancedBinaryTree tree = new BalancedBinaryTree();

        int[] leftUnbalance = {14, 15, 4, 9, 3};

        for (int element : leftUnbalance) {
            tree.insert(element);
        }

        System.out.println("Árvore desbalanceada à esquerda");
        balancedBinaryTreeDetails(tree);

        tree.insert(1);

        System.out.println("Árvore rotacionada à direita");
        balancedBinaryTreeDetails(tree);

        tree = new BalancedBinaryTree();

        int[] rightUnbalance = {14, 16, 4, 18, 15};

        for (int element: rightUnbalance) {
            tree.insert(element);
        }

        System.out.println("Elemento 21 está dentro da árvore: " + tree.search(21));
        System.out.println("Árvore desbalanceada à direita");
        balancedBinaryTreeDetails(tree);

        tree.insert(21);

        System.out.println("Elemento 21 está dentro da árvore: " + tree.search(21));
        System.out.println("Árvore rotacionada à esquerda");
        balancedBinaryTreeDetails(tree);

        tree.remove(15);
        tree.remove(14);

        System.out.println("Árvore desbalanceada com elementos removidos à esquerda");
        balancedBinaryTreeDetails(tree);

        tree.remove(4);
        System.out.println("Árvore balanceada");
        balancedBinaryTreeDetails(tree);
    }

    public static void balancedBinaryTreeDetails(BalancedBinaryTree tree) {
        System.out.println("Altura da árvore: " + tree.height());
        System.out.print("Pré-ordem: ");
        tree.preOrder();
        System.out.println();

        System.out.print("In-ordem: ");
        tree.inOrder();
        System.out.println();

        System.out.print("Pós-ordem: ");
        tree.posOrder();
        System.out.println("\n");
    }
}