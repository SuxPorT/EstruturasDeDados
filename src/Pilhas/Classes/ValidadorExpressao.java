package Pilhas.Classes;

public class ValidadorExpressao {
    private PilhaCaracteres pilha;

    public boolean resultado(String expressao) {
        this.pilha = new PilhaCaracteres(expressao);

        this.empilhamento(expressao);

        if (this.pilha.vazia()) {
            return true;
        }

        return false;
    }

    public void empilhamento(String expressao) {
        for (int i = 0; i < expressao.length(); i++) {
            switch (expressao.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    this.pilha.empilha(expressao.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    this.pilha.desempilha(expressao.charAt(i));
                    break;
                default:
                    break;
            }
        }
    }

    public String mostrarPilha() {
        return this.pilha.toString();
    }
}
