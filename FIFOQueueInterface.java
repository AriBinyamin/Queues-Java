package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

public interface FIFOQueueInterface<T> {
	
	void enqueue(T element) throws FullQueueException;
	T dequeue() throws EmptyQueueException;
	int length();
	boolean isEmpty();
	boolean isFull();
	
}
