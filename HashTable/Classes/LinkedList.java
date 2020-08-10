package HashTable.Classes;

public class LinkedList {
    private Node list;

    public LinkedList() {
        this.list = null;
    }

    public boolean empty() {
        return this.list == null;
    }

    public void insert(int info) {
        Node node = new Node(info);
        node.setNextNode(this.list);
        this.list = node;
    }

    public void insertAfter(Node node, int information) {
        if (!this.empty()) {
            Node currentNode = this.list;
            boolean loop = true;

            while (loop) {
                if (currentNode.getInformation().equals(node.getInformation())) {
                    Node newNode = new Node(information);
                    newNode.setNextNode(currentNode.getNextNode());
                    currentNode.setNextNode(newNode);

                    loop = false;
                }

                if (currentNode.getNextNode() == null) {
                    loop = false;
                }

                currentNode = currentNode.getNextNode();
            }
        }
        else {
            this.first(information);
        }
    }

    public void insertLast(int information) {
        if (!this.empty()) {
            Node nodeAtual = this.list;
            boolean loop = true;

            while (loop) {
                if (nodeAtual.getNextNode() == null) {
                    Node novoNode = new Node(information);
                    nodeAtual.setNextNode(novoNode);

                    loop = false;
                }

                nodeAtual = nodeAtual.getNextNode();
            }
        }
        else {
            this.first(information);
        }
    }

    public void insertOrdered(int information) {
        if (!this.empty()) {
            if (this.isOrdered()) {
                Node currentNode = this.list, previousNode;
                boolean loop = true;

                while (loop) {
                    previousNode = currentNode;
                    currentNode = currentNode.getNextNode();

                    if (information <= previousNode.getInformation()) {
                        this.insert(information);

                        loop = false;
                    }
                    else if (previousNode.getInformation() <= information && currentNode.getInformation() >= information) {
                        Node node = new Node(information);
                        node.setNextNode(currentNode);
                        previousNode.setNextNode(node);

                        loop = false;
                    }

                    if (currentNode.getNextNode() == null) {
                        this.insertLast(information);

                        loop = false;
                    }
                }
            }
        }
        else {
            this.first(information);
        }
    }

    public Node removeFirst() {
        if (!this.empty()) {
            Node node = new Node(this.list.getInformation());
            node.setNextNode(this.list.getNextNode());
            this.list = this.list.getNextNode();

            return node;
        }

        return null;
    }

    public Node removeLast() {
        if (!this.empty()) {
            Node currentNode = this.list, previousNode = this.list;
            Node node = new Node(null);

            while (true) {
                if (currentNode.getNextNode() == null) {
                    node.setInformation(currentNode.getInformation());

                    if (previousNode == currentNode) {
                        this.list = null;
                    }
                    else {
                        previousNode.setNextNode(null);
                    }

                    return node;
                }
                else {
                    previousNode = currentNode;
                    currentNode = currentNode.getNextNode();
                }
            }
        }

        return null;
    }

    public Node remove(Node node) {
        if (!this.empty()) {
            Node currentNode = this.list, previousNode = this.list;

            while (currentNode != null) {
                if (currentNode.getInformation().equals(node.getInformation())) {
                    Node nodeRemovido = new Node(currentNode.getInformation());
                    nodeRemovido.setNextNode(currentNode.getNextNode());

                    if (previousNode == currentNode) {
                        this.list = this.list.getNextNode();
                    }
                    else {
                        previousNode.setNextNode(currentNode.getNextNode());
                    }

                    return nodeRemovido;
                }

                previousNode = currentNode;
                currentNode = currentNode.getNextNode();
            }
        }

        return null;
    }

    @Override
    public String toString() {
        if (!this.empty()) {
            Node node = this.list;
            String toString = "[";
            boolean loop = true;

            while (loop) {
                if (node.getNextNode() == null) {
                    toString += node.getInformation();
                    loop = false;
                }
                else {
                    toString += node.getInformation() + ", ";
                    node = node.getNextNode();
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
            Node node = this.list;
            int firstValue, secondValue;

            while (node.getNextNode() != null) {
                firstValue = node.getInformation();
                node = node.getNextNode();
                secondValue = node.getInformation();

                if (firstValue > secondValue) {
                    return false;
                }
            }
        }

        return true;
    }

    private void first(int information) {
        this.insert(information);
    }

    public Node getNode() {
        return this.list;
    }
}