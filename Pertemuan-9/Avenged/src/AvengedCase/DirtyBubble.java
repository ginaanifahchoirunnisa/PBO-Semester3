package AvengedCase;

import java.util.*; 

public class DirtyBubble extends SuperHero implements Power{
	
	Power laser = new LaserEye();
	Power fly = new Flying();
	
	
	public DirtyBubble(int lvlPower, String nm) {
		super(lvlPower,nm);
		addPower(fly);
		addPower(laser);
		
	}

	
	public void Identity() {
		System.out.println("Its "+this.name+" the DirtyBubble! It Has the Power level of "
	+this.powerLevel);
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+this.name);
		super.doPower();
	}
	
}
