package hashTable.classes;

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
            StringBuilder toString = new StringBuilder("[");
            Node node = this.list;
            boolean loop = true;

            while (loop) {
                if (node.getNextNode() == null) {
                    toString.append(node.getInformation());
                    loop = false;
                }
                else {
                    toString.append(node.getInformation()).append(", ");
                    node = node.getNextNode();
                }
            }

            toString.append("]");
            return toString.toString();
        }

        return "[ ]";
    }

    private void first(int information) {
        this.insert(information);
    }

    public Node getNode() {
        return this.list;
    }
}