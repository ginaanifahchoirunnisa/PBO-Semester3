package Exception_Handling;
import java.util.*;
public class Operasi_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] angka = {3,2,4,5};
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nomor index : ");
		int index = input.nextInt();
//		System.out.println("Array dengan index "+index+" adalah "+ angka[index]);
//		System.out.println("==== Akhir program ====");
		
		try {
			System.out.println("Array dengan index "+index+" adalah "+ angka[index]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Terjadi error => "+e);
		}
		
		System.out.println("==== Akhir program ====");
		
	}

}
