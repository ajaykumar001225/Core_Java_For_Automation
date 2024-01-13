package day5;

public class StringDemo5 {
// second way to create string
	public static void main(String[] args) {
		String n1 = "Java";
		String n2 = "Java";
		
		System.out.println(n1==n2); // true
		// here check the value
		
		String m1 = new String("Java");
		String m2 = new String("Java");
		
		System.out.println(m1==m2); // false
		// here check the reference
		
		// Note : this is not how we compare the string in java,  when you say (==) it checks the references
	}
}


//Note : Whenever you create String Using a new keyword it does not take the memory from string pool, it takes the memory from heap.
	//heap every time new string will be created with the new reference