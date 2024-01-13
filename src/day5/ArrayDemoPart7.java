package day5;

public class ArrayDemoPart7 {

	public static void main(String[] args) {

		// 2D Object contains multiple data type values
		Object[][] names = new Object [2][2];
		
		// System.out.println(names);
		
		names[0][0] =12;
		names[0][1] =12.90;
		names[1][0] ='a';
		names[1][1] ="java";
		
		System.out.println(names[1][1]);

	}

}


//Note : This is basically we are using in automation for reADING DATA from excel, xml sheet etc.