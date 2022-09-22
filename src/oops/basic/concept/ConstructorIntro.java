package oops.basic.concept;

public class ConstructorIntro {
	// every class automatically create zero parameter constructor by default;
	//	public ConstructorIntro() {
	//	
	//}
	int a = 5;
	
	// constructor: It is use for create new object of the class
	// syntax
	//access_modifier className(parameters) {....}
    // rules:
	// It's name should be same as className
	// It automatically return new object the class;
	// It have parameters (zero, one or more than one)
	
//	example of constructor
	
	public ConstructorIntro() {
		System.out.println("Zero parameter construtor");
		System.out.println("inside construtor a = " + this.a);
//		this - It is keyword
		// It uses for access the variable and method of the current class;
//		this.a = 10;
		
	}
	
	
	// one parameter construtor
	public ConstructorIntro(int id) {
		System.out.println("Inside one parameter construtor");
		this.a = id;
	}
	
	public static void main(String[] args) {
		
		// create new object
		System.out.println("start the main function");
		ConstructorIntro constructorObj = new ConstructorIntro(); // 
		
		System.out.println("outside construtor a = " + constructorObj.a);
		
		ConstructorIntro obj1 = new ConstructorIntro(20);
		System.out.println("outside construtor a = " + obj1.a);
		
		System.out.println("end the main function");
	}
	
	
}
