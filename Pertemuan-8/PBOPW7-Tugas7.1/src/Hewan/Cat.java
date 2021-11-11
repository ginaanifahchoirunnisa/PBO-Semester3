package Hewan;

public class Cat extends Animal {
	public void sound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal obj = new Cat();
		obj.sound();
	}

}
