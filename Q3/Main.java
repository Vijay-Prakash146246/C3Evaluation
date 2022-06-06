package Q3;
import java.util.*;
enum Month
{
	JAN,
	FEB,
	MAR,
	APR,
	MAY,
	JUN,
	JUL,
	AUG,
	SEP,
	OCT,
	NOV,
	DEC;

}
class Demo
{
	void showDetails(Month m)
	{
		switch (m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case FEB:
			System.out.println("This is the 2nd Month of the Year february");
			break;
		case MAR:
			System.out.println("This is the 3rd Month of the Year march");
			break;
		case APR:
			System.out.println("This is the 4th Month of the Year april");
			break;
		case MAY:
			System.out.println("This is the 5th Month of the Year may");
			break;
		case JUN:
			System.out.println("This is the 6th Month of the Year june");
			break;
		case JUL:
			System.out.println("This is the 7th Month of the Year july");
			break;
		case AUG:
			System.out.println("This is the 8th Month of the Year August");
			break;
		case SEP:
			System.out.println("This is the 9th Month of the Year september");
			break;
		case OCT:
			System.out.println("This is the 10th Month of the Year october");
			break;
		case NOV:
			System.out.println("This is the 11th Month of the Year november");
			break;
		case DEC:
			System.out.println("This is the 12th Month of the Year december");
			break;

		default:
			System.out.println("Invalid Month Name");
			break;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1st 3 letter of name of month in capital");
		Scanner s = new Scanner(System.in);
		 String mon=s.next();
		 System.out.println(mon);
		

	}

}
