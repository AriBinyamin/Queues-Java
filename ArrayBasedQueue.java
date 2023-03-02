package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

public class ArrayBasedQueue<T> implements FIFOQueueInterface<T> {

	private int front = 0;
	private int end = 0;
	private int count = 0;

	private T[] arrayQ = (T[]) new Object[100];
	
	@Override
	public void enqueue(T element) throws FullQueueException {
		if(count < arrayQ.length) {
			arrayQ[end] = element;
            end = (end + 1) % arrayQ.length;
            count++;
        }
		else{
			throw new FullQueueException();
		}
	}

	@Override
	public T dequeue() throws EmptyQueueException {
		 if (count > 0) {
             T valueToReturn = arrayQ[front];
             front = (front + 1) % arrayQ.length;
             count--;
             return valueToReturn;
         } else {
             throw new EmptyQueueException();
         }
     }

	@Override
	public int length() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public boolean isFull() {
		return count >= 100;
	}
}