package AvengedCase;

import java.util.*;

public class ManRay extends SuperHero{
	
	public ManRay(int lvlPower, String nm) {
		super(lvlPower,nm);
		Power laser = new LaserEye();
		Power strength = new Strength();
		super.addPower(laser);
		super.addPower(strength);
	}
	
	public void Identity() {
		System.out.println("Its "+super.getName()+" the ManRay! It Has the Power level of "
	+ super.getPowerLevel());
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+super.getName().toUpperCase());
		super.showPower();
		
	}
	
	
	
}
