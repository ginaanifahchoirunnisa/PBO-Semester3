package PShape;

public class Rectangle extends Shape{
	/*penerapan enkapsulasi dimana variabel di set private
	 * variabel persegi panjang dengan atribut panjang dan lebar*/
	private double length;
	private double width;
	
	/*Inisiate Rectangle*/
	public Rectangle(double lengthR, double widthR) {
		super("Rectangle");
		this.length = lengthR;
		this.width = widthR;
	}

	
	/*Mengimplementasikan abstract method dari class Shape
	 * Merupakan bentuk dari overriding method class dari superClass-nya
	 * Bentuk dari implementasi dynamic polymorphism*/
	public double area() {
		return length*width;
	}
	
	/*Mendefiniskan toString() yang sama dengan class Sphere*/
	public String toString() {
		return super.toString() + " of Length " + length +" and width " + width;
	}
	
	
	
	
}
