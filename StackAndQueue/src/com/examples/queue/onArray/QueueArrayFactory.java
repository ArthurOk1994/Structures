package com.examples.queue.onArray;

import java.io.IOException;

import com.examples.interfaces.Seeable;
import com.examples.interfaces.StructureFactory;
import com.examples.utils.Utils;

public class QueueArrayFactory implements StructureFactory {
	
	@Override
	public Seeable createString() {
		
		Utils utils = new Utils();
		String input = null;						// string for writing
		
		while(true) {
			System.out.flush();
			try {									// handling exception
				input = utils.getString();			// write symbols in string
				if(input.equals(""))				// if keyup ENTER
					break;							// stop writing
			} catch (IOException e) {				// handling exception
				e.printStackTrace();
			}				
			return new StringFromQueue(input);		// create new string (all symbols in queue)
		}		
		return null;
	}
}