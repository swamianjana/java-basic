package oops.basic.concept; // folder

// class = It is the blue print

// object = It is the copy of our class

// ???????? CLASS ??????????
// we can not create new class inside function
// we can create object of class inside function

// Naming convention for class
// (AnjanaSwami) [class] -- first letter of all word should be in capital letter

// other Naming convention
// camel case (anjanaSwami) [function/method] - first letter of first word should be in smaller letter
// 				  and after that first letter of all worlds should be in capital letter

// Snake Case (ANJANA_SWAMI) [constant class/variable]

// upper case (ANJANASWAMI)
// lower case (anjanaswami)

// class syntax

// 2 ways
// 1) by public access modifier keyword
// syntax - public class className {.....}
// uses i)  - In one file only allow one public class
// ii) - file name should be same as the public class name
// iii) - only one public class we can create in one file

// 2) without public keyword
// syntax - class className
// uses - we can create more than one class without uses public keyword in file (fileName.java)

// public class (class name should be same as file name)
public class ClassIntro {

	// object - real entity (bag, chair, car, house)
	// how to create object

	// syntax
	// ClassName objectName = new ClassName(parameters);

	// example
	public static void main(String[] args) {

		Car i20 = new Car();
		System.out.println(i20.color); // variable access
		
		// method call
		// objectName.functionName(parameter)
		
		i20.breakImpl();
		i20.lightImpl("ON");
		System.out.println("i20 milege " + i20.mileage);
		
		// create new object
		Car foutuner = new Car();
		foutuner.color = "whilte";
		System.out.println(foutuner.color);
		foutuner.lightImpl("OFF");
		System.out.println("foutuner milege " + foutuner.mileage);
		
		
		Car audi = new Car();
		audi.mileage = 10;
		System.out.println("Audi milege " + audi.mileage);
	}
	

}

// we can create multiple non-public class 
// create class
class A {
}

class B {
	class D {

	}
}

class C {
}

// what we can write inside class
// 1) pre-defined variable (int, flat, double, char, byte, etc...)
// 2) user-defined variable (class, interface, enum, etc...)
// 3) function 
// 4) we can also define new class inside class (inner class)

// Example

// create Car class
class Car {

	// pre-defined variable
	int wheel = 4;
	String color = "black";
	float mileage = 20.7f;

	// function / method
	// access-modifier return-data-type variableName (paramerters)

	// example
	public void drive() {

		// drive logic
		System.out.println("inside drive");
	}

	void breakImpl() {
		System.out.println("brack logic");
	}
	
	void lightImpl(String status) {
		System.out.println(status);
	}

}
