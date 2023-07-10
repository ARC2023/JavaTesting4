package stringsmanipulations;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class StringManipulations {

	public static void main(String[] args) {

		String s1 = "Nagpur is the new IT Hub of India at the Mihan in short span of time";
		String s2 = "Nagpur is the new IT Hub of India at the Mihan in short span of time";
		String s3 = "Nagpur is the new It Hub of India at the Mihan in short span of time";
		String s4 = "Nagpur is the It Hub of India at the Mihan in short span of time";

		/*
		 // 1. Lenght
		  System.out.println(s1.length());
		  
		  2. Index of
		  System.out.println(s1.indexOf('r')); System.out.println(s1.indexOf("the"));
		  
		  System.out.println(s1.indexOf('r', 6));
		  System.out.println(s1.indexOf("the",11));
		  
		  System.out.println(s1.indexOf('r', s1.indexOf('r')+1));
		  System.out.println(s1.indexOf("the",s1.indexOf("the")+1));
		 */
		// 3. char at 
		/*System.out.println(s1.charAt(10));
		System.out.println(s1.charAt(5));*/

		// 4. Equals and EqualsIgnoreCasw
		/*System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));*/
		
		// 5. Substring
		
		/*System.out.println(s1.substring(6));
		System.out.println(s1.substring(11,53));*/
		
		
		// 6. Trim
		
		 String trimmers = "       Nagpur is the It Hub of India at the Mihan in short span of time      ";
		
		 /*
		System.out.println(trimmers.trim());*/
		
		// 7. Replace
		
		/*System.out.println(trimmers.replace(" ", "_"));
		System.out.println(trimmers.replace(" ", ""));
		System.out.println(trimmers.replace("of", "OFF"));
		System.out.println(trimmers.replace("of", "OFF"));
		*/
		// 8. Spilt
		
		 
		String spillter="ARC_Tech_Institute_Nandanvan";
		
		String[] str=spillter.split("_");
		
		for(String temp:str) {
			
			System.out.println(temp);
		}
		
		String conca= trimmers.concat(spillter);
		System.out.println(conca);
		conca.contains("The");
		
		s1=s1+s2+s3+s4+trimmers+spillter;
		
	}

}
