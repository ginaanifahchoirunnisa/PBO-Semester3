package Exception_Handling;
import java.util.*;
public class Operasi_Pembagian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan angka yang dibagi : ");
		int a = input.nextInt();
		System.out.print("\nMasukkan angka pembagi : ");
		int b = input.nextInt();
		int hasil ;
//		hasil = a/b;
//		System.out.println("\nHasil pembagian "+a+" : "+b +" = "+ hasil);
//		System.out.println("akhir program");
		
		try {
			hasil = a/b;
			System.out.println("\nHasil pembagian "+a+" : "+b +" = "+ hasil);
		}catch(ArithmeticException e){
			System.out.println("\nTerjadi error => "+e);
		}
		
		System.out.println("akhir program");
		
		
		
		
		
		
		
		
		
		
		
		
//		try {
//			hasil = a/b;
//			System.out.println("\nHasil pembagian "+a+" : "+b +" = "+ hasil);
//		}catch(ArithmeticException e){
//			System.out.println("\nTerjadi pembagian dengan angka 0");
//		}
	}

}
