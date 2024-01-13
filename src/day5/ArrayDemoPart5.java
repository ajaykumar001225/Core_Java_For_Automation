package day5;

public class ArrayDemoPart5 {

	public static void main(String[] args) {

		// there is no need to declare an array size
		// Array contains similar data type
		String[] names = { "Mukesh", "Anuska", "Sumit", "Sachin" };

		// if you want multiple datatype inside array then create object
		Object[] values = {12, 12.90, "Ruchi", "Dapo", 'c', false};
		

		for (Object obj : values) {
			System.out.println(obj);
		}
	}

}
