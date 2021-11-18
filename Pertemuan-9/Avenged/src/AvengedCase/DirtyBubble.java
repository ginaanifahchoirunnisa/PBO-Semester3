package AvengedCase;

import java.util.*; 

public class DirtyBubble extends SuperHero{
	
	Power laser = new LaserEye();
	Power fly = new Flying();
	
	
	public DirtyBubble(int lvlPower, String nm) {
		super(lvlPower,nm);
		super.addPower(fly);
		super.addPower(laser);
		
	}

	
	public void Identity() {
		System.out.println("Its "+this.name+" the DirtyBubble! It Has the Power level of "
	+this.powerLevel);
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+(this.name).toUpperCase());
		super.doPower();
	}
	
}
