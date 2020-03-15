package Vetores.Classes;

public class Aluno {
    private String nome;
    private int telefone;

    public Aluno(String nome, int telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public int getTelefone() {
        return this.telefone;
    }
}
