package org.junit.jupiter.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public abstract class Flight {
	private String id;
	List<Passenger> passengers = new ArrayList<Passenger>();
	
	public Flight(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public List<Passenger> getPassengersList() {
		return Collections.unmodifiableList(passengers);
	}
	public abstract boolean addPassenger(Passenger passenger);
	public abstract boolean removePassenger(Passenger passenger);
	
	
	
	
	
	
//	 private String id;
//	 private List<Passenger> passengers = new ArrayList<Passenger>();
//	 private String flightType;
//	 
//	 public Flight(String id, String flightType) {
//		 this.id = id;
//		 this.flightType = flightType;
//	 }
//	 
//	 public String getId() {
//		 return id;
//	 }
//	 
//	 public List<Passenger> getPassengersList() {
//		 return Collections.unmodifiableList(passengers);
//	 }
//	 
//	 public String getFlightType() {
//		 return flightType;
//	 }
//	 
//	 public boolean addPassenger(Passenger passenger) {
//		 switch (flightType) {
//		 case "Economy":
//			 return passengers.add(passenger);
//		 case "Business":
//			 if (passenger.isVip()) {
//				 return passengers.add(passenger);
//			 }
//			 	return false;
//			 	
//		default:
//			throw new RuntimeException("Unknown type: " + flightType);
//			 }
//	 }
//	 
//	 public boolean removePassenger(Passenger passenger) {
//		 switch (flightType) {
//		 case "Economy":
//			 if (!passenger.isVip()) {
//				 return passengers.remove(passenger);
//			 }
//			 return false;
//		 case "Business":
//			 return false;
//		 default:
//			 throw new RuntimeException("Unknown type: " + flightType);
//		 }
//	 }
}
