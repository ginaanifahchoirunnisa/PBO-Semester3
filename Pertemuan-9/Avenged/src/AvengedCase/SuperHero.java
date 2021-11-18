package AvengedCase;
import java.util.*;

public abstract class SuperHero implements Power{
	protected int powerLevel;
	protected String name;
	protected ArrayList<Power> powerList;
	
	public SuperHero(int lvlPower, String nm) {
		powerLevel = lvlPower;
		name = nm;
		this.powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public abstract void Identity();
	
	public void showPower() {
		for(Power pow : powerList) {
			pow.doPower();
		}
	}
	
	public void doPower() {
		System.out.println("TIME TO SHOW MY POWERS");
		showPower();
	}
}
