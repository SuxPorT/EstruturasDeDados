package Pilhas.Classes;

public class PilhaCaracteres {
    private int topo;
    private char caracteres[];

    public PilhaCaracteres(String expressao) {
        this.topo = -1;
        this.caracteres = new char[expressao.length() / 2];
    }

    public boolean vazia() {
        return this.topo == -1;
    }

    public void empilha(char caractere) {
        this.caracteres[++this.topo] = caractere;
    }

    public void desempilha(char caractere) {
        if (!this.vazia()) {
            if (this.caracteres[this.topo] == '(' && caractere == ')') {
                this.topo--;
            } else if (this.caracteres[this.topo] == '{' && caractere == '}') {
                this.topo--;
            } else if (this.caracteres[this.topo] == '[' && caractere == ']') {
                this.topo--;
            }
            else {
                empilha(caractere);
            }
        }
        else {
            this.empilha(caractere);
        }
    }

    @Override
    public String toString() {
        String toString;

        if (!this.vazia()) {
            toString = "[";
            for (int i = 0; i < this.topo; i++) {
                toString += this.caracteres[i] + ", ";
            }

            toString += this.caracteres[this.topo] + "]";
        }
        else {
            toString = "[]";
        }

        return toString;
    }
}
