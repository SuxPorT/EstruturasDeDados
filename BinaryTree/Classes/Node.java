package BinaryTree.Classes;

public class Node {
    private int information;
    private Node left, right;

    public Node(int information) {
        this.information = information;
        this.left = null;
        this.right = null;
    }

    public int getInformation() {
        return this.information;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return this.right;
    }
}