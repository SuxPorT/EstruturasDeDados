package ListaDuplamenteEncadeada.Classes;

public class Node {
    private Integer informacao;
    private Node anterior;
    private Node proximo;

    public Node(Integer informacao) {
        this.anterior = null;
        this.informacao = informacao;
        this.proximo = null;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public Integer getInformacao() {
        return this.informacao;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    public Node getAnterior() {
        return this.anterior;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getProximo() {
        return this.proximo;
    }
}