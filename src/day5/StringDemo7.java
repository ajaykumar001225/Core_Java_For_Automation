package day5;

public class StringDemo7 {
	public static void main(String[] args) {
		String msg = "I Love Automation, I can automate web Application";
		String msg1 = "i Love Automation, I can automate web Application";
		String msg2 = " i Love Automation, I can automate web Application";
		
		System.out.println(msg1.equalsIgnoreCase(msg2)); // false
		// why : because space( ) is also considered as a char

	}
}


