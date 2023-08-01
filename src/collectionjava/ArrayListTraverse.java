package collectionjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTraverse {

	public static void main(String[] args) {
		ArrayList<String> arl14 = new ArrayList<String>
		(
				Arrays.asList("A","B","C","D","E","G","H","R") 
		);

		// 1. Traditional For Loop
		
		for(int i=0;i<arl14.size();i++) {
			System.out.println("Tradtional For Loop -->"+arl14.get(i));
						
		}
		
		// 2. For Each
		for(String temp:arl14){
			System.out.println("For Each Loop -->"+temp);
			
		}
		
		// 3. For Each using lamda expression
		
		arl14.forEach(temp -> System.out.println("For Each Lamda Loop -->"+temp));
		/**
		 * a. Write the reference variable of array list
		 * b. use dot operator to the reference variable and call forEach method
		 * c. within bracket write one temporary variable without writing data type
		 * d. Write lamda(->) expression after temporary variable
		 * e. After expression write your print statement
		 * */
		
		
		// 4. Iterator
		
		Iterator<String> itr   =   arl14.iterator();
		
		while(itr.hasNext()) {
			
			
			System.out.println("Iterator  -->"+ itr.next());
			
		}
		
		
	}

}
