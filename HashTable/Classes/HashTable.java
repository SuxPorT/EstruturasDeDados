package HashTable.Classes;

public class HashTable {
    private int collisions;
    private NodeTable[] rows;

    public HashTable(int capacity) {
        this.collisions = 0;
        this.rows = new NodeTable[capacity];
        this.initialize();
        this.fill();
    }

    private void initialize() {
        for (int i = 0; i < this.rows.length; i++) {
            this.rows[i] = new NodeTable(-1);
        }
    }

    private void fill() {
        int counter = 0, maxElements = (int) (this.rows.length * 0.9);

        while (counter++ < maxElements) {
            this.insere((int) (Math.random() * 1000000));
        }
    }

    private int hash(int key) {
        return key % this.rows.length;
    }

    public void insere(int key) {
        int indice = this.hash(key);
        NodeTable row = this.rows[indice];

        if (row.getInformation() != -1) {
            this.collisions++;
        }

        row.insert(key);
    }

    public void print() {
        for (int i = 0; i < this.rows.length; i++) {
            System.out.println(i + "    " + this.rows[i].getInformation() + "    " + this.rows[i].toString());
        }
    }

    public boolean search(int key) {
        int index = this.hash(key);
        NodeTable row = this.rows[index];

        if (row.getInformation() == key) {
            return true;
        }
        else {
            return row.search(key);
        }
    }

    public int getCollisions() {
        return this.collisions;
    }
}