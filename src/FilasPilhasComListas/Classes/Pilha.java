package FilasPilhasComListas.Classes;

public class Pilha {
    private ListaEncadeada dados;
    private int tamanho;         	// Variável auxiliar

    public Pilha() {
        this.dados = new ListaEncadeada();
        this.tamanho = 0;
    }

    public void empilha(int dado) {
        this.dados.insereUltimo(dado);
        this.tamanho++;
    }

    public int desempilha() {
        if (!this.vazia()) {
            this.tamanho--;
            return this.dados.removeUltimo().getInformacao();
        }

        // Valor inválido
        return -1;
    }

    public int topo() {
        if (!this.vazia()) {
            Node topo = this.dados.removeUltimo();
            this.dados.insereUltimo(topo.getInformacao());

            return topo.getInformacao();
        }

        // Valor inválido
        return -1;
    }

    public String mostra_pilha() {
        return this.dados.imprimir();
    }

    // Métodos auxiliares
    public boolean vazia() {
        return this.dados.vazia();
    }

    public int tamanho() {
        return this.tamanho;
    }
}