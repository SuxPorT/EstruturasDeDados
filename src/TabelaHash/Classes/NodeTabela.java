package TabelaHash.Classes;

public class NodeTabela {
    private int informacao;
    private ListaEncadeada lista;

    public NodeTabela(int informacao) {
        this.informacao = informacao;
        this.lista = null;
    }

    public int getInformacao() {
        return this.informacao;
    }

    public void insere(int informacao) {
        if (this.informacao == -1) {
            this.informacao = informacao;
            this.lista = new ListaEncadeada();
        }
        else {
            this.lista.insereUltimo(informacao);
        }
    }

    public boolean busca(int chave) {
        ListaEncadeada lista = this.lista;

        if (lista != null && !lista.vazia()) {
            Node node = lista.getNode();
            boolean loop = true;

            while (loop) {
                if (node == null) {
                    loop = false;
                }
                else {
                    if (node.getInformacao() == chave) {
                        loop = false;
                        return true;
                    }
                    else {
                        node = node.getProximo();
                    }
                }
            }
        }

        return false;
    }

    public String imprimir() {
        if (this.lista != null) {
            return this.lista.imprimir();
        }

        return "    [ ]";
    }
}