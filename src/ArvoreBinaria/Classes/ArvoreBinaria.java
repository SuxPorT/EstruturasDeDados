package ArvoreBinaria.Classes;

public class ArvoreBinaria {
    public Node raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    // Métodos auxiliares
    private boolean vazia() {
        return this.raiz == null;
    }

    // Métodos privados
    private void inserirElemento(Node raiz, int elemento) {
       if (elemento < raiz.getInfo()) {
           if (raiz.getEsquerda() == null) {
               raiz.setEsquerda(new Node(elemento));
           }
           else {
               this.inserirElemento(raiz.getEsquerda(), elemento);
           }
       }
       else {
           if (raiz.getDireita() == null) {
               raiz.setDireita(new Node(elemento));
           }
           else {
               this.inserirElemento(raiz.getDireita(), elemento);
           }
       }
    }

    private void preOrdem(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.getInfo() + " ");
            this.preOrdem(raiz.getEsquerda());
            this.preOrdem(raiz.getDireita());
        }
    }

    private void inOrdem(Node raiz) {
        if (raiz != null) {
            this.inOrdem(raiz.getEsquerda());
            System.out.print(raiz.getInfo() + " ");
            this.inOrdem(raiz.getDireita());
        }
    }

    private void posOrdem(Node raiz) {
        if (raiz != null) {
            this.posOrdem(raiz.getEsquerda());
            this.posOrdem(raiz.getDireita());
            System.out.print(raiz.getInfo() + " ");
        }
    }

    private Node maiorElemento(Node raiz) {
        Node maiorNode = raiz.getDireita();

        if (maiorNode != null) {
            if (maiorNode.getDireita() == null) {
                if (maiorNode.getEsquerda() == null) {
                    raiz.setDireita(null);
                } else {
                    raiz.setDireita(maiorNode.getEsquerda());
                }

                return maiorNode;
            }

            return this.maiorElemento(maiorNode);
        }

        return raiz;
    }

    private Node menorElemento(Node raiz) {
        Node menorNode = raiz.getEsquerda();

        if (menorNode != null) {
            if (menorNode.getEsquerda() == null) {
                if (menorNode.getDireita() == null) {
                    raiz.setEsquerda(null);
                } else {
                    raiz.setEsquerda(menorNode.getDireita());
                }

                return menorNode;
            }

            return this.menorElemento(menorNode);
        }

        return null;
    }

    private Node remove(Node nodeFilho, Node nodePai, int elemento) {
        if (nodeFilho != null) {
            if (nodeFilho.getInfo() != elemento) {
                if (elemento >= nodeFilho.getInfo()) {
                    return this.remove(nodeFilho.getDireita(), nodeFilho, elemento);
                }

                return this.remove(nodeFilho.getEsquerda(), nodeFilho, elemento);
            }
            else {
                boolean isNodeDireito = nodeFilho.getInfo() >= nodePai.getInfo();

                if (nodeFilho.getEsquerda() == null && nodeFilho.getDireita() == null) {
                    if (isNodeDireito) {
                        nodePai.setDireita(null);
                    }
                    else {
                        nodePai.setEsquerda(null);
                    }
                }
                else if (nodeFilho.getEsquerda() == null && nodeFilho.getDireita() != null) {
                    if (isNodeDireito) {
                        nodePai.setDireita(nodeFilho.getDireita());
                    }
                    else {
                        nodePai.setEsquerda(nodeFilho.getDireita());
                    }
                }
                else if (nodeFilho.getEsquerda() != null && nodeFilho.getDireita() == null) {
                    if (isNodeDireito) {
                        nodePai.setDireita(nodeFilho.getEsquerda());
                    }
                    else {
                        nodePai.setEsquerda(nodeFilho.getEsquerda());
                    }
                }
                else {
                    Node maiorNode = this.maiorElemento(nodeFilho.getDireita());

                    if (isNodeDireito) {
                        nodePai.setDireita(maiorNode);
                    }
                    else {
                        nodePai.setEsquerda(maiorNode);
                    }

                    maiorNode.setEsquerda(nodeFilho.getEsquerda());
                }

                return nodeFilho;
            }
        }

        return null;
    }

    // Métodos públicos
    public void inserirElemento(int elemento) {
        if (this.vazia()) {
            this.raiz = new Node(elemento);
        }
        else {
            this.inserirElemento(this.raiz, elemento);
        }
    }

    public void preOrdem() {
        this.preOrdem(this.raiz);
    }

    public void inOrdem() {
        this.inOrdem(this.raiz);
    }

    public void posOrdem() {
        this.posOrdem(this.raiz);
    }

    public Node maiorElemento() {
        if (!this.vazia()) {
            if (this.raiz.getDireita() == null) {
                Node nodeRaiz = this.raiz;
                this.raiz = this.raiz.getEsquerda();

                return nodeRaiz;
            }

            return this.maiorElemento(this.raiz);
        }

        return null;
    }

    public Node menorElemento() {
        if (!this.vazia()) {
            if (this.raiz.getEsquerda() == null) {
                Node nodeRaiz = this.raiz;
                this.raiz = this.raiz.getDireita();

                return nodeRaiz;
            }

            return this.menorElemento(this.raiz);
        }

        return null;
    }

    public Node remove(int elemento) {
        if (!this.vazia()) {
            Node nodeRaiz = this.raiz;

            if (this.raiz.getInfo() != elemento) {
                return this.remove(nodeRaiz, null, elemento);
            }
            else {
                if (nodeRaiz.getEsquerda() == null && nodeRaiz.getDireita() == null) {
                    this.raiz = null;

                    return nodeRaiz;
                }
                else if (nodeRaiz.getEsquerda() == null && nodeRaiz.getDireita() != null) {
                    if (elemento >= nodeRaiz.getDireita().getInfo()) {
                        this.raiz = this.raiz.getDireita();

                        return nodeRaiz;
                    }
                }
                else if (nodeRaiz.getEsquerda() != null && nodeRaiz.getDireita() == null) {
                    if (elemento < nodeRaiz.getEsquerda().getInfo()) {
                        this.raiz = this.raiz.getEsquerda();

                        return nodeRaiz;
                    }
                }
                else {
                    if (elemento >= nodeRaiz.getDireita().getInfo()) {
                        return this.remove(nodeRaiz.getDireita(), nodeRaiz, elemento);
                    }
                    else {
                        return this.remove(nodeRaiz.getEsquerda(), nodeRaiz, elemento);
                    }
                }

                return null;
            }
        }

        return null;
    }
}