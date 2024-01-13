package day5;

public class StringDemo4 {
	public static void main(String[] args) {
		String name1 = "Java";
		String name2 = "Java";
		String name3 = "Java";
		String name4 = "Java";
		//Note for all : Java will create a one memory of String in memory > sInce you have a same String again & again - java is going to point to the same string.
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
	}
}

// this follow string pool concept


