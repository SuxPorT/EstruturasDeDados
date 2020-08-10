package Stack;

import Stack.Classes.ExpressionValidator;

public class Exercise_02 {

    public static void main(String[] args) {
        String[] expressions = {"(1+5)*(56+12)", "(1+5)*)56+12)", "(1+5)*[56+12)", "(((1+2) -3 )* 6)"};
        ExpressionValidator validator = new ExpressionValidator();

        for (String expression : expressions) {
            System.out.println("Resultado da expressão \"" + expression + "\": " + validator.result(expression));
            System.out.println("Caracteres restantes: " + validator.print() + "\n");
        }
    }
}