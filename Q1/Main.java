package Q1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements in the array");
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int [] arr= new int[N];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<N;i++)
		{
			arr[i]=s.nextInt();
		}
		
		try
		{
			System.out.println("Enter the index of the array element you want to access");
			int ind = s.nextInt();
			System.out.println("The array element at index "+ind+" = "+arr[ind]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
		

	}

}
