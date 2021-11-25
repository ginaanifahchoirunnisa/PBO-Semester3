package Exception_Handling;
import java.io.*;
import java.util.*;
public class Operasi_file {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		File file = new File("D:\\giker.txt");
//	      Scanner fileInput = new Scanner(file);
//	      while (fileInput.hasNextLine()) {
//	        String fileData = fileInput.nextLine();
//	        System.out.println(fileData);
//	      }
//	      fileInput.close();
//		
//		System.out.println("=== Akhir Program ===");

		
		
	      
		
		try {
			File file = new File("D:\\gikesr.txt");
		      Scanner fileInput = new Scanner(file);
		      while (fileInput.hasNextLine()) {
		        String fileData = fileInput.nextLine();
		        System.out.println(fileData);
		      }
		      fileInput.close();
		}catch(FileNotFoundException e) {
			System.out.println("Terjadi error => "+e);
		}
	      
	      
	      
	      
	}

}
