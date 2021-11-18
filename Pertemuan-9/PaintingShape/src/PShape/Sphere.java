package PShape;

public class Sphere extends Shape{
	private double radius;
	
	/*constructor : sets up the sphere*/
	public Sphere(double r) {
		super("Sphere");
		this.radius = r;
	}
	
	/*Return the surface area of the sphere*/
	public double area() {
		return 4*Math.PI*radius*radius;
	}
	
	/*Returns the sphere as a string*/
	public String toString() {
		return super.toString() + " of Radius " + radius;
	}
}
