package Chap05.JFTask;

class Link {					   // circle

	public int nMan;               // number man in circle
	public Link next;              // next man in the circle
//-------------------------------------------------------------
	public Link(int nMan) {		  // constructor
		this.nMan = nMan;         // initialize people
	}                             
//-------------------------------------------------------------
	public void displayLink() {    // display people
		System.out.print(nMan + " ");
	}
//-------------------------------------------------------------
}  // end class Link
