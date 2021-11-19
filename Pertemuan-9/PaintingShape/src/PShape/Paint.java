package PShape;

public class Paint {
	private double  coverage; //number of square feet per gallon
	/*constructor : sets up the paint object*/
	public Paint(double c) {
		coverage = c;
	}
	
	/*returns the amount  of paint (number of gallons)
	 * needed the point the shape given as the parameter*/
	public double amount (Shape s) {
		System.out.println("computing amount for "+ s);
		/*Melakukan perubahan dari nilai return
		 * dengan menggunakan rumus dimana, luas area dibagi dengan coverage*/
		double amount_paint = s.area() / coverage;
		return amount_paint; 
		//return 0 //==> nilai return sebelumnya
	}
	
	
	
}
