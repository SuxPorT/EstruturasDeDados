package linkedList.classes;

public class Node {
    private Integer information;
    private Node nextNode;

    public Node(Integer information) {
        this.information = information;
        this.nextNode = null;
    }

    public Integer getInformation() {
        return this.information;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }
}