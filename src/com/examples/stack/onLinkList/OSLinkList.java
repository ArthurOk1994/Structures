package com.examples.stack.onLinkList;

public class OSLinkList {				// one-sided linked list
	
	private Link first;					// reference on the first elem in the linked list
//----------------------------------------------------------------------------------
	public OSLinkList() {					// constructor
		first = null;
	}
//----------------------------------------------------------------------------------
	public void insertFirst(char sym) {	// put elem in the start of the linked list
		Link newLink = new Link(sym);	// create new elem of list
		newLink.next = first;			// newLink --> old meaning first
		first = newLink;				// first --> newLink
	}
//----------------------------------------------------------------------------------	
	public char deleteFirst() {			// get first elem 
		char temp = first.data;			// save received data
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
//----------------------------------------------------------------------------------
}