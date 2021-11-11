package Pegawai;

public class Volunteer extends StaffMember{
	/*Set up a volunteer using the specified information*/
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName,eAddress, ePhone);
	}
	
	public double pay() {
		return 0.0;  /*Implement the abstract method from StaffMember Class*/
	}
}
