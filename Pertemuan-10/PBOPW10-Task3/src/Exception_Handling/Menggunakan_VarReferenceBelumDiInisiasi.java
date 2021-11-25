package Exception_Handling;

public class Menggunakan_VarReferenceBelumDiInisiasi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int values[];
		values = new int[3];
//		for (int i : values) {
//			System.out.println("values : "+ i);
//		}
		
		try {
			for (int i : values) {
				System.out.println("values : "+ i);
			}
		}catch(Exception e) {
			System.out.println("Terjadi error => "+ e);
		}
	}

}
