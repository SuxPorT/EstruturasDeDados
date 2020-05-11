package FilasPilhasComListas.Classes;

public class Fila {
    private ListaEncadeada dados;

    public Fila() {
        this.dados = new ListaEncadeada();
    }

    public void insere(int dado) {
        this.dados.insereUltimo(dado);
    }

    public int remove() {
        if (!this.vazia()) {
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
}