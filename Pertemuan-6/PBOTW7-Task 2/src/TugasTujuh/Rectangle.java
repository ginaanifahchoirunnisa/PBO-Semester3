package TugasTujuh;

public class Rectangle extends Shape{
	//atur variabel
	private double width;
	private double length;
	
	//constructor
	public Rectangle() {
		this.width = 1.0;
		this.length =1.0;
	}
	
	//constructor
	public Rectangle(double width , double length) {
		this.width = width;
		this.length = length;
	}
	
	//constructor
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}
	
	//getter
	public double getWidth() {
		return width;
	}
	
	// setter
	public void setWidth(double width) {
		this.width = width;
	}

	//getter
	public double getLength() {
		return length;
	}
	
	//setter
	public void setLength(double length) {
		this.length = length;
	}
	
	//hitung luas
	public double getArea() {
		return width*length;
	}
	
	//hitung keliling
	public double getPerimeter() {
		return (2*width)+(2*length);
	}
	
	//toString() overriding 
//	public String toString() {
//		return "Rectangle [Shape[color = "+ super.getColor()+" Filled = "+ super.isFilled()+
//				"], width = "+ width + " length = "+ length;
//	}
	
	public String toString() {
		return "A Rectangle with width = "+ width + " and length = "+length+
				" , which is a subclass of "+ super.toString() ;
	}
}
