package Exception_Handling;
import java.util.*;
public class Menjalankan_TextField {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan Angka : ");
//		int angka = input.nextInt();
//		System.out.println("angka : "+angka);
		
		try {
			int angka = input.nextInt();
			System.out.println("angka : "+angka);
		}catch(Exception e) {
			System.out.println("Terjadi error => "+e);
		}
		
		System.out.println("Akhir program");
	}

}
