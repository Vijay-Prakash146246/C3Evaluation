package Q2;

import javax.swing.AbstractAction;

abstract class Employee
{
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int employeeId, String employeeName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	public abstract void calculateSalary();
}
abstract class PermanentEmployee extends Employee
{

	public PermanentEmployee(int employeeId, String employeeName) 
	{
		super(employeeId, employeeName);
		// TODO Auto-generated constructor stub
	}

	private double basicPay;
}
public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
