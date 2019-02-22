package com.examples.stack.onLinkList;

public class StackLinkList {
	
	private OSLinkList theLinkList;			// reference to the one-sided linked list
//----------------------------------------------------------------------------------		
	public StackLinkList() {				// constructor
		theLinkList = new OSLinkList();		// create one-sided linked list
	}
//----------------------------------------------------------------------------------
	public void push(char sym) {			// put elem on the top of stack
		theLinkList.insertFirst(sym);
	}
//----------------------------------------------------------------------------------
	public char pop() {						// delete last added elem from the stack
		return theLinkList.deleteFirst();
	}
//----------------------------------------------------------------------------------
	public boolean isEmpty() {				// true if stack is empty
		return(theLinkList.isEmpty());
	}
//----------------------------------------------------------------------------------
	public void displayStack() {			// display what's inside the stack
		theLinkList.displayList();
	}
//----------------------------------------------------------------------------------
}