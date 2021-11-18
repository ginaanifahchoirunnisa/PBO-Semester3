package AvengedCase;

import java.util.*;

public class MainAvenged {
	
	
	public static void addSuperHero(List<SuperHero> s,String name,int lvl,String KindOfhero) {
		SuperHero temp = null;
		switch(KindOfhero) {
			case "FlyingDutchMan":
				temp = new FlyingDutchMan(lvl, name);
				break;
			case "ManRay":
				temp = new ManRay(lvl, name);
				break;
			case "DirtyBubble":
				temp = new DirtyBubble(lvl, name);
				break;
		}
		s.add(temp);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<SuperHero> superhero = new ArrayList<SuperHero>();
		 addSuperHero(superhero, "Gennichiro", 0, "ManRay");
		 addSuperHero(superhero, "Shirai", 255, "FlyingDutchMan");
		 addSuperHero(superhero, "Gyoubu Masataka Oniwa", 553, "ManRay");
		 addSuperHero(superhero, "Tatenari", 36556, "FlyingDutchMan");
		 addSuperHero(superhero, "Arnastria", 666, "DirtyBubble");
		 
		 //sorting dengan comparable
		 Collections.sort(superhero);
		
		for(SuperHero heroes : superhero) {
			System.out.println("=====================================================");
			heroes.Identity();
			System.out.println("=====================================================");
		}
	}

}
