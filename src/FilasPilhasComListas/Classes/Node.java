package FilasPilhasComListas.Classes;

public class Node {
    private Integer informacao;
    private Node proximo;

    public Node(Integer informacao) {
        this.informacao = informacao;
        this.proximo = null;
    }

    public void setInformacao(Integer informacao) {
        this.informacao = informacao;
    }

    public Integer getInformacao() {
        return this.informacao;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getProximo() {
        return this.proximo;
    }
}