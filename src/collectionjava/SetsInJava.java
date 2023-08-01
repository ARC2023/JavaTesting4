package collectionjava;

import java.util.*;
import java.util.Arrays;

public class SetsInJava {

	public static void main(String[] args) {
		
		
	/*	ArrayList<String> arl14 = new ArrayList<String>
		(
				Arrays.asList("A","A","A","A","A","A","A","A","A","A") 
		);

		for(String temp:arl14){
			System.out.println("ArrayList -->"+temp);
			
		}
		
		Set<String> arl15 = new HashSet<String>
		(
				Arrays.asList("A","A","A","A","A","A","A","A","A","A") 
		);
		
		for(String temp:arl15){
			System.out.println("Sets -->"+temp);
			
		}
		

		Set<String> arl16 = new HashSet<String>();
		
		arl16.add("DAWN");
		arl16.add("AT");
		arl16.add("SKY");
		
		
		arl16.remove("AT");
		*/
		
		// How to remove duplicate elements from a list

		ArrayList<String> arl90 = new ArrayList<String>
		(
				Arrays.asList("A","A","B","B","C","C","C","D","D","E") 
		);
		arl90.forEach(temp -> System.out.println("Array List Duplicate element="+temp));
		Set<String> arl91 = new HashSet<String>(arl90);
		
		
		ArrayList<String> arl92 = new ArrayList<String>(arl91);
		
		arl92.forEach(temp -> System.out.println("Remove Duplicate element="+temp));
		
	}

}

