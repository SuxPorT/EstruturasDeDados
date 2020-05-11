package FilasPilhasComListas.Classes;

public class Pilha {
    private ListaEncadeada dados;

    public Pilha() {
        this.dados = new ListaEncadeada();
    }

    public void empilha(int dado) {
        this.dados.insereUltimo(dado);
    }

    public int desempilha() {
        if (!this.vazia()) {
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
}