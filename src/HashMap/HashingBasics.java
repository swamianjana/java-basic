package HashMap;
import java.util.HashMap;

public class HashingBasics {

	//CRUD
	
//	Hashing: mechanism
//
//
//	Java:
//		how we can implement hashing in java
//			
//	ans:	○ HashMap
//				○ key, value
//				○ key
//					§ unique
//					§ duplication value not allowed
//				○ value:
//					§ duplicate value allowed

//				Set: data structure (how our data store)
//				○ value
//					§ unique
//					§ duplicate value not allowed
//				○ Java:
//					-HashSet()

	
	public static void main(String[] args) {
		
// HashMap: implementation of hashing in java

		
		// initialization:
	
		// variable
		int a; //Declare a = 0;
		a = 5; // initialization;
		
		int b = 6; // declare and initialization
	
	// array
	int[] arr; // delareization
	arr = new int[10]; // initialization
	int[] arr1 = new int[10];
	
	//HashMap
	//syntex
	// HashMap<Key_data_type, Value_data_type> variableName = new HashMap<>();
	
	//example
//	 1 -> anjana
//	 2 -> Naveen
	HashMap<Integer, String> rollNameMap = new HashMap<>();
	
//	CURD
//	Create/add/insert
//	variableName.put(key,value);
	rollNameMap.put(1, "Anjana");
	rollNameMap.put(2, "Naveen");
	rollNameMap.put(3, "Mukesh");
	rollNameMap.put(4, "Nihal");
	
	System.out.println(rollNameMap);
		
	//U: update/change
//   syntex
//	variableName.put(key,value)
	rollNameMap.put(2, "Swami");
	
	System.out.println(rollNameMap);
	
// R: Read/fetch
//	syntex
//	variableName.get(key);
	System.out.println(rollNameMap.get(3));
	
//	D: delete/remove
//	syntax
//	variableName.remove(key);
	
	System.out.println(rollNameMap.remove(2));
	System.out.println(rollNameMap);
	
	
	}
	
	
}
