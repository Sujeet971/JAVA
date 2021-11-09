import java.util.Scanner;

public class Vowel {
	public static void main(String args[]) {
		Scanner vov=new Scanner(System.in);
		System.out.println("Enter an alphabet");
		 String name = vov.nextLine();
		 switch(name) 
			{
			case "a":
				System.out.println(name +" is a vovel");
			break;
			case "e":
				System.out.println(name +" is a vovel");
			break;
			case "i":
				System.out.println(name +" is a vovel");
			break;
			case "o":
				System.out.println(name +" is a vovel");
			break;
			case "u":
				System.out.println(name +" is a vovel");
			break;
			case "b","c","d","g","f","h","j","k","l","m","p","q","r","s","t","v","w","x","y","z":
				System.out.println(name +" is a Constant");
			break;	
			
			default:
				System.out.println("Enter a single alphabet");
		
	}
	}

}
