package ListaDuplamenteEncadeada.Classes;

public class ListaDuplamenteEncadeada {
    private Node lista;

    public ListaDuplamenteEncadeada() {
        this.lista = null;
    }

    public boolean vazia() {
        return this.lista == null;
    }

    public void inserePrimeiro(int info) {
        Node primeiroNode = new Node(info);
        primeiroNode.setProximo(this.lista);

        if (!this.vazia()) {
            this.lista.setAnterior(primeiroNode);
        }

        this.lista = primeiroNode;
    }

    public void insereDepois(Node node, int info) {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            boolean loop = true;

            while (loop) {
                if (nodeAtual.getInformacao().equals(node.getInformacao())) {
                    Node novoNode = new Node(info);
                    novoNode.setProximo(nodeAtual.getProximo());

                    if (nodeAtual.getProximo() != null) {
                        nodeAtual.getProximo().setAnterior(novoNode);
                    }

                    nodeAtual.setProximo(novoNode);
                    novoNode.setAnterior(nodeAtual);

                    loop = false;
                }

                if (nodeAtual.getProximo() == null) {
                    loop = false;
                }

                nodeAtual = nodeAtual.getProximo();
            }
        }
        else {
            this.primeiroNode(info);
        }
    }

    public void insereUltimo(int info) {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            boolean loop = true;

            while (loop) {
                if (nodeAtual.getProximo() == null) {
                    Node novoNode = new Node(info);
                    nodeAtual.setProximo(novoNode);
                    novoNode.setAnterior(nodeAtual);

                    loop = false;
                }

                nodeAtual = nodeAtual.getProximo();
            }
        }
        else {
            this.primeiroNode(info);
        }
    }

    public void insereOrdenado(int info) {
        if (!this.vazia()) {
            if (this.isOrdenada()) {
                Node nodeAtual = this.lista;
                Node nodeAnterior;
                boolean loop = true;

                while (loop) {
                    nodeAnterior = nodeAtual;
                    nodeAtual = nodeAtual.getProximo();

                    if (info <= nodeAnterior.getInformacao()) {
                        this.inserePrimeiro(info);

                        loop = false;
                    }
                    else if (nodeAnterior.getInformacao() <= info && nodeAtual.getInformacao() >= info) {
                        Node nodeOrdenado = new Node(info);
                        nodeOrdenado.setProximo(nodeAtual);
                        nodeAtual.setAnterior(nodeOrdenado);
                        nodeAnterior.setAnterior(nodeAnterior);
                        nodeAnterior.setProximo(nodeOrdenado);

                        loop = false;
                    }

                    if (nodeAtual.getProximo() == null) {
                        this.insereUltimo(info);

                        loop = false;
                    }
                }
            }
            else {
                System.out.println("Lista duplamente encadeada não está ordenada. Impossível inserir o elemento " + info);
            }
        }
        else {
            this.primeiroNode(info);
        }
    }

    public Node removePrimeiro() {
        if (!this.vazia()) {
            Node primeiroNode = new Node(this.lista.getInformacao());
            primeiroNode.setProximo(this.lista.getProximo());

            if (this.lista.getProximo() != null) {
                this.lista.getProximo().setAnterior(null);
            }

            this.lista = this.lista.getProximo();

            return primeiroNode;
        }

        return null;
    }

    public Node removeUltimo() {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            Node nodeAnterior = this.lista;
            Node ultimoNode = new Node(null);

            while (true) {
                if (nodeAtual.getProximo() == null) {
                    ultimoNode.setInformacao(nodeAtual.getInformacao());
                    ultimoNode.setAnterior(nodeAtual.getAnterior());

                    if (nodeAnterior == nodeAtual) {
                        this.lista = null;
                    }
                    else {
                        nodeAnterior.setProximo(null);
                        nodeAtual.setAnterior(null);
                    }

                    return ultimoNode;
                }
                else {
                    nodeAnterior = nodeAtual;
                    nodeAtual = nodeAtual.getProximo();
                }
            }
        }

        return null;
    }

    public Node remove(Node no) {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            Node nodeAnterior = this.lista;

            while (nodeAtual != null) {
                if (nodeAtual.getInformacao().equals(no.getInformacao())) {
                    Node nodeRemovido = new Node(nodeAtual.getInformacao());
                    nodeRemovido.setProximo(nodeAtual.getProximo());
                    nodeRemovido.setAnterior(nodeAtual.getAnterior());

                    if (nodeAnterior == nodeAtual) {
                        this.lista = this.lista.getProximo();

                        if (this.lista != null) {
                            this.lista.getAnterior().setProximo(null);
                            this.lista.setAnterior(null);
                        }
                    }
                    else {
                        nodeAnterior.setProximo(nodeAtual.getProximo());
                        nodeAtual.setAnterior(null);

                        if (nodeAtual.getProximo() != null) {
                            nodeAtual.getProximo().setAnterior(nodeAnterior);
                            nodeAtual.setProximo(null);
                        }
                    }

                    return nodeRemovido;
                }

                nodeAnterior = nodeAtual;
                nodeAtual = nodeAtual.getProximo();
            }
        }

        return null;
    }

    public String imprimir() {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            String resultado = "[";
            boolean loop = true;

            while (loop) {
                if (nodeAtual.getProximo() == null) {
                    resultado += nodeAtual.getInformacao();
                    loop = false;
                }
                else {
                    resultado += nodeAtual.getInformacao() + ", ";
                    nodeAtual = nodeAtual.getProximo();
                }
            }

            resultado += "]";
            return resultado;
        }

        return "[ ]";
    }

    // Métodos auxiliares
    public boolean isOrdenada() {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            int primeiroValor;
            int segundoValor;

            while (nodeAtual.getProximo() != null) {
                primeiroValor = nodeAtual.getInformacao();
                nodeAtual = nodeAtual.getProximo();
                segundoValor = nodeAtual.getInformacao();

                if (primeiroValor > segundoValor) {
                    return false;
                }
            }
        }

        return true;
    }

    private void primeiroNode(int informacao) {
        System.out.println("Lista duplamente encadeada está vazia. Armazenando o elemento " + informacao + " na primeira posição");
        this.inserePrimeiro(informacao);
    }
}
