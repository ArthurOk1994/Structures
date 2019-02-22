package com.examples.stack;

import com.examples.interfaces.Seeable;
import com.examples.stack.onArray.StackArray;
import com.examples.stack.onLinkList.StackLinkList;

public class StringFromStack implements Seeable {
	
	private String input;							// input string
//----------------------------------------------------------------------------------	
	public StringFromStack(String in) {				// constructor
		input = in;
	}
//----------------------------------------------------------------------------------
	@Override
	public String seeString(String baseForStructure) {	// flip string
		
		int stackSize;								// stack size
		stackSize = input.length();					// equals length of input string
		StackArray theStackAr = new StackArray(stackSize); // create stack based on array 
		StackLinkList theStackLL = new StackLinkList();	   // create stack based on one-sided linked list
		
		for(int i = 0; i < stackSize; i ++) {			
			char ch = input.charAt(i);				// character-by-character reading
			theStackAr.push(ch);					// and 	put in the stack based on array
			theStackLL.push(ch);					// and 	put in the stack based on one-sided linked list
		}

		String flipStr = "";						// output string
		switch (baseForStructure) {
			case "array":
				while(!theStackAr.isEmpty())				// if stack isn't empty
					flipStr = flipStr + theStackAr.pop();	// add to output string symbol from stack
				break;
			case "linked list"	:
				while(!theStackLL.isEmpty()) 				// if stack isn't empty
					flipStr = flipStr + theStackLL.pop();	// add to output string symbol from stack
				break;
			default:
				throw new RuntimeException("base for structure " + baseForStructure + " is unknown");
		}
		return flipStr;								
	}
//----------------------------------------------------------------------------------	
}