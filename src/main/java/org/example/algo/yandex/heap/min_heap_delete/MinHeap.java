package org.example.algo.yandex.heap.min_heap_delete;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE; // Sentinel
    }

    private int parent(int pos) { return pos / 2; }
    private int leftChild(int pos) { return 2 * pos; }
    private int rightChild(int pos) { return 2 * pos + 1; }
    private boolean isLeaf(int pos) { return pos > size / 2 && pos <= size; }

    private void swap(int fpos, int spos) {
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    private void heapifyUp(int pos) {
        while (pos > 1 && heap[pos] < heap[parent(pos)]) {
            swap(pos, parent(pos));
            pos = parent(pos);
        }
    }

    private void heapifyDown(int pos) {
        if (isLeaf(pos)) return;

        int left = leftChild(pos);
        int right = rightChild(pos);
        int smallest = pos;

        if (left <= size && heap[left] < heap[smallest])
            smallest = left;

        if (right <= size && heap[right] < heap[smallest])
            smallest = right;

        if (smallest != pos) {
            swap(pos, smallest);
            heapifyDown(smallest);
        }
    }

    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full");
            return;
        }
        heap[++size] = element;
        heapifyUp(size);
    }

    public int deleteMin() {
        if (size == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];  // Move last element to root
        heapifyDown(FRONT);
        return popped;
    }

    public void printHeap() {
        System.out.println("Min Heap:");
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("Parent: " + heap[i]);
            if (leftChild(i) <= size)
                System.out.print(" | Left: " + heap[leftChild(i)]);
            if (rightChild(i) <= size)
                System.out.print(" | Right: " + heap[rightChild(i)]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(15);
        minHeap.insert(5);
        minHeap.insert(20);
        minHeap.insert(3);
        minHeap.insert(17);

        minHeap.printHeap();

        System.out.println("\nDeleted min: " + minHeap.deleteMin());
        minHeap.printHeap();
    }
}

