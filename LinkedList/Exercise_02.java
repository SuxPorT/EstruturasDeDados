package LinkedList;

import LinkedList.Classes.Queue;
import LinkedList.Classes.Stack;

public class Exercise_02 {

    public static void main(String[] args) {
        Stack stack = new Stack();

        // Pilha: [ ]
        stackDetails(stack);

        for (int i = 1; i <= 3; i++) {
            stack.insert(i);
        }

        // Pilha: [1, 2, 3]
        stackDetails(stack);

        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento desempilhado: " + stack.remove());
        }

        // Valor inválido (-1)
        //Pilha: [ ]
        stackDetails(stack);

        Queue queue = new Queue();

        // Fila: [ ]
        queueDetails(queue);

        for (int i = 4; i <=7; i++) {
            queue.insert(i);
        }

        // Fila: [4, 5, 6, 7]
        queueDetails(queue);

        for (int i = 0; i < 4; i++) {
            System.out.println("Elemento desinfileirado: " + queue.remove());
        }

        // Fila: [ ]
        queueDetails(queue);

        // Valor inválido (-1)
        System.out.println("Elemento desinfileirado: " + queue.remove());
    }

    public static void stackDetails(Stack stack) {
        System.out.println("Topo da pilha: " + stack.top());
        System.out.println("Pilha está vazia: " + stack.empty());
        System.out.println("Pilha: " + stack.toString() + "\n");
    }

    public static void queueDetails(Queue queue) {
        System.out.println("Fila está vazia: " + queue.empty());
        System.out.println("Fila: " + queue.toString() + "\n");
    }
}