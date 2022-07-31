package sorting;

import java.util.*;									// this is a import input

 class methodsOfSort {								// this is a class
	
	public static void main(String[] args) {   		//this is a main method 
		
	ArrayList<String> al = new ArrayList<String>();   //this is a list of string
	
	al.add("Swami House");
	al.add("Is My");
	al.add("HomeTown");
	al.add("NaveenAnjana");
	
//	 Collections.sort method is sorting the
//    elements of ArrayList in ascending order. 
	Collections.sort(al);
//	Collections.sort(al, Collections.reverseOrder());		//this is use for reverse order
	
//	 Let us print the sorted list
	System.out.println(al);
	}

}
