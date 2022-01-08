package ContohDua;

import java.util.ArrayList;
import java.util.List;
class Vehicle implements IVehicle{
static int basicVehicleCount;
 // Construct some basic structure of an individual vehicle
 public void constructBody() {
	 basicVehicleCount++;
	 System.out.println("Perjalanan ke - "+ basicVehicleCount);
 }
 
}


