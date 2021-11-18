package AvengedCase;

import java.util.*; 

public class DirtyBubble extends SuperHero{
	
	
	public DirtyBubble(int lvlPower, String nm) {
		super(lvlPower,nm);
		Power laser = new LaserEye();
		Power fly = new Flying();
		super.addPower(fly);
		super.addPower(laser);
		
	}

	
	public void Identity() {
		System.out.println("Its "+super.getName()+" the DirtyBubble! It Has the Power level of "
	+super.getPowerLevel());
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+super.getName().toUpperCase());
		super.showPower();
	}
	
}
