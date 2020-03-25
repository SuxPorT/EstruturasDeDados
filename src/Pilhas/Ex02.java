package Pilhas;

import Pilhas.Classes.ValidadorExpressao;

public class Ex02 {

    public static void main(String[] args) {
        String[] expressoes = {"(1+5)*(56+12)", "(1+5)*)56+12)", "(1+5)*[56+12)", "(((1+2) -3 )* 6)"};
        ValidadorExpressao validador = new ValidadorExpressao();

        for (int i = 0; i < expressoes.length; i++) {
            System.out.println("Resultado da expressão \"" + expressoes[i] + "\": "
                                + validador.resultado(expressoes[i]));
            System.out.println("Caracteres restantes: " + validador.mostrarPilha() + "\n");
        }
    }
}
