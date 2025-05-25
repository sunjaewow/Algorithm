package algorithm;

class IntQueue {
    private int max;
    private int front;

    private int rear;

    private int num;

    private int[] que;

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {

        }
    }

    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        } catch (OutOfMemoryError error) {
            max = 0;
        }
    }

    public int enque(int x) {
        if (num >= max) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == max) {
            rear = 0;
        }
        return x;
    }

    public int deque() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == max) {
            front = 0;
        }
        return x;
    }

    public int peek() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (front + i) % max;
            if (que[idx] == x) {
                return idx;
            }
        }
        return -1;
    }

    public void clear() {
        front = num = rear = 0;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= max;
    }



}