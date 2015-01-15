
public class SmartVehicle extends Vehicle implements SmartDrivable 
{
	public SmartVehicle()
	{
		super(); //uses the constructor of the Vehicle, parent class
	}
	
	public int getNumberOfWheels()
	{
		return numberOfWheels;
	}
	
	public int getNumberOfEntries() //smart vehicle can tell how many entries it has 
	{
		return numberOfEntries;
	}
	
	public double getCurrentSpeed() //can tell how fast it's going 
	{
		return speed;
	}
	
	//my SmartVehicle is somehow better at accelerating than the standard Vehicle, as reflected in my overriding accelerate method
	@Override //this allows the SmartVehicle to use this accelerate method, which is what you want for a faster smartvehivle 
	public void accelerate(double accel)
	{
		speed += 2*accel; //this method overrides the parent method, which is what you want because it is more appropriate for a faster car  
	}
	
	public void brake()//doesn't take a double like the parent class does, which is called overloading (ie using the same method name for two or more 
	//methods but using different arguments or parameter lists 
	{
		speed -= 1; //breaks by reducing speed by 1, and this method overloads the break method 
	}
}