package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InterrruptedByJava {

	public static void main(String[] args) throws InterruptedException {

		
		
		Thread.sleep(1000);
		int i=2/0;
		try {
			FileInputStream f= new FileInputStream("c\\gta");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream f= new FileInputStream("c\\gta");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream f= new FileInputStream("c\\gta");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileInputStream f= new FileInputStream("c\\gta");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
