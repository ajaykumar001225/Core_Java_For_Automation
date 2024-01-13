package day5;

public class ArrayDemoPart3 {

	public static void main(String[] args) {

		// there is no need to declare an array size
		String[] names = { "Mukesh", "Anuska", "Sumit", "Sachin", "Uma", "Bhairu" };

		
		// here inside loop i<==5 is a static condition if we write as i<=6 then it will throw error 
		// always try in a dynamic way 
//		for (int i = 0; i <= 5; i++) {
//			System.out.println("Value from array is " + names[i]);
//		}

		// dynamic way
		for (int i = 0; i < names.length; i++) {
			System.out.println("Value from array is " + names[i]);
		}

	}

}
