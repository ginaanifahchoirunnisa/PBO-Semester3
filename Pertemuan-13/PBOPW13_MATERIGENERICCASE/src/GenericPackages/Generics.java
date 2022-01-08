package GenericPackages;

/*pertukaran kedua nilai*/
public class Generics<T>{
	private T data;
	private T data2;
	
		
	public T getData2() {
		return data2;
	}


	public void setData2(T data2) {
		this.data2 = data2;
	}


	public T getData() {
		return data;
	}


	public void setData(T data) {
		this.data = data;
	}

	

	public void tukarNilai() {
		T temp;
		temp = data;
		data = data2;
		data2 = temp;
		
	}
	
	public void tampilHasilTukar() {
		System.out.println("data satu : "+data);
		System.out.println("data dua : "+data2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics<String> tukarString = new Generics <String>();
		tukarString.setData("Adana");
		tukarString.setData2("Marline");
		tukarString.tukarNilai();
		tukarString.tampilHasilTukar();
		
		
		Generics<Integer> tukarInteger = new Generics <Integer>();
		tukarInteger.setData(123);
		tukarInteger.setData2(456);
		tukarInteger.tukarNilai(); 
		tukarInteger.tampilHasilTukar();
		
		
		
	}

}
