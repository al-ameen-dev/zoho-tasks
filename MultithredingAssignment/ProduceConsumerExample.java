package assignment;

import java.util.LinkedList;

/*
Simple Producer-Consumer (Thread Communication):
Create two threads: a producer and a consumer.
The producer adds items to a shared buffer (e.g., an array).
The consumer removes items from the buffer and processes them.
Implement synchronization (e.g., wait-notify) to ensure the consumer doesn't access empty buffers and the producer doesn't overflow.
 */
public class ProduceConsumerExample {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;
    private int limit = 15;
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    wait();
                }
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                if(value==limit) {
                	System.out.println("The Producer thread exited successfully!");
                	return;
                }
                notify();

                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
    	int count = 0;
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait();
                }
                int value = buffer.removeFirst();
                count += 1;
                System.out.println("Consumer consumed: " + value);
                notify();
                if(count == limit) {
                	System.out.println("Consumer thread exited successfullY!");
                	return;
                }
                Thread.sleep(1000);
            }
        }
    }

    public static void main(String[] args) {
        ProduceConsumerExample example = new ProduceConsumerExample();
        Thread producerThread = new Thread(() -> {
            try {
                example.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                example.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        producerThread.start();
        consumerThread.start();
    }
}