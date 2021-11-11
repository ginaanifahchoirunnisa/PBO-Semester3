package TugasTujuh;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Circle");
		Shape shape = new Shape();
		System.out.println(shape.toString());
		
		System.out.println("================================");
		Circle circle = new Circle();
		System.out.println(circle.toString());
		
		System.out.println("================================");
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle.toString());
		
		System.out.println("================================");
		Square square = new Square();
		System.out.println(square.toString());
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		square.setSide(5);
		System.out.println(square.getArea());
		System.out.println(square.getPerimeter());
		System.out.println(square.toString());
	}

}
