package HashMap;
import java.util.*;

 public class HashMapbasics {

	public static void main(String[] args) {
//		countries(key), population(value)
//		in line 9 we use anything in place of map it our choice
		HashMap<String, Integer> map = new HashMap<>();
		
//		insertion		insert the value or new value
		map.put("India", 120);
		map.put("Us", 100);
		map.put("China", 80);
		
		System.out.println(map);
//		output of line 12,13,14, is =	{China=80, Us=100, India=120}

		map.put("India", 150);
		System.out.println(map);
//		output is update = 					{China=80, Us=100, India=150}
		
//		lookup operation or search both were same
		if(map.containsKey("India")) {			// contain hme btae ga ki koi value exist krti h ya nhi
	System.out.println("key present in thte map");
		}else {
			System.out.println("key not present in the map");		// output is key present in the map
////			if we check for america then output is key not present in the
//			
		}
//			GET
			System.out.println(map.get("India"));			// key exist   output is 150
			System.out.println(map.get("London"));			// key dosent exist		output is null
	////////////////////////////////////////////////////////////////////////
			
//			ITERATION METHOD 
			
	int arr[] = {12,15,18};
	for(int i=0;i<3;i++) {
		System.out.print(arr[i] + " ");			// line 39 to 42 are 1st method
	}											// output is 12 15 18
	System.out.println();
	
	for(int val : arr) {					// line 44 to 48 is 2nd method
		System.out.print(val + " ");		// output is 12 15 18
	}
	System.out.println();
	
	////////////////////////////////////////////////////////////////////////////////////////////
	
//	USING FOR LOOP IN HASHMAP IS DIFFERENT
	
//	 .entrySet()= means  js se map ka set version muje mil jaega , jiske andr sare oair stored hoge 
//	, then ik ik kr k sare element is e k andr aa jaege or ik set mil jaega jisme sare set 
//	stored hoge 
	
//	map.entrySet = means map ka ik set version , map ko mne set me convert kr deya h , or is set ki vo value hogi 
//	unhe m ik ik kr k triverse krugi , set k andr pair hi h sare .
	
//	 Map.Entry<String, Integer> = type h mtlb string h ya int
	
	
//	e = is e k andr key be h or value be h
	
//	for(int val : arr) 
//	line 64 ko hmne hashmap ki style me line 68 me convert kr k likha h
	
	//Iteration (1)					very important 
    for(Map.Entry<String, Integer> e : map.entrySet()) {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    
    //Iteration (2)
    			
//    only key niklte h
    
    Set<String> keys = map.keySet();
    for(String key : keys) {
        System.out.println(key+ " " + map.get(key));
    }
//    key = is se key ki value aaegi 
//    map.get(key) = key k coresponding jo be pair ki value thi map k andr stored  
						
    						
    //Removing
    map.remove("China");
    System.out.println(map);
    
	}
	
}
