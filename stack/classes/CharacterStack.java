package stack.classes;

public class CharacterStack {
    private final char[] characters;
    private int top;

    public CharacterStack(String expression) {
        this.top = -1;
        this.characters = new char[expression.length() / 2];
    }

    public boolean empty() {
        return this.top == -1;
    }

    public void insert(char character) {
        this.characters[++this.top] = character;
    }

    public void remove(char character) {
        if (!this.empty()) {
            if (this.characters[this.top] == '(' && character == ')') {
                this.top--;
            }
            else if (this.characters[this.top] == '{' && character == '}') {
                this.top--;
            }
            else if (this.characters[this.top] == '[' && character == ']') {
                this.top--;
            }
            else {
                this.insert(character);
            }
        }
        else {
            this.insert(character);
        }
    }

    // Método auxiliar
    @Override
    public String toString() {
        StringBuilder toString;

        if (!this.empty()) {
            toString = new StringBuilder("[ ");
            for (int i = 0; i < this.top; i++) {
                toString.append(this.characters[i]).append(", ");
            }

            toString.append(this.characters[this.top]).append(" ]");
        }
        else {
            toString = new StringBuilder("[ ]");
        }

        return toString.toString();
    }
}