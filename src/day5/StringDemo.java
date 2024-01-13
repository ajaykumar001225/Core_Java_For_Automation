package day5;

public class StringDemo {
/*String is nothing but array of characters
 * 
 * Create string in 2 ways
 * 1. String tool = "Tom";
 * 
 * 2. char data[] = {'t','o','m'};
 * 	  String tool1 = new String(data);
 */
	public static void main(String[] args) {
		String name = "Java";
		// it's internally : char arr[] = {'J','a','v','a'};
		System.out.println(name);
	}
}


/*
we have 2 more classes that allow us to change the string.
They are mutable -
	String Buffer
	String Builder

*/