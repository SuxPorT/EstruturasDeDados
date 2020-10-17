package queue.classes;

public class Merge {
    private final Queue firstQueue, secondQueue;
    private Queue result;
    public int length;         // Variável auxiliar

    public Merge(Queue firstQueue, Queue secondQueue) {
        this.firstQueue = firstQueue;
        this.secondQueue = secondQueue;
        this.setLength();
        this.merge();
    }

    private void setLength() {
        this.length = this.firstQueue.length + this.secondQueue.length;
        this.result = new Queue(this.length);
    }

    private void merge() {
        int valueA, valueB;

        if (this.firstQueue.length <= this.secondQueue.length) {
            while (!this.firstQueue.empty()) {
                valueA = this.firstQueue.first();
                valueB = this.secondQueue.first();

                if (valueA <= valueB) {
                    this.result.insert(this.firstQueue.remove());
                }
                else {
                    this.result.insert(this.secondQueue.remove());
                }
            }

            while (!this.secondQueue.empty()) {
                this.result.insert(this.secondQueue.remove());
            }
        }
        else {
            while (!this.secondQueue.empty()) {
                valueA = this.firstQueue.first();
                valueB = this.secondQueue.first();

                if (valueA <= valueB) {
                    this.result.insert(this.firstQueue.remove());
                }
                else {
                    this.result.insert(this.secondQueue.remove());
                }
            }

            while (!this.firstQueue.empty()) {
                this.result.insert(this.firstQueue.remove());
            }
        }
    }

    @Override
    public String toString() {
        return this.result.toString();
    }
}