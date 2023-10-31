package org.learning.heap;

public class MaxHeap {

    private final int[] data;

    private int size;

    private final int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;

        this.data = new int[maxSize + 1];
        data[0] = Integer.MAX_VALUE;
    }

    public void insert(int value) {
        if (size > maxSize) return;

        data[++size] = value;
        int current = size;

        while(data[parentPosition(current)] < data[current]) {
            swapPositions(parentPosition(current), current);
            current = parentPosition(current);
        }
    }

    public int pop() {
        int pop = data[1];
        swapPositions(1, size--);
        int current = 1;

        while(!isLead(current)) {
            int biggestValuePos;
            if (rightPosition(current) <= size && data[rightPosition(current)] > data[leftPosition(current)]) {
                biggestValuePos = rightPosition(current);
            } else {
                biggestValuePos = leftPosition(current);
            }

            if (data[current] >= data[biggestValuePos]) {
                break;
            }
            swapPositions(current, biggestValuePos);
            current = biggestValuePos;
        }

        return pop;
    }

    public int peek() {
        return data[1];
    }

    private void maxHeapify(int[] values) {


    }

    private boolean isLead(int current) {
        return leftPosition(current) > size;
    }

    private int parentPosition(int leafPos) {
        return leafPos / 2;
    }

    private int rightPosition(int parentPos) {
        return (2 * parentPos) + 1;
    }

    private int leftPosition(int parentPos) {
        return (2 * parentPos);
    }

    private void swapPositions(int posA, int posB) {
        int temp = data[posA];
        data[posA] = data[posB];
        data[posB] = temp;
    }
}
