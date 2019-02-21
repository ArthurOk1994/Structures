package com.examples.stack.onArray;

public class StackArray {
	
	private int sizeArray;						// size of stack (array)
	private char[] stackArray;					// initialization of stack (array)
	private int top;							// top of stack 
//----------------------------------------------------------------------------------	
	public StackArray(int numberOfElems) {		// constructor
		sizeArray = numberOfElems;				// size of stack
		stackArray = new char[sizeArray];		// create stack
		top = -1;								// firstly stack is empty
	}
//----------------------------------------------------------------------------------	
	public void push(char sym) {				// put elem in the stack
		stackArray[++top] = sym;				// increment top, insert elem
	}
//----------------------------------------------------------------------------------
	public char pop() {							// delete elem from the stack
		return stackArray[top--];				// decrement top, return elem
	}
//----------------------------------------------------------------------------------
	public boolean isEmpty() {					// true if stack is empty
		return (top == -1);
	}
//----------------------------------------------------------------------------------	
}