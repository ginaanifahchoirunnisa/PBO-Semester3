package PShape;
import java.text.DecimalFormat;

public class PaintThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double COVERAGE =350;
		Paint paint = new Paint(COVERAGE);
		
		Rectangle deck;
		Sphere bigBall;
		Cylinder tank;
		
		double deckAmt, ballAmt, tankAmt;
		
		//instantiate the three shapes to paint
		deck = new Rectangle(20,30);
		bigBall = new Sphere(15);
		tank = new Cylinder(30,10);
		
		/*Melakukan penerapan dependency => hanya digunakan di method*/
		///compute the amount  of paint needed for each shape
		deckAmt = paint.amount(deck);
		ballAmt = paint.amount(bigBall);
		tankAmt = paint.amount(tank);
		
		//Print the amount of paint for each
		DecimalFormat fmt = new DecimalFormat("0.#");
		System.out.println("\n Number of gallons of paint needed ...");
		System.out.println("Deck "+ fmt.format(deckAmt));
		System.out.println("Big Ball "+ fmt.format(ballAmt));
		System.out.println("Tank "+fmt.format(tankAmt));

	}

}
