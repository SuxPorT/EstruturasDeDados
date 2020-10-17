package doublyLinkedList.classes;

public class Node {
    private Integer information;
    private Node previous, next;

    public Node(Integer information) {
        this.previous = null;
        this.information = information;
        this.next = null;
    }

    public Integer getInformation() {
        return this.information;
    }

    public Node getPrevious() {
        return this.previous;
    }

    public Node getNext() {
        return this.next;
    }

    public void setInformation(Integer information) {
        this.information = information;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}