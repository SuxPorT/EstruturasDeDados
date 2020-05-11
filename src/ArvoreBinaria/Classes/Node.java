package ArvoreBinaria.Classes;

public class Node {
    private int info;
    private Node esquerda, direita;

    public Node(int info) {
        this.info = info;
        this.esquerda = null;
        this.direita = null;
    }

    public int getInfo() {
        return this.info;
    }

    public void setEsquerda(Node esquerda) {
        this.esquerda = esquerda;
    }

    public Node getEsquerda() {
        return this.esquerda;
    }

    public void setDireita(Node direita) {
        this.direita = direita;
    }

    public Node getDireita() {
        return this.direita;
    }
}