import java.util.Scanner;

class Odd {
	public static void main(String args[]) 
	{
		Scanner req = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int A=req.nextInt();
		int B=A%2;
		switch(B) 
		{
		case 0:
			System.out.println(A +" is Even Number");
		break;
		case 1:
			System.out.println(A + " is Odd Number");
		break;
		default:
		
		
			
		}
		
		
		
		
	}

}
