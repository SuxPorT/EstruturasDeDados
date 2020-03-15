package Vetores.Classes;

import java.util.Arrays;

public class Agenda {
    private Aluno[] listaAlunos;
    private int contador, capacidade;

    public Agenda(int capacidade) {
        this.capacidade = capacidade;
        this.listaAlunos = new Aluno[capacidade];
        this.contador = 0;
    }

    public void adicionar(String nome, int telefone) {
        this.listaAlunos[contador++] = new Aluno(nome, telefone);
    }

    public void remover() {
        this.listaAlunos[contador--] = null;
    }

    public void listar() {
        for (int i = 0; i < this.contador; i++) {
            System.out.println("Nome: " + this.listaAlunos[i].getNome());
            System.out.println("Telefone: " + this.listaAlunos[i].getTelefone() + "\n");
        }
    }
}
