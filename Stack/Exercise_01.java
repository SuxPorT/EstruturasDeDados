package Stack;

import Stack.Classes.Stack;

public class Exercise_01 {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stackDetails(stack);

        stack.insert(1);
        stack.insert(2);
        stackDetails(stack);

        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        stackDetails(stack);

        System.out.println("Elemento desempilhado: " + stack.remove());
        stack.insert(6);
        stackDetails(stack);

        stack.insert(7);
        stackDetails(stack);

        stack.createStack(10);
        stackDetails(stack);
    }

    public static void stackDetails(Stack stack) {
        System.out.println("Pilha vazia: " + stack.empty());
        System.out.println("Pilha cheia: " + stack.full());
        System.out.println("Topo da pilha: " + stack.top());
        System.out.println("Elementos da pilha: " + stack.toString() + "\n");
    }
}
