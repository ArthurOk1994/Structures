package com.examples.queue;

import com.examples.interfaces.Seeable;
import com.examples.queue.onArray.QueueArray;
import com.examples.queue.onLinkList.QueueLinkList;

public class StringFromQueue implements Seeable {

	private String input;							// input string
//----------------------------------------------------------------------------------
	public StringFromQueue(String in) {				// constructor
		input = in;
	}
//----------------------------------------------------------------------------------
	@Override
	public String seeString(String baseForStructure) { // output string
		
		int queueSize;								// size of queue
		queueSize = input.length();					// equals length of input string
		QueueArray theQueueAr = new QueueArray(queueSize);	// create queue based on array 
		QueueLinkList theQueueLL = new QueueLinkList();		// create queue based on double-sided linked list 
		
		for(int i = 0; i < queueSize; i ++) {			
			char ch = input.charAt(i);				// character-by-character reading
			theQueueAr.push(ch);					// and 	put in queue based on array
			theQueueLL.push(ch);					// and 	put in queue based on double-sided linked list
		}
		
		String flipStr = "";						// output string
		switch (baseForStructure) {
			case "array":
				while(!theQueueAr.isEmpty())				// if stack isn't empty
					flipStr = flipStr + theQueueAr.pop();	// add to output string symbol from stack
				break;
			case "linked list":
				while(!theQueueLL.isEmpty()) 				// if stack isn't empty
					flipStr = flipStr + theQueueLL.pop();	// add to output string symbol from stack
				break;
			default:
				throw new RuntimeException("base for structure " + baseForStructure + " is unknown");
		}		
		return flipStr;
	}
//----------------------------------------------------------------------------------
}