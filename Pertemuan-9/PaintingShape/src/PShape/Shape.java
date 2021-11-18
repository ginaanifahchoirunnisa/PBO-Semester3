package PShape;

public abstract class Shape {
	String shapeName;
	
	public Shape(String Shape_name) {
		shapeName = Shape_name;
	}
	//create abstract method
	/*bertipe abstract method, maka semua yang menginstansiasikannya harus menerapkan method ini*/
	public abstract double area();
	
	public String toString() {
		return shapeName;
	}
}
