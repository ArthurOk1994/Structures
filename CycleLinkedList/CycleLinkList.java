package Chap05.JFTask;

class CycleLinkList {			  // people in the circle	
	
	private Link current;		  // reference to current man in the circle
	private int nPeople;		  // quantity people in the circle
	private int inetrval;		  // interval between deleted people
//------------------------------------------------------------------------------------------
	public CycleLinkList(int nPeople, int inetrval) {      // constructor
	   current = null;            			 // no people in the circle yet
	   this.nPeople = nPeople;				 // create quantity people in the circle
	   this.inetrval = inetrval;			 // create interval
	}
//------------------------------------------------------------------------------------------
	public boolean isEmpty() {    			// true if circle is empty
		return (current == null);
	}
//------------------------------------------------------------------------------------------                  
	public void insert() {					// insert a man after current man 
		
		for(int i = 1; i <= nPeople; i ++) {// start with first man till last
			Link newLink = new Link(i);		// create new link
			if(isEmpty()) {					// if circle is empty
				current = newLink;			// insert first man in the circle
				current.next = newLink;		// first man refers to itself
			}
			else {							// if circle isn't empty
				newLink.next = current.next;// insert new man after last man in the circle
				current.next = newLink;		// last man refers to first man
			}
			current = newLink;            	// current --> inserted man 
		}
	}
//------------------------------------------------------------------------------------------
	public void step() {					// move to next man
	   current = current.next;
	}
//------------------------------------------------------------------------------------------
	@SuppressWarnings("null")
	public long delete(int nMan) {      	// deleting a man at a certain interval
	   if(current == null) {				// if circle is empty
		   System.out.println("Can't delete from empty link");
		   return (Long) null;
	   }
	   find(nMan);							// find man with which to start deleting
	   while(current != current.next) {		// until last man stay in the circle
		   for(int i = 0; i < inetrval; i ++)  // move a certain interval
			   step();
		   Link temp = current.next;  		// save reference to deleted man
		   current.next = temp.next;       	// delete man	
		   displayList();					// display stayed people in the circle
	   }
	   System.out.println("last man in the circle is numbered " + current.nMan);
	   return current.nMan;                	// return number last man
	}
//------------------------------------------------------------------------------------------
	@SuppressWarnings("null")
	public int find(int man) {				// find man in the circle
	   if(current == null) {				// if circle is empty
		   System.out.println("Cannot find man because of link is empty");
		   return (Integer) null;
	   }
	   while(current.nMan != man)			// until you find the right number of a man
		   step();							// move to the next man
	   System.out.println("Man with whom the deleting begins is " + current.nMan);
	   return current.nMan;					// return number found man
	}
//------------------------------------------------------------------------------------------
	public Link displayList() {				// display people in the circle
		if(isEmpty()) {						// if circle is empty
			System.out.println("List is empty");
			return null;
		}
		System.out.print("people: ");
		Link end = current;       			// let's end = current man
		step();								// move to the next man
		while(current != end) {      		// start with next man till end man in the circle
			current.displayLink();   		// display man
			step();  						// move to the next man
		}
		current.displayLink();   			// display end man
		System.out.println("");
		return current;						// return current man
}
//------------------------------------------------------------------------------------------
}  // end class LinkList
