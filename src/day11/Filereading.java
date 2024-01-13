package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Filereading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("./properties/Config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(myFile);
			Properties pro = new Properties();
			pro.load(fis);
			System.out.println(pro.get("url"));
			System.out.println(pro.get("student"));
			System.out.println(pro.get("Raja")); // if that key have no value in properties file then output is >> null
		} catch (FileNotFoundException e) {
			System.out.println("OOPs File is missing " + e.getMessage());
		} catch (IOException e) {
			System.out.println("File Operation is not supported " +e.getMessage());
		}
		
		
		
		
//		System.out.println(myFile.canRead());
//		System.out.println(myFile.canWrite());
//		System.out.println(myFile.getName());
//		myFile.delete(); // it will delete the Config.properties file
	}

}
