package AvengedCase;
import java.util.*;

public abstract class SuperHero implements Power{
	protected int powerLevel;
	protected String name;
	protected ArrayList<Power> powerList;
	
	/*inisiasi data*/
	public SuperHero(int lvlPower, String nm) {
		powerLevel = lvlPower;
		name = nm;
		powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}
	
	public String getName() {
		return name;
	}
	
	/*Melakukan penambahan power*/
	public void addPower(Power power) {
		powerList.add(power);
	}
	
	public abstract void Identity();
	
	/*Menampilkan seluruh power yang ada dalam superhero*/
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
