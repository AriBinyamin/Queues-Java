package queues;
/*
Ariel Binyaminov
T00499483
12/8/2022
*/
public class LinkedListBasedQueue<T> implements FIFOQueueInterface<T> {
	
	private DoublyNode<T> head;
	private DoublyNode<T> tail;
	private int count;
	
	@Override
	public void enqueue(T element) throws FullQueueException {
		DoublyNode<T> newNode = new DoublyNode<T>(element);
        DoublyNode<T> previousNode;
        DoublyNode<T> nextNode;
        
        if(head == null) {
        	head = newNode;
            tail = newNode;
            count++;
        }
        else {
            previousNode = tail;
            previousNode.setNextNode(newNode);
            newNode.setPreviousNode(previousNode);
            tail = newNode;
            count++;
       }
	}

	@Override
	public T dequeue() throws EmptyQueueException {
		if(head == null) {
			throw new EmptyQueueException();
		}
		else {
			DoublyNode<T> currentNode = head;
			if(count > 1) {
				head = currentNode.getNextNode();
				head.setPreviousNode(null);
			}
			else {
				head = null;
				tail = null;
			}
			count--;
			return currentNode.getData();
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
		return false;
	}
}