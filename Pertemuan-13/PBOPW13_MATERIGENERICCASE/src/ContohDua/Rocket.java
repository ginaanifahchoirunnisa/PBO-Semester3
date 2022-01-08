package ContohDua;

class Rocket extends Vehicle implements IVehicle{
	 static int rocketCount;
	 @Override
	 public void constructBody() {
		 rocketCount++;
		 System.out.println("Rocket akan jalan ,rocket ke : " + rocketCount);
	 }
}
