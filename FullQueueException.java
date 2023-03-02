package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

public class FullQueueException extends Exception {

	public FullQueueException() {
		super();
	}
	
	public FullQueueException (String message) {
		super(message);
	}
	
}
