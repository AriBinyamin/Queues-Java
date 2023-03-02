package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

public class EmptyQueueException extends Exception {
	
	public EmptyQueueException() {
		super();
	}
	
	public EmptyQueueException (String message) {
		super(message);
	}
	
}
