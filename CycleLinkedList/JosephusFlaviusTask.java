package Chap05.JFTask;

import java.util.Scanner;

public class JosephusFlaviusApp {
	
	public static void main(String[] args) {
		
		System.out.println("Input the quantity of people in circle");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		int nPeople = scn.nextInt();
		System.out.println("Input the interval at which you want to delete");
		int interval = scn.nextInt();
		
		CycleLinkList theCycleLinkList = new CycleLinkList(nPeople, interval);
		
		theCycleLinkList.insert();
		theCycleLinkList.displayList();
		
		System.out.println("Input number man you want to start deleting");
		int nMan = scn.nextInt();
		System.out.println("Deleted every " + interval + " man from circle");
		theCycleLinkList.delete(nMan);
	}	
}
