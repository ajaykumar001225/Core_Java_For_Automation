package day5;

public class StringDemo6 {
	public static void main(String[] args) {
		String msg = "I Love Automation, I can automate web Application";
		System.out.println(msg.isEmpty()); //false
		System.out.println(msg.startsWith("I")); //true
		System.out.println(msg.startsWith("i")); //false
		System.out.println(msg.endsWith("Application")); // true
		System.out.println(msg.endsWith("application")); // false
		System.out.println(msg.contains("Application")); // true
		System.out.println(msg.contains("application")); // false
		
		String msg1 = "i Love Automation, I can automate web Application";
		
		System.out.println(msg.equals(msg1)); //false
		System.out.println(msg.equalsIgnoreCase(msg1)); // true
	}
}


// note: In Java String is also a case sensitive
