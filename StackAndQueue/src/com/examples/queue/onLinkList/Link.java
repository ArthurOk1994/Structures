package com.examples.queue.onLinkList;

public class Link {						// object of elem of the list
	
	public char data;					// data 
	public Link next;					// reference to the next elem in the linked list
//----------------------------------------------------------------------------------		
	public Link(char data) {			// constructor
		this.data = data;
	}
//----------------------------------------------------------------------------------
	public void displayLink() {			
		System.out.print(data);			// output data
	}	
//----------------------------------------------------------------------------------	
}