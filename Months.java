import java.util.Scanner;

public class Months {
public static void main(String args[]) {
	Scanner mon= new Scanner(System.in);
	System.out.println("Enter first 3 alphabets of a month");
	String A= mon.nextLine();
	
	switch(A) {
	case "Jan","jan":
		System.out.println("January");
	break;
	case "Feb","feb":
		System.out.println("Febuary");
	break;
	case "Mar","mar":
		System.out.println("March");
	break;
	case "Apr","apr":
		System.out.println("April");
	break;
	case "May","may":
		System.out.println("May");
	break;
	case "Jun","jun":
		System.out.println("June");
	break;
	case "Jul","jul":
		System.out.println("July");
	break;
	case "Aug","aug":
		System.out.println("August");
	break;
	case "Sep","sep":
		System.out.println("September");
	break;
	case "Oct","oct":
		System.out.println("October");
	break;
	case "Nov","nov":
		System.out.println("November");
	break;
	case "Dec","dec":
		System.out.println("December");
	break;
	default:
		System.out.println("Enter a Valid details");

	
	}
	
	
}
}
