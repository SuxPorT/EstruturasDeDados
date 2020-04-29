package ArvoreBinaria.Classes;

public class ArvoreBinaria {
    private Node raiz;

    public ArvoreBinaria(Node raiz) {
        this.raiz = raiz;
    }

    public void inserirElemento(Node raiz, Node elemento) {
        if (elemento.getInfo() >= raiz.getInfo()) {
            if (raiz.getDireita() == null) {
                raiz.setDireita(elemento);
            }
            else {
                inserirElemento(raiz.getDireita(), elemento);
            }
        }
        else {
            if (raiz.getEsquerda() == null) {
                raiz.setEsquerda(elemento);
            }
            else {
                inserirElemento(raiz.getEsquerda(), elemento);
            }
        }
    }

    public void preOrdem(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.getInfo() + " ");
            preOrdem(raiz.getEsquerda());
            preOrdem(raiz.getDireita());
        }
    }

    public void inOrdem(Node raiz) {
        if (raiz != null) {
            inOrdem(raiz.getEsquerda());
            System.out.print(raiz.getInfo() + " ");
            inOrdem(raiz.getDireita());
        }
    }

    public void posOrdem(Node raiz) {
        if (raiz != null) {
            posOrdem(raiz.getEsquerda());
            posOrdem(raiz.getDireita());
            System.out.print(raiz.getInfo() + " ");
        }
    }

    public Node maiorElemento(Node raiz) {
        Node nodeDireito = raiz.getDireita();

        if (nodeDireito == null) {

            return raiz;
        }

        return maiorElemento(nodeDireito);
    }

    public Node menorElemento(Node raiz) {
        Node nodeEsquerdo = raiz.getEsquerda();

        if (nodeEsquerdo == null) {
            return raiz;
        }

        return menorElemento(nodeEsquerdo);
    }

    public Node remove(Node raiz, Node elemento) {
        return null;
    }
}