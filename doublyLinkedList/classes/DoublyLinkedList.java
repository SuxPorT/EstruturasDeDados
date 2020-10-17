package doublyLinkedList.classes;

public class DoublyLinkedList {
    private Node nodeList;

    public DoublyLinkedList() {
        this.nodeList = null;
    }

    public boolean empty() {
        return this.nodeList == null;
    }

    public void insertFirst(int information) {
        Node first = new Node(information);
        first.setNext(this.nodeList);

        if (!this.empty()) {
            this.nodeList.setPrevious(first);
        }

        this.nodeList = first;
    }

    public void insertAfter(Node node, int information) {
        if (!this.empty()) {
            Node current = this.nodeList;
            boolean loop = true;

            while (loop) {
                if (current.getInformation().equals(node.getInformation())) {
                    Node newNode = new Node(information);
                    newNode.setNext(current.getNext());

                    if (current.getNext() != null) {
                        current.getNext().setPrevious(newNode);
                    }

                    current.setNext(newNode);
                    newNode.setPrevious(current);

                    loop = false;
                }

                if (current.getNext() == null) {
                    loop = false;
                }

                current = current.getNext();
            }
        }
        else {
            this.firstNode(information);
        }
    }

    public void insertLast(int information) {
        if (!this.empty()) {
            Node current = this.nodeList;
            boolean loop = true;

            while (loop) {
                if (current.getNext() == null) {
                    Node newNode = new Node(information);
                    current.setNext(newNode);
                    newNode.setPrevious(current);

                    loop = false;
                }

                current = current.getNext();
            }
        }
        else {
            this.firstNode(information);
        }
    }

    public void insertOrdered(int information) {
        if (!this.empty()) {
            if (this.isOrdered()) {
                Node current = this.nodeList;
                Node previous;
                boolean loop = true;

                while (loop) {
                    previous = current;
                    current = current.getNext();

                    if (information <= previous.getInformation()) {
                        this.insertFirst(information);

                        loop = false;
                    }
                    else if (previous.getInformation() <= information && current.getInformation() >= information) {
                        Node ordered = new Node(information);
                        ordered.setNext(current);
                        current.setPrevious(ordered);
                        previous.setPrevious(previous);
                        previous.setNext(ordered);

                        loop = false;
                    }

                    if (current.getNext() == null) {
                        this.insertLast(information);

                        loop = false;
                    }
                }
            }
            else {
                System.out.println("Lista duplamente encadeada não está ordenada. Impossível inserir o elemento " + information);
            }
        }
        else {
            this.firstNode(information);
        }
    }

    public Node removeFirst() {
        if (!this.empty()) {
            Node first = new Node(this.nodeList.getInformation());
            first.setNext(this.nodeList.getNext());

            if (this.nodeList.getNext() != null) {
                this.nodeList.getNext().setPrevious(null);
            }

            this.nodeList = this.nodeList.getNext();

            return first;
        }

        return null;
    }

    public Node removeLast() {
        if (!this.empty()) {
            Node current = this.nodeList;
            Node previous = this.nodeList;
            Node last = new Node(null);

            while (true) {
                if (current.getNext() == null) {
                    last.setInformation(current.getInformation());
                    last.setPrevious(current.getPrevious());

                    if (previous == current) {
                        this.nodeList = null;
                    }
                    else {
                        previous.setNext(null);
                        current.setPrevious(null);
                    }

                    return last;
                }
                else {
                    previous = current;
                    current = current.getNext();
                }
            }
        }

        return null;
    }

    public Node remove(Node node) {
        if (!this.empty()) {
            Node current = this.nodeList;
            Node previous = this.nodeList;

            while (current != null) {
                if (current.getInformation().equals(node.getInformation())) {
                    Node removed = new Node(current.getInformation());
                    removed.setNext(current.getNext());
                    removed.setPrevious(current.getPrevious());

                    if (previous == current) {
                        this.nodeList = this.nodeList.getNext();

                        if (this.nodeList != null) {
                            this.nodeList.getPrevious().setNext(null);
                            this.nodeList.setPrevious(null);
                        }
                    }
                    else {
                        previous.setNext(current.getNext());
                        current.setPrevious(null);

                        if (current.getNext() != null) {
                            current.getNext().setPrevious(previous);
                            current.setNext(null);
                        }
                    }

                    return removed;
                }

                previous = current;
                current = current.getNext();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        if (!this.empty()) {
            StringBuilder toString = new StringBuilder("[");
            Node current = this.nodeList;
            boolean loop = true;

            while (loop) {
                if (current.getNext() == null) {
                    toString.append(current.getInformation());
                    loop = false;
                }
                else {
                    toString.append(current.getInformation()).append(", ");
                    current = current.getNext();
                }
            }

            toString.append("]");
            return toString.toString();
        }

        return "[ ]";
    }

    // Métodos auxiliares
    public boolean isOrdered() {
        if (!this.empty()) {
            Node current = this.nodeList;
            int firstValue, secondValue;

            while (current.getNext() != null) {
                firstValue = current.getInformation();
                current = current.getNext();
                secondValue = current.getInformation();

                if (firstValue > secondValue) {
                    return false;
                }
            }
        }

        return true;
    }

    private void firstNode(int information) {
        System.out.println("Lista duplamente encadeada está vazia. Armazenando o elemento " + information +
                           " na primeira posição");
        this.insertFirst(information);
    }
}
