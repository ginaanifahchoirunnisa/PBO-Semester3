package PShape;

public class Cylinder extends Shape{
	/*menerapkan : enkapsulasi - set atribite variabel to private
	 * Cylinder with radius and height attribute*/
	private double height;
	private double radius;
	
	public Cylinder(double heightR, double radiusR) {
		super("Cylinder");
		height = heightR;
		radius = radiusR;
	}
	

	public double area() {
		return Math.PI*height*radius*radius;
	}
	
	/*Mendefinisikan toString yang sama dengan class Sphere*/
	public String toString() {
		return super.toString() + " of Radius " + radius + " And Height " + height;
	}
}
