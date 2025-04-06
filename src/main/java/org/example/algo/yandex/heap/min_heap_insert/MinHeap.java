package org.example.algo.yandex.heap.min_heap_insert;

public class MinHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE; // Sentinel value for comparisons
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return pos * 2;
    }

    private int rightChild(int pos) {
        return (pos * 2) + 1;
    }

    private boolean isLeaf(int pos) {
        return (pos > size / 2) && (pos <= size);
    }

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

    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full");
            return;
        }
        heap[++size] = element;
        heapifyUp(size);
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

    // Main method to test it
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(15);
        minHeap.insert(5);
        minHeap.insert(20);
        minHeap.insert(3);
        minHeap.insert(17);

        minHeap.printHeap();
    }
}
