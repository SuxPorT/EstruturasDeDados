package Stack.Classes;

public class ExpressionValidator {
    private CharacterStack characterStack;

    public boolean result(String expression) {
        this.characterStack = new CharacterStack(expression);
        this.stack(expression);

        return this.characterStack.empty();
    }

    public void stack(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    this.characterStack.insert(expression.charAt(i));
                    break;
                case ')':
                case '}':
                case ']':
                    this.characterStack.remove(expression.charAt(i));
                    break;
                default:
                    break;
            }
        }
    }

    public String print() {
        return this.characterStack.toString();
    }
}