package collectionjava;

import java.util.*;
import java.util.Map.Entry;

public class MapsInJava {

	public static void main(String[] args) {

		HashMap<String,String> ccMap = new HashMap<String,String>();
		
		ccMap.put("India", "Delhi");
		ccMap.put("Croatia", "Zagreb");
		ccMap.put("Germany", "Berlin");
		ccMap.put("Netherlands", "Amsterdam");
		ccMap.put("England", "London");
		ccMap.put("Wales", "Cardif");
		ccMap.put("Nepal", "Kathmandu");
		ccMap.put("US", "WDC");
		ccMap.put("Canada", "Otawa");
		
		//System.out.println(ccMap);
		
		ccMap.put("Canada", "Toronto");
		ccMap.put("Russia", null);
		ccMap.put("Turkey", null);
		ccMap.put("Romania", null);
		ccMap.put("Sri lanka", null);
		ccMap.put(null, "Singapore");
		ccMap.put(null, "Uganda");
		//System.out.println(ccMap);
		
		/*ccMap.remove("Russia");
		ccMap.remove("Canada", "Toronto");
		ccMap.clear();
		System.out.println(ccMap);*/
		
		
		//System.out.println(ccMap.get("Canada"));
		
		
		
		// 1. For Each Loop
		System.out.println("For Each Loop");
		Set<String> keyset= ccMap.keySet();
		
		for(String temp:keyset) {
			
			System.out.println("The key is -->"+temp +    " and Corresponding value is --> "  +ccMap.get(temp));
		}
		
		// 2. Iterator using Key set
		System.out.println("Iterator using keyset");
		Iterator<String> itr= ccMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String key= itr.next();
			System.out.println("The key is -->"+ key+    " and Corresponding value is --> "  +ccMap.get(key));
			
		}
				
		// 3. Iterator using Entry set
		System.out.println("Iterator using Enrry Set");
		Iterator<Entry<String,String>> itr1=ccMap.entrySet().iterator();
		
		while(itr1.hasNext()) {
			
			Entry<String,String> itrr= itr1.next();
			System.out.println("The key is -->"+ itrr.getKey()+    " and Corresponding value is --> "  +itrr.getValue());	
			
		}
				
		// 4. Lambda
		
		System.out.println("Lambda");
		ccMap.forEach((k,v) -> System.out.println("The key is -->"+ k +    " and Corresponding value is --> "  +v));
		
	}

}
