package AvengedCase;
import java.util.*;
public class FlyingDutchMan extends SuperHero{
	

	
	public FlyingDutchMan(int lvlPower, String nm){
		super(lvlPower, nm);
		Power fly = new Flying();
		Power laser = new LaserEye();
		super.addPower(fly);
		super.addPower(laser);
	}
		

	
	public void Identity() {
		System.out.println("Its "+super.getName()+" the FlyingDutchMan! It Has the Power level of "
	+super.getPowerLevel());
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+super.getName().toUpperCase());
		super.showPower();
	}
	
}
