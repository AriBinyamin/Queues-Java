package queues;

/*
Ariel Binyaminov
T00499483
12/8/2022
*/

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListQueue_TESTS {
	
	@Test
	public void LinkedListBasedQueueWithEverythingRemovedHasCountZero() throws Exception {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Orange");
		queue.enqueue("Melon");
		queue.dequeue();
		queue.dequeue();
		assertEquals(0, queue.length());
	}
	
	@Test
	public void LinkedListBasedQueueWithOneItemHasCountOne() throws FullQueueException {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Apple");
		assertEquals(1, queue.length());
	}
	
	@Test
	public void LinkedListBasedQueueIsNotFullAfterAddingOneElem() throws FullQueueException {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Apple");
		assertFalse(queue.isFull());
	}

	@Test
	public void LinkedListBasedQueueWithFiveItemsHasCountFive() throws FullQueueException {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		queue.enqueue("Grape");
		assertEquals(5, queue.length());
	}

	@Test
	public void AfterAddingLinkedListBasedQueueIsNotEmpty() throws FullQueueException {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Apple");
		assertFalse(queue.isEmpty());
	}

	@Test
	public void NewLinkedListBasedQueueIsEmpty() {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		assertTrue(queue.isEmpty());
	}

	@Test
	public void DequeueInLinkedListBasedQueueGivesCorrectElem() throws Exception {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Apple");
		queue.enqueue("Pear");
		assertEquals("Apple", queue.dequeue());
	}
	
	@Test
	public void CantDequeuOnEmptyList() throws Exception {
		FIFOQueueInterface<String> queue = new LinkedListBasedQueue<String>();
		queue.enqueue("Apple");
		queue.dequeue();
		assertThrows(EmptyQueueException.class,()-> {
			queue.dequeue();
		});
	}
	
}
