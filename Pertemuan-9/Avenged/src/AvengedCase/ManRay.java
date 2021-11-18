package AvengedCase;

import java.util.*;

public class ManRay extends SuperHero implements Power{
	
	
	public ManRay(int lvlPower, String nm) {
		super(lvlPower,nm);
		Power laser = new LaserEye();
		Power strength = new Strength();
		super.addPower(laser);
		super.addPower(strength);
	}
	
	public void Identity() {
		System.out.println("Its "+this.name+" the ManRay! It Has the Power level of "
				+this.powerLevel);
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+this.name);
		super.doPower();
	}
	
	
	
}
