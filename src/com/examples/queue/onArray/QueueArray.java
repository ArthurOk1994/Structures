package com.examples.queue.onArray;

public class QueueArray {
	
	private int sizeQueue;					// size of queue (array)
	private char[] queueArray;				// initialization of queue (array)
	private int front;						// start of queue
	private int rear;						// end of queue
	private int nElems;						// number of elem
//----------------------------------------------------------------------------------
	public QueueArray(int numberOfElems) {	// constructor
		sizeQueue = numberOfElems;			// size of queue
		queueArray = new char[sizeQueue];	// create queue
		front = 0;							
		rear = -1;
		nElems = 0;							// firstly queue is empty
	}
//----------------------------------------------------------------------------------	
	public void push(char sym) {			// put elem in rear of the queue
		queueArray[++rear] = sym;			// increment rear, insert symbol 
		nElems ++;							// increment number of elem
	}
//----------------------------------------------------------------------------------
	public char pop() {						// take elem from front of the queue
		nElems --;							// decrement elem
		return queueArray[front++];			// increment front, return symbol
	}
//----------------------------------------------------------------------------------	
	public boolean isEmpty() {				// true if queue is empty
		return (nElems == 0);
	}
//----------------------------------------------------------------------------------	
}