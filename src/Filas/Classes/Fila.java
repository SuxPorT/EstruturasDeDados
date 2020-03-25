package Filas.Classes;

public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    public int tamanho;     // Variável auxiliar

    public Fila(int capacidade) {
        this.primeiro = -1;
        this.ultimo = -1;
        this.dados = new int[capacidade];
        this.tamanho = this.dados.length;
    }

    public boolean cheia() {
        if ((this.primeiro == 0 && this.ultimo == this.tamanho - 1)
             || (this.primeiro == this.ultimo + 1)) {
            return true;
        }

        return false;
    }

    public boolean vazia() {
        return this.primeiro == -1;
    }

    public void insere(int e) {
        if (!this.cheia()) {
            if (this.ultimo == this.tamanho - 1) {
                this.ultimo = -1;
            }
            this.dados[++ultimo] = e;

            if (this.vazia()) {
                this.primeiro++;
            }
        }
        else {
            System.out.println("Fila está cheia. Impossível adicionar o elemento " + e);
        }
    }

    public int remove() {
        if (!this.vazia()) {
            int elemento = this.dados[this.primeiro];
            this.dados[this.primeiro++] = 0;

            if (this.primeiro == this.tamanho && this.ultimo == this.tamanho - 1) {
                this.primeiro = -1;
                this.ultimo = -1;
            }

            if (this.primeiro > this.tamanho - 1) {
                this.primeiro = 0;
            }

            return elemento;
        }
        else {
            System.out.println("Fila está vazia. Impossível remover o primeiro elemento");
            return -1;
        }
    }

    public String imprime() {
        String resultado = "[";

        if (!this.vazia()) {

            if (this.primeiro < this.ultimo) {
                for (int i = this.primeiro; i < this.ultimo; i++) {
                    resultado += this.dados[i] + ", ";
                }
                resultado += this.dados[this.ultimo];
            }
            else if (this.primeiro == this.ultimo) {
                resultado += this.dados[this.ultimo];
            }
            else {
                for (int i = 0; i <= this.ultimo; i++) {
                    resultado += this.dados[i] + ", ";
                }
                for (int i = this.primeiro; i < this.tamanho - 1; i++) {
                    resultado += this.dados[i] + ", ";
                }
                resultado += this.dados[this.dados.length - 1];
            }
        }

        resultado += "]";
        return resultado;
    }

    public void inicializa(int n) {
        this.primeiro = -1;
        this.ultimo = -1;
        this.dados = new int[n];
        this.tamanho = this.dados.length;
    }
}