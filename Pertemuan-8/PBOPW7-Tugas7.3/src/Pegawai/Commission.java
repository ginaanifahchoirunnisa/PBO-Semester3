package Pegawai;

public class Commission extends Hourly{
	private double total_sales;
	private double commission_rate;
	
	/*commission rate :
	 * commission rate using percentage*/
	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comrate) {
		super(eName,eAddress,ePhone,socSecNumber,rate);
		/*set the commission rate*/
		commission_rate = comrate;
		
	}
	
	public void addSales(double totalSales) {
		total_sales += totalSales;
	}
	
	/*pay add commission*/
	public double pay(){
		double payment = super.pay();
		double total = payment + (payment*commission_rate);
		return payment;
	}
	
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales : " + total_sales;
		/*total_sales be set back to 0*/
		total_sales = 0;
		return result;
	}
	
	
}
