package TugasTujuh;

public class Square extends Rectangle {
	///inisialisasi
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side, side); // Call superclass Rectangle(double, double)
	}
	
	//karena p dan lebar dari square sama 
	public String toString() {
		return "A Square with side = "+ super.getLength() + " which is a subclass of "
				+ super.toString();
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public double getArea() {
		return super.getArea();
	}
	
	public double getPerimeter() {
		return 4*super.getLength();
	}
	

	
	
}
