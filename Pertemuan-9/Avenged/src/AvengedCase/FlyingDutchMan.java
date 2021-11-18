package AvengedCase;
import java.util.*;
public class FlyingDutchMan extends SuperHero implements Power{
	
	Power fly = new Flying();
	Power laser = new LaserEye();
	
	
	public FlyingDutchMan(int lvlPower, String nm){
		super(lvlPower, nm);
		addPower(fly);
		addPower(laser);
	}
		

	
	public void Identity() {
		System.out.println("Its "+this.name+" the FlyingDutchMan! It Has the Power level of "
	+this.powerLevel);
		System.out.println("......HEED ME......");
		System.out.println("FOR MY NAME IS "+this.name);
		super.doPower();
	}
	
}
