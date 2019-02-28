package com.examples.queue.onLinkList;

public class QueueLinkList {
	
	private DSLinkList theLinkList;			// reference to the double-sided linked list
//----------------------------------------------------------------------------------
	public QueueLinkList() {				// constructor
		theLinkList = new DSLinkList();		// create double-sided linked list
	}
//----------------------------------------------------------------------------------
	public void push(char sym) {			// put elem to the end of the queue
		theLinkList.insertLast(sym);
	}
//----------------------------------------------------------------------------------
	public char pop() {						// delete first elem from the queue
		return theLinkList.deleteFirst();
	}
//----------------------------------------------------------------------------------
	public boolean isEmpty() {				// true if queue is empty
		return theLinkList.isEmpty();
	}
//----------------------------------------------------------------------------------
	public void displayQueue() {			// display what's inside the queue
		theLinkList.displayList();
	}
//----------------------------------------------------------------------------------
}