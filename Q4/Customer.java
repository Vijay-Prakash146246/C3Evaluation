package Q4;
import java.util.*;
import java.util.regex.Pattern;
/*
Q4)Create a Customer bean class with the following fields:
username: String
password: String
mobileNumber: String
email: String
 * */
public class Customer 
{
	private String username;
	private String password;
	private String mobileNumber;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//0 Arg constructor 
	public Customer() 
	{
		super();
	}
	public Customer(String username, String password, String mobileNumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	
	
}

class Demo
{
	public static void main(String[]args)
	{
		System.out.println("Enter User name ");
		Scanner s = new Scanner(System.in);
		String Uname=s.next();
		boolean userN=Pattern.matches("[A-Za-z0-9] {3,8}", Uname);
		
		System.out.println("Enter password");
		String pass=s.next();
		Boolean pass1=Pattern.matches("[A-Za-z0-9] {3,8}", pass);
		
		System.out.println("Enter Mobile Number");
		String Mob=s.next();
		Boolean mob1=Pattern.matches("[6789]{1}[]0-9 {9}", Mob);
		
		System.out.println("Enter Email");
		String Email=s.next();
		Boolean email1=Pattern.matches("[A-Za-z0-9]+@[A-Za-z0-9]", Email);
		if(userN && pass1 && mob1 && email1)
		{
			if( pass1)
			{
				
				if(mob1)
				{
					if(email1)
					{
						Customer  c1 = new Customer(Uname, pass, Mob, Email);
						System.out.println("UserName "+c1.getUsername());
						System.out.println("Password "+c1.getPassword());
						System.out.println("Mobile-Number "+c1.getMobileNumber());
						System.out.println("Email Address "+c1.getEmail());
						
					}
					else
					{
						System.out.println("Email is not valid ");
					}
				}
				else
				{
					System.out.println("Mobile Number is not valid ");
				}
			}
			else
			{
				System.out.println("Password is not valid ");
			}
			
		}
		else
		{
			System.out.println("User name not valid ");
		}
		
	}
}
