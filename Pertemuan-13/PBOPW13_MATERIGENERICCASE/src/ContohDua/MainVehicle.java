package ContohDua;
import java.util.*;

class MainVehicle {
	 public static void constructAllVehicles(List<? extends Vehicle> 
		vehicleList) {
		 System.out.println("\nList Vehicle tersedia"
		 		+ " : ");
		 vehicleList.forEach((vehicle) -> vehicle.constructBody());
	}

	 public static void main(String[] args) {
		 //One Vehicle object
		 Vehicle vehicle1=new Vehicle();
		 // Three Bus objects
		 Bus bus1 = new Bus();
		 Bus bus2 = new Bus();
		 Bus bus3 = new Bus();
		 // Two Rocket objects
		 Rocket rocket1 = new Rocket();
		 Rocket rocket2 = new Rocket();
		 // List of anytype of vehicles.Vehicle type or its subtypes 
		//can be added.
		 ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		 // Adding one vehicle,one bus and one rocket in the list
		 vehicles.add(vehicle1);
		 vehicles.add(bus1);//ok
		 vehicles.add(rocket1);//ok
		 constructAllVehicles(vehicles);// ok
		 // List of specific vehicles(buses) only
		 ArrayList<Bus> buses = new ArrayList<Bus>();
		 // Adding three buses in the list
		 buses.add(bus1);
		 //error: cannot add a rocket to a bus list
		 // buses.add(rocket1);
		 // error if you do not use wildcard in the method
		 constructAllVehicles(buses);
		 // List of specific vehicles(rockets) only
		 ArrayList<Rocket> rockets = new ArrayList<Rocket>();
		// Construct all vehicles in the list
		 // public static void constructBody(List<Vehicle> vehicleList) {
		
	}
}