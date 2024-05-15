package BookManage;

import java.util.ArrayList;
import java.util.Random;

/*
Write a program that compares the performance of different operations on ArrayLists with different capacities and data access patterns (random access vs. sequential access)
 */
public class SequentialAccessAndRandomAccess {

	public static void main(String[] args) {
		final int[] capacities = { 1000, 10000, 100000 };
		final int[] elementsToAdd = { 1000, 10000, 100000 };

		System.out.println("Random Access Pattern:");
		for (int capacity : capacities) {
			for (int elements : elementsToAdd) {
				testRandomAccess(capacity, elements);
				System.out.println();
			}
		}

		System.out.println("\nSequential Access Pattern:");
		for (int capacity : capacities) {
			for (int elements : elementsToAdd) {
				testSequentialAccess(capacity, elements);
				System.out.println();
			}
		}
	}

	public static void testRandomAccess(int capacity, int elements) {
		ArrayList<Integer> arrayList = new ArrayList<>(capacity);
		Random random = new Random();

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < elements; i++) {
			arrayList.add(random.nextInt());
		}
		long insertionTime = System.currentTimeMillis() - startTime;


		startTime = System.currentTimeMillis();
		for (int i = 0; i < elements; i++) {
			arrayList.get(random.nextInt(elements));
		}
		long accessTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < elements; i++) {
			arrayList.remove(random.nextInt(arrayList.size()));
		}
		long deletionTime = System.currentTimeMillis() - startTime;

		System.out.println("Capacity: " + capacity + ", Elements: " + elements + ", Insertion Time: " + insertionTime
				+ " Ms, Access Time: " + accessTime + " Ms, Deletion Time: " + deletionTime + " Ms");
	}

	public static void testSequentialAccess(int capacity, int elements) {
		ArrayList<Integer> arrayList = new ArrayList<>(capacity);

		long startTime = System.currentTimeMillis();
		for (int i = 0; i < elements; i++) {
			arrayList.add(i);
		}
		long insertionTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < elements; i++) {
			arrayList.get(i);
		}
		long accessTime = System.currentTimeMillis() - startTime;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < elements; i++) {
			arrayList.remove(arrayList.size() - 1);
		}
		long deletionTime = System.currentTimeMillis() - startTime;

		System.out.println("Capacity: " + capacity + ", Elements: " + elements + ", Insertion Time: " + insertionTime
				+ " Ms, Access Time: " + accessTime + " Ms, Deletion Time: " + deletionTime + " Ms");
	}

}
