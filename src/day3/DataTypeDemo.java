package day3;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// true and false
		boolean status = false;
		System.out.println(status);
		
		//character 
		char c1 = 'a';
		System.out.println(c1);
		
		//ASCII value
		char c2 = 98;
		System.out.println(c2);
		
		//byte range -128 to 127
		byte marks = 123 ;
		System.out.println(marks);
		
		//Type mismatch: cannot convert from int to byte 
		//	byte marks1 = 128 ;
		//	System.out.println(marks1);
		
		// for adding forcefully we use => DOWN-Casting
		byte marks2 = (byte)128 ;
		System.out.println(marks2);
		
		
		//short range -32768 to 32767
		short amount = 32628;
		System.out.println(amount);
		
		
		//short -- Type mismatch: cannot convert from int to short
		//short amount1 = 32768;
		//System.out.println(amount1);
	
		//DownCasting (reverse output if range cross)
		short amount2 = (short)32768;
		System.out.println(amount2);
		
		// integer
		int number = 123456789;
		System.out.println(number);
		
		// The literal 8986564545 of type int is out of range
		//long phoneNumber = 8986564545;
		//System.out.println(phoneNumber);
		
		// Note: it will think like integer value until we are not putting l with value
		long phoneNumber1 = 8986564545l;
		System.out.println(phoneNumber1);
		
		
		//float : Type mismatch: cannot convert from double to float (sol>> add f with value)
		//float studentMarks = 15.5;
		//System.out.println(studentMarks);
				
		//float
		float studentMarks1 = 15.5f;
		System.out.println(studentMarks1);
		
		//double 
		double teacherMarks = 20.5;
		System.out.println(teacherMarks);
		
	}

}
