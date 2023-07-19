package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ArithmatException {

	public static void main(String[] args) {
		
		
		System.out.println("Before Exception");
		try {
		int i =9;		
		i=i/0;
		
		
		}
		
		
		catch(ArithmeticException e) {
			System.out.println("Inside Catch Block");
			e.printStackTrace();
		}catch(Exception e) {
			
			System.out.println("Inside Catch Block");
			e.printStackTrace();
		}

		
		System.out.println("After Exception");

	}

}
