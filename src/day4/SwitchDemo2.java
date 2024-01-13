package day4;

public class SwitchDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "mukesh";
		
		switch(browser) 
		{
		case "Chrome" :
			System.out.println("start Chrome session");
			break;
			
		case "FireFox" :
			System.out.println("start FF session");
			break;
		
		case "Safari" :
			System.out.println("start Safari session");
			break;
			
		default :
			System.out.println("please use , chrome, safari, ff");
			break;
		}

	}

}
