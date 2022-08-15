package oops.basic;

public class PenBluePrint {
	
	//constructor: to create object in which manner
	// zero parameter constructor
	
	// syntax:
	// Classname() {}
	
	PenBluePrint() {
		System.out.println("automatically called at the time of object creation");
	}
	
	// one parameter constructor
	PenBluePrint(String color) {
		System.out.println("one parameter constructor");
		this.color = color;
	}
	
	
	//properties
	int size;
	String color;
	String brandName;
	String outerBody;
	int prize;
	
	//work or functionality
	public void displayFontSize() {
		System.out.println("bold");
	}
	
	public void inkType() {
		System.out.println("Gel");
	}
}
