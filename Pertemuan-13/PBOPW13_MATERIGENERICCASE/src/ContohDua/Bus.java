package ContohDua;

class Bus extends Vehicle implements IVehicle{
	 static int busCount;
	 @Override
	 public void constructBody() {
		 busCount++;
		 System.out.println("Bus akan jalan , Bus ke :" + busCount);
	 }
	 
	 
}