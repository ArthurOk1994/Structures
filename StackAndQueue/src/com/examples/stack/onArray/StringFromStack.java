package com.examples.stack.onArray;

import com.examples.interfaces.Seeable;

public class StringFromStack implements Seeable {
	
	private String input;						// input string
//----------------------------------------------------------------------------------	
	public StringFromStack(String in) {			// constructor
		input = in;
	}
//----------------------------------------------------------------------------------
	@Override
	public String seeString() {						// flip string
		
		int stackSize;								// stack size
		stackSize = input.length();					// equals length of input string
		StackArray theStack = new StackArray(stackSize); // create stack
		
		for(int i = 0; i < stackSize; i ++) {			
			char ch = input.charAt(i);				// character-by-character reading
			theStack.push(ch);						// and 	put in stack
		}
		
		String flipStr = "";						// output string
		while(!theStack.isEmpty())					// if stack isn't empty
			flipStr = flipStr + theStack.pop();		// add to output string symbol from stack
		
		return flipStr;								
	}
//----------------------------------------------------------------------------------	
}