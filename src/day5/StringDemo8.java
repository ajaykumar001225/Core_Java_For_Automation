package day5;

public class StringDemo8 {
	public static void main(String[] args) {
		String msg = "The price is 1250 INR";
		
		String []arr = msg.split(" ");
		System.out.println(arr[3]); // 1250
		// note this output is string not an integer
		
		
		//Note : if you want int output then use Wrapper Class Integer
		int price = Integer.parseInt(arr[3]);
		if(price==1250) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}
}


