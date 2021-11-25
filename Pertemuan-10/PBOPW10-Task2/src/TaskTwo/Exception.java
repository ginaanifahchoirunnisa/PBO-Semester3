package TaskTwo;
import java.util.*;
public class Exception {

	/*Exception handling*/
	public static int parseHexInt(String hex) {
		try {
			return Integer.parseInt(hex,16);
		}catch(NumberFormatException e) {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai inputan : ");
		String n = input.next();
		int result = parseHexInt(n);
		
		System.out.println("\n==================================\n");
		if(result != 0) {
			System.out.println("Result : "+result);
		}else {
			System.out.println("Invalid Hex Value");
		}
		
		
	}

}
