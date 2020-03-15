package Vetores;
import Vetores.Classes.Agenda;

public class Ex03 {
    public static void main(String[] args) {
        Agenda agendaTelefonica = new Agenda(100);

        for (int i = 0; i < 20; i++) {
            agendaTelefonica.adicionar("Aluno " + i, i * 11);
        }

        agendaTelefonica.listar();

        for (int i = 0; i < 5; i++) {
            agendaTelefonica.remover();
        }

        agendaTelefonica.listar();
    }
}
