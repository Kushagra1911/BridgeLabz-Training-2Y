class CircularBuffer {
    int[] buffer;
    int size, index = 0;

    CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    void add(int x) {
        buffer[index] = x;
        index = (index + 1) % size;
    }

    void print() {
        for (int i : buffer) System.out.print(i + " ");
    }
}
