package Pegawai;

/*Respresent a genereic staff member
 * Merupakan induk yang paling General dari keseluruhan class
 * Bersifat abstract dan setiap method abstract harus diimplement oleh subclassnya
 */
abstract public class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	/*Set up a staf member using specified information*/
	/*Constructor*/
	public StaffMember(String Name, String Address, String Phone) {
		name = Name;
		address = Address;
		phone = Phone;
	}
	
	/*Return information  including  the basic employee information*/
	public String toString() {
		String result = "Name : "+this.name+" \n";
		result += "Address : "+this.address+" \n";
		result += "Phone : "+this.phone+" \n";
		return result;
	}
	
	/*Abstarct Method , must be implement by subclass*/
	public abstract double pay();
}
