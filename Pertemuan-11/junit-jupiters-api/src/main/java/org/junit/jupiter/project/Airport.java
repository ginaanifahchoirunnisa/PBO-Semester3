package org.junit.jupiter.project;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flight economyFlight = new EconomyFlight("1");
		Flight businessFlight = new BusinessFlight("2");
		Passenger james = new Passenger("James", true);
		Passenger mike = new Passenger("Mike", false);
		
		businessFlight.addPassenger(james);
		businessFlight.removePassenger(james);
		businessFlight.addPassenger(mike);
		economyFlight.addPassenger(mike);
		
		System.out.println("Business flight passengers list:");
		
		for (Passenger passenger: businessFlight.getPassengersList()) {
			System.out.println(passenger.getName());
		}
			System.out.println("Economy flight passengers list:");
		for (Passenger passenger: economyFlight.getPassengersList()) {
			System.out.println(passenger.getName());
		}
	}

}
