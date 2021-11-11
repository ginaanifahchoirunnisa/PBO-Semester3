package Pegawai;

public class Employee extends StaffMember{
	protected String socialSecurityNumber;
	protected double payRate;
	
	/*Set up an employee with the specified information*/
	public Employee(String eName,String eAddress,String ePhone, String SSN, double PayRate) {
		super(eName, eAddress, ePhone);
		socialSecurityNumber = SSN;
		payRate = PayRate;
	}
	
	/*Return information about Employee*/
	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		return result;
	}
	
	public double pay() {
		return payRate; // Return payRate field from Employee
	}
}
