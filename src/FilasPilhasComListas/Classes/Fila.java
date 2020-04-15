package FilasPilhasComListas.Classes;

public class Fila {
    private ListaEncadeada dados;
    private int tamanho;            // Variável auxiliar

    public Fila() {
        this.dados = new ListaEncadeada();
        this.tamanho = 0;
    }

    public void insere(int dado) {
        this.dados.insereUltimo(dado);
        this.tamanho++;
    }

    public int remove() {
        if (!this.vazia()) {
            this.tamanho--;
            return this.dados.removePrimeiro().getInformacao();
        }

        // Valor inválido
        return -1;
    }

    public String mostra_fila() {
        return this.dados.imprimir();
    }

    // Métodos auxiliarex
    public boolean vazia() {
        return this.dados.vazia();
    }

    public int tamanho() {
        return this.tamanho;
    }
}