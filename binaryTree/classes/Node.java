package binaryTree.classes;

public class Node {
    private final int information;
    private Node left, right;

    public Node(int information) {
        this.information = information;
        this.left = null;
        this.right = null;
    }

    public int getInformation() {
        return this.information;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}