package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayBasedQueue_TESTS {

	@Test
	public void ArrayBasedQueueWithEverythingRemovedHasCountZero() throws Exception {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Orange");
		queue.enqueue("Melon");
		queue.dequeue();
		queue.dequeue();
		assertEquals(0, queue.length());
	}

	@Test
	public void ArrayBasedQueueWithOneItemHasCountOne() throws FullQueueException {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		assertEquals(1, queue.length());
	}

	@Test
	public void ArrayBasedQueueWithFiveItemsHasCountFive() throws FullQueueException {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		assertEquals(5, queue.length());
	}

	@Test
	public void AfterAddingArrayBasedQueueIsNotEmpty() throws FullQueueException {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		assertFalse(queue.isEmpty());
	}

	@Test
	public void ArrayBasedQueueIsNotFullAfterAddingOneElem() throws FullQueueException {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		assertFalse(queue.isFull());
	}

	@Test
	public void NewArrayBasedQueueIsEmpty() {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		assertTrue(queue.isEmpty());
	}

	@Test
	public void DequeueInArrayBasedQueueGivesCorrectElem() throws Exception {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		queue.enqueue("Pear");
		assertEquals("Apple", queue.dequeue());
	}
	
	@Test
	public void ArrayBasedQueueIsleftEmptyAfterAddingAndRemoving() throws Exception {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		queue.enqueue("Pear");
		queue.enqueue("banana");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		assertTrue(queue.isEmpty());
	}
	
	@Test
	public void ArrayBasedQueueHasCorrectLengthAndCountAfterAddingAndRemoving() throws Exception {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		queue.enqueue("Pear");
		queue.enqueue("banana");
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		assertEquals(0, queue.length());
	}	
	
	@Test
	public void CantDequeuOnEmptyList() throws Exception {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		queue.enqueue("Apple");
		queue.dequeue();
		assertThrows(EmptyQueueException.class,()-> {
			queue.dequeue();
		});
	}
	
	@Test
	public void ArrayBasedQueueThrowsExceptionWhenQueueIsFull() throws FullQueueException {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		for(int i = 0; i < 100; i++) {
			queue.enqueue("Apple");
		}
		assertThrows(FullQueueException.class,()-> {
			queue.enqueue("Apple");
		});
	}	
	
	@Test
	public void ArrayBasedQueueIsFull() throws FullQueueException {
		FIFOQueueInterface<String> queue = new ArrayBasedQueue<String>();
		for(int i = 0; i < 100; i++) {
			queue.enqueue("Apple");
		}
		assertTrue(queue.isFull());
	}	
}
