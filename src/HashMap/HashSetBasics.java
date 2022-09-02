package HashMap;

import java.util.HashSet;
import java.util.Iterator;

		public class HashSetBasics {
		
			 public static void main(String args[]) {
//				 CREATING
			       HashSet<Integer> set = new HashSet<>();	// in this line we define set
//	SAME LIKE ARRAY LIST = ArryList<Integer> list = new ArrayList<>();
			  
//		insert the element 
			       set.add(1); 			// list.add(el)= ese hm array me krte the 
			       set.add(2);
			       set.add(3);
			       set.add(1);			// this  not preset because set dosnt allow duplicate
			 
			       //Size
			       System.out.println("size of set is : " + set.size());		// output is 3

			       
//		Search -> contain
			       if(set.contains(1)) {
			           System.out.println("present");		// ouutput is present
			       }
			 
			       if(!set.contains(6)) {
			           System.out.println("absent");		// output is absent
			       }
			 
//			       //Delete
			       set.remove(1);
			       if(!set.contains(1)) {
			           System.out.println("absent");		// output is absent
			       }

			     //Print all elements
			       System.out.println(set);

///////////////////////////////////////////////////////////////////////////////////////
			     //Iteration - HashSet does not have an order
			       set.add(0);
			       Iterator it = set.iterator();
			        while (it.hasNext()) {
			           System.out.print(it.next() + ", ");  // output is 1,2,3
			       }
			       System.out.println();
			 
			       //isEmpty
			       if(!set.isEmpty()) {
			           System.out.println("set is not empty");
			       }

			 }
}
