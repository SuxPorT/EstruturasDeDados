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
                valorA = this.primeiraFila.primeiro();
                valorB = this.segundaFila.primeiro();

                if (valorA <= valorB) {
                    this.resultado.insere(this.primeiraFila.remove());
                }
                else {
                    this.resultado.insere(this.segundaFila.remove());
                }
            }

            while (!this.segundaFila.vazia()) {
                this.resultado.insere(this.segundaFila.remove());
            }
        }
        else {
            while (!this.segundaFila.vazia()) {
                valorA = this.primeiraFila.primeiro();
                valorB = this.segundaFila.primeiro();

                if (valorA <= valorB) {
                    this.resultado.insere(this.primeiraFila.remove());
                }
                else {
                    this.resultado.insere(this.segundaFila.remove());
                }
            }

            while (!this.primeiraFila.vazia()) {
                this.resultado.insere(this.primeiraFila.remove());
            }
        }
    }

    public String imprime() {
        return this.resultado.imprime();
    }

    // Método auxiliar
    public int getTamanho() {
        return this.tamanho;
    }
}