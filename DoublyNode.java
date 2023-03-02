package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

public class DoublyNode<T> {

	private T data;
	private DoublyNode<T> nextNode;
	private DoublyNode<T> previousNode;


	public DoublyNode(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setNextNode(DoublyNode<T> next) {
		this.nextNode = next;
	}

	public DoublyNode<T> getNextNode() {
		return nextNode;
	}
	
	public void setPreviousNode(DoublyNode<T> prev) {
		this.previousNode = prev;
	}

	public DoublyNode<T> getPreviousNode() {
		return previousNode;
	}
	
}
