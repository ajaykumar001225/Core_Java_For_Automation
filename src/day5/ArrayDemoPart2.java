package day5;

public class ArrayDemoPart2 {

	public static void main(String[] args) {

		// there is no need to declare an array size
		String[] names = {"Mukesh", "Anuska", "Sumit"};
		
		int [] marks = {12,90,78};
		
		System.out.println(names[2]);
		
		System.out.println(marks[2]);
		// this will thrown an error : Array index out of bound
		// System.out.println(names[3]);
	}

}
