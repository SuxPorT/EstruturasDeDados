package linkedList;

import linkedList.classes.LinkedList;
import linkedList.classes.Node;

public class Exercise_01 {
    
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node = new Node(5);

        linkedList.insertFirst(5);
        linkedList.insertFirst(2);
        linkedList.insertFirst(1);
        linkedList.insertFirst(3);

        // Lista encadeada: [3, 1, 2, 5]
        linkedListDetails(linkedList);

        linkedList.insertLast(6);
        linkedList.insertLast(4);
        linkedList.insertAfter(node, 0);

        // Lista encadeada: [3, 1, 2, 5, 0, 6, 4]
        linkedListDetails(linkedList);

        for (int i = 0; i < 4; i++) {
            System.out.println("Primeiro elemento: " + linkedList.removeFirst().getInformation());
        }

        // Lista encadeada: [0, 6, 4]
        linkedListDetails(linkedList);

        for (int i = 0; i < 3; i++) {
            System.out.println("Último elemento: " + linkedList.removeLast().getInformation());
        }

        // Lista encadeada: [ ]
        linkedListDetails(linkedList);

        linkedList.insertFirst(2);
        linkedList.insertFirst(5);
        linkedList.insertFirst(1);

        // Lista encadeada: [1, 5, 2]
        linkedListDetails(linkedList);

        System.out.println("Elemento removido: " + linkedList.remove(node).getInformation());

        // Lista encadeada: [1, 2]
        linkedListDetails(linkedList);

        linkedList.insertOrdered(5);
        linkedList.insertOrdered(-2);
        linkedList.insertOrdered(0);
        linkedList.insertOrdered(3);

        // Lista encadeada: [-2, 0, 1, 2, 3, 5]
        linkedListDetails(linkedList);

        linkedList.insertLast(2);
        linkedList.insertOrdered(4);

        // Lista encadeada: [-2, 0, 1, 2, 3, 5, 2]
        linkedListDetails(linkedList);
    }

    public static void linkedListDetails(LinkedList linkedList) {
        System.out.println("Lista encadeada: " + linkedList.toString());
        System.out.println("Lista está ordenada: " + linkedList.isOrdered() + "\n");
    }
}