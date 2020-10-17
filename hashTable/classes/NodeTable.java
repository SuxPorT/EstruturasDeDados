package hashTable.classes;

public class NodeTable {
    private int information;
    private LinkedList list;

    public NodeTable(int information) {
        this.information = information;
        this.list = null;
    }

    public int getInformation() {
        return this.information;
    }

    public void insert(int information) {
        if (this.information == -1) {
            this.information = information;
            this.list = new LinkedList();
        }
        else {
            this.list.insertLast(information);
        }
    }

    public boolean search(int key) {
        if (this.list != null && !this.list.empty()) {
            Node node = this.list.getNode();
            boolean loop = true;

            while (loop) {
                if (node == null) {
                    loop = false;
                }
                else {
                    if (node.getInformation() == key) {
                        return true;
                    }
                    else {
                        node = node.getNextNode();
                    }
                }
            }

            return false;
        }

        return false;
    }

    @Override
    public String toString() {
        if (this.list != null) {
            return this.list.toString();
        }

        return "    [ ]";
    }
}