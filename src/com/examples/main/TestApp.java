package com.examples.main;

import java.io.IOException;
import java.util.Scanner;

import com.examples.interfaces.Seeable;
import com.examples.interfaces.StructureFactory;
import com.examples.queue.QueueFactory;
import com.examples.stack.StackFactory;


public class TestApp {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Which structure you want (stack or queue):");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String structure = scn.nextLine();
		
		System.out.println("Choose base for " + structure + " (array or linked list):");
		String base = scn.nextLine();
		
		System.out.println("Enter string for flip (press ENTER for the end of typing):");
		
		StructureFactory structureFactory = createStringByStructure(structure);
		Seeable seeable = structureFactory.createString();		

		String flipString = seeable.seeString(base);
		System.out.println("String is: " + flipString);	
	}
//----------------------------------------------------------------------------------	
	static StructureFactory createStringByStructure(String structure) {
		
		if(structure.equalsIgnoreCase("stack"))
			return new StackFactory();
		else if(structure.equalsIgnoreCase("queue"))
			return new QueueFactory();
		else
			throw new RuntimeException(structure + " is unknown");
	}
//----------------------------------------------------------------------------------	
}