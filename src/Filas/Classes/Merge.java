package Filas.Classes;

public class Merge {
    private Fila resultado;
    private Fila primeiraFila;
    private Fila segundaFila;
    public int tamanho;         // Variável auxiliar

    public Merge(Fila primeiraFila, Fila segundaFila) {
        this.primeiraFila = primeiraFila;
        this.segundaFila = segundaFila;
        this.setTamanho();
        this.mergeFilas();
        this.organizaResultado();
    }

    public String imprime() {
        return this.resultado.imprime();
    }

    private void setTamanho() {
        this.tamanho = this.primeiraFila.tamanho + this.segundaFila.tamanho;
        this.resultado = new Fila(this.tamanho);
    }

    private void mergeFilas() {
        int valorA;
        int valorB;

        if (this.primeiraFila.tamanho <= this.segundaFila.tamanho) {
            while (!this.primeiraFila.vazia()) {
                valorA = this.primeiraFila.remove();
                valorB = this.segundaFila.remove();

                if (valorA <= valorB) {
                    this.resultado.insere(valorA);
                    this.resultado.insere(valorB);
                }
                else {
                    this.resultado.insere(valorB);
                    this.resultado.insere(valorA);
                }
            }

            while (!this.segundaFila.vazia()) {
                this.resultado.insere(this.segundaFila.remove());
            }
        }
        else {
            while (!this.segundaFila.vazia()) {
                valorA = this.primeiraFila.remove();
                valorB = this.segundaFila.remove();

                if (valorA <= valorB) {
                    this.resultado.insere(valorA);
                    this.resultado.insere(valorB);
                }
                else {
                    this.resultado.insere(valorB);
                    this.resultado.insere(valorA);
                }
            }

            while (!this.primeiraFila.vazia()) {
                this.resultado.insere(this.primeiraFila.remove());
            }
        }
    }

    private void organizaResultado() {
        int dados[] = new int[this.tamanho];

        for (int i = 0; i < this.tamanho; i++) {
            dados[i] = this.resultado.remove();
        }

        for (int i = 0; i < this.tamanho - 1; i++) {
            for (int j = i + 1; j < this.tamanho; j++) {
                if (dados[i] > dados[j]) {
                    int troca = dados[i];
                    dados[i] = dados[j];
                    dados[j] = troca;
                }
            }
        }

        for (int i = 0; i < this.tamanho; i++) {
            this.resultado.insere(dados[i]);
        }
    }
}