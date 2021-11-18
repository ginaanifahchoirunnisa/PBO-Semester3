package AvengedCase;

import java.util.*;

public class MainAvenged {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperHero [] superhero;
		superhero = new SuperHero[5];
	
		
		superhero[0] = new ManRay(0,"Gennichiro");
		superhero[1] = new FlyingDutchMan(255,"Shirai");
		superhero[2] = new ManRay(553,"Gyoubu Masataka Oniwa");
		superhero[3] = new DirtyBubble(666, "Arnastria");
		superhero[4] = new FlyingDutchMan(36556,"Tatenari");
		
		for(SuperHero heroes : superhero) {
			System.out.println("=====================================================");
			heroes.Identity();
			System.out.println("=====================================================");
		}
	}

}
