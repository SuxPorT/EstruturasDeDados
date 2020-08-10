package Stack.Classes;

public class CharacterStack {
    private int top;
    private char[] characters;

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
        String toString;

        if (!this.empty()) {
            toString = "[ ";
            for (int i = 0; i < this.top; i++) {
                toString += this.characters[i] + ", ";
            }

            toString += this.characters[this.top] + " ]";
        }
        else {
            toString = "[ ]";
        }

        return toString;
    }
}