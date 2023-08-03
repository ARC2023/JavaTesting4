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
		//System.out.println("For Each Loop");
		Set<String> keyset= ccMap.keySet();
		
		for(String temp:keyset) {
			
			//System.out.println("The key is -->"+temp +    " and Corresponding value is --> "  +ccMap.get(temp));
		}
		
		// 2. Iterator using Key set
		//System.out.println("Iterator using keyset");
		Iterator<String> itr= ccMap.keySet().iterator();
		
		while(itr.hasNext()) {
			String key= itr.next();
			//System.out.println("The key is -->"+ key+    " and Corresponding value is --> "  +ccMap.get(key));
			
		}
				
		// 3. Iterator using Entry set
		//System.out.println("Iterator using Enrry Set");
		Iterator<Entry<String,String>> itr1=ccMap.entrySet().iterator();
		
		while(itr1.hasNext()) {
			
			Entry<String,String> itrr= itr1.next();
			//System.out.println("The key is -->"+ itrr.getKey()+    " and Corresponding value is --> "  +itrr.getValue());	
			
		}
				
		// 4. Lambda
		
		//System.out.println("Lambda");
		//ccMap.forEach((k,v) -> System.out.println("The key is -->"+ k +    " and Corresponding value is --> "  +v));
		
		// 5. Comparing two maps: -
		HashMap<Integer, String> mappers1 = new HashMap<Integer, String>();
		mappers1.put(1, "Priya");
		mappers1.put(2, "Kanupriya");
		mappers1.put(3, "Priyanshi");
		mappers1.put(4, "Priyanshi");
		
		HashMap<Integer, String> mapper2 = new HashMap<Integer, String>();
		mapper2.put(2, "Kanupriya");
		mapper2.put(3, "Priyanshi");
		mapper2.put(1, "Priya");
		
		
		HashMap<Integer, String> mapper3 = new HashMap<Integer, String>();
		mapper3.put(1, "Priya");
		mapper3.put(2, "Kanupriya");
		mapper3.put(3, "Pri");
		mapper3.put(4, "Priyanshi");
		
		// 5.1 Comparing two maps as a whole
		
		//System.out.println(mappers1.equals(mapper2));
		//System.out.println(mappers1.equals(mapper3));
		
		// 5.2 Comparing two maps using keys
		
		Set<Integer> setter1 = new HashSet<Integer>(mappers1.keySet());
		Set<Integer> setter2 = new HashSet<Integer>(mapper2.keySet());
		Set<Integer> setter3 = new HashSet<Integer>(mapper3.keySet());
		
		//System.out.println(setter1.equals(setter2));
		//System.out.println(setter1.equals(setter3));
		
		// how to find extra and missing key
		//setter1.removeAll(setter3);
		setter3.removeAll(setter1);
		
		System.out.println(setter3);
		
		
		// 5.3 Comparing two maps using values
		
		// case 1 : when duplicates are not allowed
		HashSet<String> setter4 = new HashSet<String>(mappers1.values());
		HashSet<String>setter5 = new HashSet<String>(mapper2.values());
		HashSet<String> setter6 = new HashSet<String>(mapper3.values());
		
		//System.out.println(setter4.equals(setter5));
		//System.out.println(setter4.equals(setter6));
		
		
		// case 2 : when duplicates are allowed
		ArrayList<String>  arr1 = new ArrayList<String>(mappers1.values());
		ArrayList<String>  arr2 = new ArrayList<String>(mapper2.values());
		ArrayList<String>  arr3 = new ArrayList<String>(mapper3.values());
		
		//System.out.println(arr1.equals(arr2));
		//System.out.println(arr1.equals(arr3));
		
		
		// List of Maps or Nested Collections
		
		ArrayList<String> arr11 = new ArrayList<String>();
		arr11.add("Tusk");
		arr11.add("Underwood");

		ArrayList<HashMap<String, String>> lister = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> mapper = new HashMap<String, String>();

		mapper.put("Name", "Juneja");
		mapper.put("Employer", "BofA");
		mapper.put("Salary", "150000");
		mapper.put("Tax", "32.45");

		lister.add(mapper);
		HashMap<String, String> mapper22 = new HashMap<String, String>();
		mapper22.put("Name", "Raymond");
		mapper22.put("Employer", "JPMC");
		mapper22.put("Salary", "250000");
		mapper22.put("Tax", "34.45");

		lister.add(mapper22);
		HashMap<String, String> mapper33 = new HashMap<String, String>();
		mapper33.put("Name", "Garotte");
		mapper33.put("Employer", "Stanford");
		mapper33.put("Salary", "200000");
		mapper33.put("Tax", "30.4");

		lister.add(mapper33);

		int i = 0;

		for (HashMap<String, String> hasher : lister) {
			i++;
			System.out.println("Row no = " + i);
			Iterator<Entry<String, String>> itwr = hasher.entrySet().iterator();

			while (itwr.hasNext()) {

				Entry<String, String> obj = itwr.next();

				System.out.println("Key =" + obj.getKey() + " and Value =" + obj.getValue());

			}

		}
		
		
		HashMap<ArrayList<String>,ArrayList<String>> mapper12= new HashMap<ArrayList<String>,ArrayList<String>>();
		
		
		
		
	}

}
