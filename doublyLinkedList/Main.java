package doublyLinkedList;

import doublyLinkedList.classes.*;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        Node node = new Node(5);

        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(1);
        doublyLinkedList.insertFirst(3);

        // Lista encadeada: [3, 1, 2, 5]
        doublyLinkedListDetails(doublyLinkedList);

        doublyLinkedList.insertLast(6);
        doublyLinkedList.insertLast(4);
        doublyLinkedList.insertAfter(node, 0);

        // Lista encadeada: [3, 1, 2, 5, 0, 6, 4]
        doublyLinkedListDetails(doublyLinkedList);

        for (int i = 0; i < 4; i++) {
            System.out.println("Primeiro elemento: " + doublyLinkedList.removeFirst().getInformation());
        }

        // Lista encadeada: [0, 6, 4]
        doublyLinkedListDetails(doublyLinkedList);

        for (int i = 0; i < 3; i++) {
            System.out.println("Último elemento: " + doublyLinkedList.removeLast().getInformation());
        }

        // Lista encadeada: [ ]
        doublyLinkedListDetails(doublyLinkedList);

        doublyLinkedList.insertFirst(2);
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertFirst(1);

        // Lista encadeada: [1, 5, 2]
        doublyLinkedListDetails(doublyLinkedList);

        System.out.println("Elemento removido: " + doublyLinkedList.remove(node).getInformation());

        // Lista encadeada: [1, 2]
        doublyLinkedListDetails(doublyLinkedList);

        doublyLinkedList.insertOrdered(5);
        doublyLinkedList.insertOrdered(-2);
        doublyLinkedList.insertOrdered(0);
        doublyLinkedList.insertOrdered(3);

        // Lista encadeada: [-2, 0, 1, 2, 3, 5]
        doublyLinkedListDetails(doublyLinkedList);

        doublyLinkedList.insertLast(2);
        doublyLinkedList.insertOrdered(4);

        // Lista encadeada: [-2, 0, 1, 2, 3, 5, 2]
        doublyLinkedListDetails(doublyLinkedList);
    }

    public static void doublyLinkedListDetails(DoublyLinkedList lista) {
        System.out.println("Lista encadeada: " + lista.toString());
        System.out.println("Lista está ordenada: " + lista.isOrdered() + "\n");
    }
}
