package HashTable.Classes;

public class Node {
    private Integer information;
    private Node nextNode;

    public Node(Integer information) {
        this.information = information;
        this.nextNode = null;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }

    public Integer getInformation() {
        return this.information;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public Node getNextNode() {
        return this.nextNode;
    }
}