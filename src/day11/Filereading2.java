package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Filereading2 {

	public static void main(String[] args) {
	// Re-factored code of Filereading1
		File myFile = new File("./properties/Config.properties");
		
		try {
			Properties pro = new Properties();
			pro.load(new FileInputStream(myFile));
			System.out.println(pro.get("url"));
		} catch (FileNotFoundException e) {
			System.out.println("OOPs File is missing " + e.getMessage());
		} catch (IOException e) {
			System.out.println("File Operation is not supported " +e.getMessage());
		}
		
		
		
	}

}
