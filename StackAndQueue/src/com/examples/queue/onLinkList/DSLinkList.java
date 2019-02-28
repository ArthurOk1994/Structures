package com.examples.queue.onLinkList;

import com.examples.stack.onLinkList.Link;

public class DSLinkList {				// double-sided linked list
	
	private Link first;					// reference on the first elem in the linked list
	private Link last;					// reference on the last elem in the linked list
//----------------------------------------------------------------------------------
	public DSLinkList() {				// constructor
		first = null;
		last = null;
	}
//----------------------------------------------------------------------------------
	public void insertLast(char sym) {	// put elem in the end of the linked list
		Link newLink = new Link(sym);	// create new elem
		if(isEmpty())					// if linked list empty
			first = newLink; 			// first --> reference to the new elem
		else
			last.next = newLink;		// old meaning last --> newLink
		last = newLink;					// new last --> newLink (new last.next --> null)
	}
//----------------------------------------------------------------------------------	
	public char deleteFirst() {			// get first elem
		char temp = first.data;			// save received data
		if(first.next == null)			// if one elem in the linked list
			last = null;				// last --> null (no more elems in the linked list)
		first = first.next;				// first --> reference to the second elem
		return temp;					// return received data
	}
//----------------------------------------------------------------------------------
	public boolean isEmpty() {			// true if list is empty
		return (first == null);
	}
//----------------------------------------------------------------------------------
	public void displayList() {
		Link current = first;			// move from start linked list
		while(current != null) {		
			current.displayLink();		// print current elem
			current = current.next;		// move to the next elem
		}
	}
}