package Pilhas.Classes;

public class Pilha {
    private int topo;
    private int[] dados;
    private int MAX;

    public Pilha(int max) {
        this.topo = -1;
        this.MAX = max;
        this.dados = new int[max];
    }

    public int topo() {
        if (!this.vazia()) {
            return this.dados[this.topo];
        }

        return this.topo;
    }

    public boolean vazia() {
        return this.topo == -1;
    }

    public boolean cheia() {
        if (this.dados.length - 1 == this.topo) {
            return true;
        }

        return false;
    }

    public void empilha(int elemento) {
        if (!this.cheia()) {
            this.dados[++this.topo] = elemento;
        }
        else {
            System.out.println("Impossível empilhar elemento. A pilha está cheia");
        }
    }

    public int desempilha() {
        if (!this.vazia()) {
            int elemento = this.dados[this.topo];
            this.topo--;
            return elemento;
        }
        else {
            System.out.println("Impossível desempilhar. A pilha está vazia");
            return -1;
        }
    }

    public void cria_pilha(int n) {
        this.topo = -1;
        this.dados = new int[n];
        this.MAX = n;
    }

    @Override
    public String toString() {
        String toString;

        if (!this.vazia()) {
            toString = "[";
            for (int i = 0; i < this.topo; i++) {
                toString += this.dados[i] + ", ";
            }

            toString += this.dados[this.topo] + "]";
        }
        else {
            toString = "[]";
        }

        return toString;
    }
}
