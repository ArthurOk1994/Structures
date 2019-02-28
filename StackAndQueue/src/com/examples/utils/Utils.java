package com.examples.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utils {
	
	public String getString() throws IOException {				
		
		InputStreamReader isr = new InputStreamReader(System.in);  // read symbols from stream
		BufferedReader br = new BufferedReader(isr);			   // buffered input symbols	
		String s = br.readLine();								   // read all string at once

		return s;
	}
}