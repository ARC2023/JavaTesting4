package collectionjava;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {

		// 1. AddAll
		ArrayList<String> arl1 = new ArrayList<String>();
		arl1.add("Rasika");
		arl1.add("Tanaya");
		arl1.add("Surekha");

		ArrayList<String> arl2 = new ArrayList<String>();
		arl2.add("Sagar");
		arl2.add("Rohit");
		arl2.add("Anup");
		//System.out.println("Before Add All list 1-->" + arl1);
		//System.out.println("Before Add All list 2-->" + arl2);

		arl1.addAll(arl2);

		//System.out.println("After Add All -->" + arl1);

		// 2. AddAll with Index

		ArrayList<String> arl3 = new ArrayList<String>();
		arl3.add("Kalyani");
		arl3.add("Ragini");
		arl3.add("Priyanka");
		
		//System.out.println("Before Add All list 1-->" + arl1);
		//System.out.println("Before Add All list 3-->" + arl3);
		
		arl1.addAll(3, arl3);

		//System.out.println("After Add All with index-->" + arl1);

		
		// 3. Clear a List
		
		//System.out.println("Before Clearing list 1-->" + arl1);
		//arl1.clear();
		//System.out.println("After Clearing list 1-->" + arl1);
		
		// 4. Clone
		ArrayList<String> arl4 = (ArrayList<String>) arl1.clone();
		
	//	System.out.println("Cloning list 1 into list 4-->" + arl4);
		
		// 5. Contains
		
		//System.out.println(arl1.contains("Anup"));
		
		//System.out.println(arl1.contains("Kunal"));
		
		// 6. ContainsAll
		
		ArrayList<String> arl5 = new ArrayList<String>();
		
		arl5.add("Anup");
		arl5.add("Rohit");
		//arl5.add("Rajan");
		
		//System.out.println(arl1.containsAll(arl5));
		
		// 7. Arrays.asList
		
		ArrayList<String> arl6 = new ArrayList<String>
		(
				Arrays.asList("Sid","Akshay","Arjun","Akshay","Varun","Akshay") 
		);
		
	//	System.out.println(arl6);
		
		// 8. IndexOf
		
		/*System.out.println(arl6.indexOf("Akshay"));
		System.out.println(arl6.indexOf("Varun"));
		
		// 9. LastIndexOf
		
		
		System.out.println(arl6.lastIndexOf("Akshay"));
		System.out.println(arl6.lastIndexOf("Arjun"));*/
		
		// 10. Size
		
		System.out.println("Size of list 6-->"+arl6.size());
		
		
		// 11. Remove with Index
		//arl6.remove(3);
		System.out.println(arl6);
		
		
		// 12. Remove with Object
		//arl6.remove("Akshay");
		
		//System.out.println(arl6);

		
		// 13. RemoveAll
		ArrayList<String> arl7 = new ArrayList<String>
		(
				Arrays.asList("Akshay","Varun") 
		);
		
		//arl6.removeAll(arl7);
	//	System.out.println(arl6);
		
		// 14. RemoveIf
		ArrayList<Integer> arl8 = new ArrayList<Integer>
		(
				Arrays.asList(1,2,3,4,5,6,7,8,9,10) 
		);
		
		//.removeIf(number -> number%2!=0);
		
	//	System.out.println(arl8);
		
		/*for(int i:arl8) {
			
			if(i%2==0) {
				arl8.remove(i);
			}
			
			System.out.println(i%2==0);
		}
		*/
		
		
		
		//15. How to compare two list and find additional element from list - removeAll()
		
		
		ArrayList<String> arl9 = new ArrayList<String>
		(
				Arrays.asList("A","B","C","D","E") 
		);
		ArrayList<String> arl10 = new ArrayList<String>
		(
				Arrays.asList("A","B","C","D","F") 
		);
		
		
		//arl9.removeAll(arl10);
		
		//System.out.println(arl9);
		
		// 16. How to compare two list and find missing element from list - removeAll()
		
		//arl10.removeAll(arl9);
		//System.out.println(arl10);
		
		// 17. RetainAll() or How to compare and find common element?
		
	//	arl9.retainAll(arl10);
		
	////	System.out.println(arl9);
		
		
		// 18. RetainAll with Singleton
		
		//arl6.retainAll(Collections.singleton("Akshay"));
		//System.out.println(arl6);
		
		// 19. Sublist
		ArrayList<Integer> arl11 = new ArrayList<Integer>
		(
				Arrays.asList(1,2,3,4,5,6,7,8,9,10) 
		);
		
		//ArrayList<Integer> arl12 = new ArrayList<Integer>(arl11.subList(4, 8));
		
		//System.out.println(arl12);
		
		
		// 20. Sublist with clear
		
		
		//arl11.subList(4, 8).clear();
		
		//System.out.println(arl11);
		
		// 21. toArray
		/*
		Object arr[]=arl11.toArray();
		
		
		for(Object obj:arr) {
			System.out.println(obj);
		}
		*/
		// 22. Sorting and Comparing
		ArrayList<String> arl14 = new ArrayList<String>
		(
				Arrays.asList("A","B","C","D","E") 
		);
		ArrayList<String> arl15 = new ArrayList<String>
		(
				Arrays.asList("A","B","C","D","F") 
		);
		ArrayList<String> arl16 = new ArrayList<String>
		(
				Arrays.asList("B","A","C","D","F") 
		);
		
		Collections.sort(arl14);
		Collections.sort(arl15);
		Collections.sort(arl16);
		
		
		
		System.out.println(arl14.equals(arl15));
		
		System.out.println(arl15.equals(arl16));

		
		
	}

}
