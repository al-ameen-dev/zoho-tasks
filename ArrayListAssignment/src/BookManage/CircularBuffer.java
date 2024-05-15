package BookManage;

import java.util.ArrayList;

/*
Create a class implementing a circular buffer using an ArrayList of Strings for a messaging service.
This buffer should have a fixed size and overwrite the oldest element when full.
 */
public class CircularBuffer {
    private ArrayList<String> buffer;
    private int capacity;
    private int head;
    private int tail;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        this.buffer = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            buffer.add(null);
        }
        this.head = 0;
        this.tail = 0;
    }

    public void add(String element) {
        buffer.set(tail, element);
        tail = (tail + 1) % capacity;
        if (tail == head) {
            head = (head + 1) % capacity;
        }
    }

    public String remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Buffer is empty");
        }
        String element = buffer.get(head);
        buffer.set(head, null);
        head = (head + 1) % capacity;
        return element;
    }

    public boolean isEmpty() {
        return head == tail && buffer.get(head) == null;
    }

    public int size() {
        if (head <= tail) {
            return tail - head;
        } else {
            return capacity - head + tail;
        }
    }

    public void display() {
        int index = head;
        while (index != tail) {
            System.out.println(buffer.get(index) + " ");
            index = (index + 1) % capacity;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer(5);
        circularBuffer.add("hi");
        circularBuffer.add("what are you doing");
        circularBuffer.add("eating");
        circularBuffer.display();
        circularBuffer.remove();
        circularBuffer.add("eat slowly");
        circularBuffer.add("Ok");
        circularBuffer.add("bye!");
        circularBuffer.add("See you tomorrow");
        circularBuffer.display();
    }
}

