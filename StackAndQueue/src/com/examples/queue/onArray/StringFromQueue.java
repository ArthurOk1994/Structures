package com.examples.queue.onArray;

import com.examples.interfaces.Seeable;

public class StringFromQueue implements Seeable {

	private String input;						// input string
//----------------------------------------------------------------------------------
	public StringFromQueue(String in) {			// constructor
		input = in;
	}
//----------------------------------------------------------------------------------
	@Override
	public String seeString() {						// output string
		
		int queueSize;								// size of queue
		queueSize = input.length();					// equals length of input string
		QueueArray theQueue = new QueueArray(queueSize);	// create queue
		
		for(int i = 0; i < queueSize; i ++) {			
			char ch = input.charAt(i);				// character-by-character reading
			theQueue.push(ch);						// and 	put in queue
		}
		
		String str = "";							// output string
		while(!theQueue.isEmpty())					// if queue isn't empty
		str = str + theQueue.pop();					// add to output string symbol from queue
		
		return str;		
	}
//----------------------------------------------------------------------------------
}