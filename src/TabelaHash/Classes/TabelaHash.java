package TabelaHash.Classes;

public class TabelaHash {
    private int colisao;
    private NodeTabela[] tabela;

    public TabelaHash(int tamanho) {
        this.colisao = 0;
        this.tabela = new NodeTabela[tamanho];
        this.inicializarTabela();
        this.preencherTabela();
    }

    private void inicializarTabela() {
        for (int i = 0; i < this.tabela.length; i++) {
            this.tabela[i] = new NodeTabela(-1);
        }
    }

    private void preencherTabela() {
        int contador = 0, maximoElementos = (int) (this.tabela.length * 0.9);

        while (contador++ < maximoElementos) {
            this.insere((int) (Math.random() * 1000000));
        }
    }

    private int hash(int chave) {
        return chave % this.tabela.length;
    }

    public void insere(int chave) {
        int indice = this.hash(chave);
        NodeTabela linhaTabela = this.tabela[indice];

        if (linhaTabela.getInformacao() != -1) {
            this.colisao++;
        }

        linhaTabela.insere(chave);
    }

    public void imprimir() {
        for (int i = 0; i < this.tabela.length; i++) {
            System.out.println(i + "    " + this.tabela[i].getInformacao() + "    " + this.tabela[i].imprimir());
        }
    }

    public boolean busca(int chave) {
        int indice = this.hash(chave);
        NodeTabela linhaTabela = this.tabela[indice];

        if (linhaTabela.getInformacao() == chave) {
            return true;
        }
        else {
            return linhaTabela.busca(chave);
        }
    }

    public int colisoes() {
        return this.colisao;
    }
}