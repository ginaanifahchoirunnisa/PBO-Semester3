package TugasTujuh;

public class Circle extends Shape{
private double radius;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 2*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
//	public String toString() {
//		return "Circle [ shape [ color = "+ super.getColor() + " filled = "+ super.isFilled() +
//		" ],"+"radius = "+ getRadius();
//				
//	}
	public String toString() {
		return "A circle with radius = "+ radius+ " which is a subclass of "+ super.toString();
	}
}


