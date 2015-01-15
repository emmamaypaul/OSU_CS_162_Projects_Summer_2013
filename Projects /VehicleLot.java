
public class VehicleLot //class to create a bunch of random vehicles 
{
		public static void main(String[] args)
		{
			int vehicleLotSize = 20;
			Vehicle[] virtualVehicleLot = new Vehicle [vehicleLotSize];
			
			for (int i = 0; i< vehicleLotSize; i++) //a for loop to fill an array with Vehicle object, randomly of the standard or smart varieties
			{
				if(Math.random()<0.5)
					virtualVehicleLot[i] = new Vehicle(); //if math.random is less than .5, object is a Vehicle
				else
					virtualVehicleLot[i] = new SmartVehicle(); //else the object is a SmartVehicle
			}
			
			//now check if each vehicle is smart and report its number of wheels and entries if it is 
			Vehicle currentVehicle;
			int wheels;
			int entries;
			for(int i = 0; i< vehicleLotSize; i++)
			{
				currentVehicle = virtualVehicleLot[i];//sets variable currentVehicle to equal the current index (i) of the array
				if (SmartVehicle.class.isInstance(currentVehicle)) //if the current vehicle is an instance of a smartVehicle 
				{
					wheels = ((SmartVehicle)currentVehicle).getNumberOfWheels();//sets wheels variable to num wheels from Smart Vehicle
					entries = ((SmartVehicle)currentVehicle).getNumberOfEntries();
					System.out.printf("Vehicle #%d is a smart vehicle and has %d wheels and %d entries.\n",i, wheels, entries);
				}
				else
					System.out.printf("Vehicle #%d is not a smart vehicle and so I cannot tell how many wheels or entries it has until we go " +
							"look at it,\n", i);
				
			}
		}
		
}
