package collectionjava;

import java.util.*;

public class ArrayListMethods {

	public static void main(String[] args) {

		List lister = new ArrayList(450);

		lister.add("Rasika");
		lister.add("Tanaya");
		lister.add("Anup");
		lister.add("Rohit");
		lister.add("Sagar");
		lister.add("Ragini");
		lister.add("Surekha");
		lister.add("Kalyani");

		for (int i = 0; i < lister.size(); i++) {

			System.out.println(lister.get(i));

		}

		for (Object obj : lister) {
			System.out.println(obj);

		}

		List<Integer> lister1 = new ArrayList<Integer>();

		lister1.add(90);
		lister1.add(89);
		lister1.add(77);

		List<String> lister2 = new ArrayList<String>();

		lister2.add("ARC");
		lister2.add("Tech");
		lister2.add("Institute");

		List<Object> lister3 = new ArrayList<Object>();

		lister3.add("Kunal");
		lister3.add(30);
		lister3.add('M');
		lister3.add(900000);
		lister3.add(15.5);
		
		
	}

}
