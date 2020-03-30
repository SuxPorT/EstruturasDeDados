package ListasEncadeadas.Classes;

public class ListaEncadeada {
    private Node lista;

    public ListaEncadeada() {
        this.lista = null;
    }

    public boolean vazia() {
        return this.lista == null;
    }

    public void inserePrimeiro(int info) {
        if (this.vazia()) {
            this.lista = new Node();
            this.lista.setInformacao(info);
            this.lista.setProximo(null);
        }
        else {
            Node primeiroNode = new Node();

            primeiroNode.setInformacao(info);
            primeiroNode.setProximo(this.lista);
            this.lista = primeiroNode;
        }
    }

    public void insereDepois(Node node, int info) {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;

            while (true) {
                if (nodeAtual.getInformacao().equals(node.getInformacao())) {
                    Node novoNode = new Node();

                    novoNode.setInformacao(info);
                    novoNode.setProximo(nodeAtual.getProximo());
                    nodeAtual.setProximo(novoNode);

                    break;
                }

                if (nodeAtual.getProximo() == null) {
                    System.out.println("Node com o elemento " + node.getInformacao() + " não encontrado");
                    break;
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

            while (true) {
                if (nodeAtual.getProximo() == null) {
                    Node novoNode = new Node();

                    novoNode.setInformacao(info);
                    nodeAtual.setProximo(novoNode);

                    break;
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

                while (true) {
                    nodeAnterior = nodeAtual;
                    nodeAtual = nodeAtual.getProximo();

                    if (info <= nodeAnterior.getInformacao()) {
                        this.inserePrimeiro(info);

                        break;
                    }
                    else if (nodeAnterior.getInformacao() <= info && nodeAtual.getInformacao() >= info) {
                        Node nodeOrdenado = new Node();

                        nodeOrdenado.setInformacao(info);
                        nodeOrdenado.setProximo(nodeAtual);
                        nodeAnterior.setProximo(nodeOrdenado);

                        break;
                    }

                    if (nodeAtual.getProximo() == null) {
                        this.insereUltimo(info);

                        break;
                    }
                }
            }
            else {
                System.out.println("Lista encadeada não está ordenada. Impossível inserir o elemento " + info);
            }
        }
        else {
            this.primeiroNode(info);
        }
    }

    public Node removePrimeiro() {
        if (!this.vazia()) {
            Node primeiroNode = new Node();

            primeiroNode.setInformacao(this.lista.getInformacao());
            primeiroNode.setProximo(this.lista.getProximo());
            this.lista = this.lista.getProximo();

            return primeiroNode;
        }

        return null;
    }

    public Node removeUltimo() {
        if (!this.vazia()) {
            Node nodeAtual = this.lista;
            Node nodeAnterior = this.lista;
            Node ultimoNode = new Node();

            while (true) {
                if (nodeAtual.getProximo() == null) {
                    ultimoNode.setInformacao(nodeAtual.getInformacao());

                    if (nodeAnterior == nodeAtual) {
                        this.lista = null;
                    }
                    else {
                        nodeAnterior.setProximo(null);
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

            while (true) {
                if (nodeAtual.getInformacao().equals(no.getInformacao())) {
                    Node nodeRemovido = new Node();

                    nodeRemovido.setInformacao(nodeAtual.getInformacao());
                    nodeRemovido.setProximo(nodeAtual.getProximo());

                    if (nodeAnterior == nodeAtual) {
                        this.lista = this.lista.getProximo();
                    }
                    else {
                        nodeAnterior.setProximo(nodeAtual.getProximo());
                    }

                    return nodeRemovido;
                }

                if (nodeAtual.getProximo() == null) {
                    break;
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

            while (true) {
                if (nodeAtual.getProximo() == null) {
                    resultado += nodeAtual.getInformacao();
                    break;
                }

                resultado += nodeAtual.getInformacao() + ", ";
                nodeAtual = nodeAtual.getProximo();
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

            while (true) {
                if (nodeAtual.getProximo() == null) {
                    break;
                }

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
        System.out.println("Lista encadeada está vazia. Armazenando o elemento " + informacao + " na primeira posição");
        this.inserePrimeiro(informacao);
    }
}