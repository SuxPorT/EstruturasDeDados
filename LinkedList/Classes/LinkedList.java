package LinkedList.Classes;

public class LinkedList {
    private Node list;

    public LinkedList() {
        this.list = null;
    }

    public boolean empty() {
        return this.list == null;
    }

    public void insertFirst(int information) {
        Node first = new Node(information);
        first.setNextNode(this.list);
        this.list = first;
    }

    public void insertAfter(Node node, int information) {
        if (!this.empty()) {
            Node current = this.list;
            boolean loop = true;

            while (loop) {
                if (current.getInformation().equals(node.getInformation())) {
                    Node newNode = new Node(information);
                    newNode.setNextNode(current.getNextNode());
                    current.setNextNode(newNode);

                    loop = false;
                }

                if (current.getNextNode() == null) {
                    loop = false;
                }

                current = current.getNextNode();
            }
        }
        else {
            this.firstNode(information);
        }
    }

    public void insertLast(int information) {
        if (!this.empty()) {
            Node current = this.list;
            boolean loop = true;

            while (loop) {
                if (current.getNextNode() == null) {
                    Node newNode = new Node(information);
                    current.setNextNode(newNode);

                    loop = false;
                }

                current = current.getNextNode();
            }
        }
        else {
            this.firstNode(information);
        }
    }

    public void insertOrdered(int information) {
        if (!this.empty()) {
            if (this.isOrdered()) {
                Node current = this.list, previous;
                boolean loop = true;

                while (loop) {
                    previous = current;
                    current = current.getNextNode();

                    if (information <= previous.getInformation()) {
                        this.insertFirst(information);

                        loop = false;
                    }
                    else if (previous.getInformation() <= information && current.getInformation() >= information) {
                        Node ordered = new Node(information);
                        ordered.setNextNode(current);
                        previous.setNextNode(ordered);

                        loop = false;
                    }

                    if (current.getNextNode() == null) {
                        this.insertLast(information);

                        loop = false;
                    }
                }
            }
            else {
                System.out.println("Lista encadeada não está ordenada. Impossível inserir o elemento " + information);
            }
        }
        else {
            this.firstNode(information);
        }
    }

    public Node removeFirst() {
        if (!this.empty()) {
            Node first = new Node(this.list.getInformation());
            first.setNextNode(this.list.getNextNode());
            this.list = this.list.getNextNode();

            return first;
        }

        return null;
    }

    public Node removeLast() {
        if (!this.empty()) {
            Node current = this.list, previous = this.list;
            Node last = new Node(null);

            while (true) {
                if (current.getNextNode() == null) {
                    last.setInformation(current.getInformation());

                    if (previous == current) {
                        this.list = null;
                    }
                    else {
                        previous.setNextNode(null);
                    }

                    return last;
                }
                else {
                    previous = current;
                    current = current.getNextNode();
                }
            }
        }

        return null;
    }

    public Node remove(Node node) {
        if (!this.empty()) {
            Node current = this.list, previous = this.list;

            while (current != null) {
                if (current.getInformation().equals(node.getInformation())) {
                    Node removed = new Node(current.getInformation());
                    removed.setNextNode(current.getNextNode());

                    if (previous == current) {
                        this.list = this.list.getNextNode();
                    }
                    else {
                        previous.setNextNode(current.getNextNode());
                    }

                    return removed;
                }

                previous = current;
                current = current.getNextNode();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        if (!this.empty()) {
            Node current = this.list;
            String toString = "[";
            boolean loop = true;

            while (loop) {
                if (current.getNextNode() == null) {
                    toString += current.getInformation();
                    loop = false;
                }
                else {
                    toString += current.getInformation() + ", ";
                    current = current.getNextNode();
                }
            }

            toString += "]";
            return toString;
        }

        return "[ ]";
    }

    // Métodos auxiliares
    public boolean isOrdered() {
        if (!this.empty()) {
            Node current = this.list;
            int firstValue, secondValue;

            while (current.getNextNode() != null) {
                firstValue = current.getInformation();
                current = current.getNextNode();
                secondValue = current.getInformation();

                if (firstValue > secondValue) {
                    return false;
                }
            }
        }

        return true;
    }

    private void firstNode(int information) {
        System.out.println("Lista encadeada está vazia. Armazenando o elemento " + information + " na primeira posição");
        this.insertFirst(information);
    }
}