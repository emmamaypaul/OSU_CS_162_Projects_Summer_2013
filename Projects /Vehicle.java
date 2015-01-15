	
public class Vehicle implements Drivable //must have all the methods from the interface or else it won't compile 
{
	//notice variables are protected, so subclass can access the variables 
	protected double speed;
	protected int numberOfWheels; 
	protected int numberOfEntries; 
	
	public Vehicle() //same as class name 
	{
		speed = 0.0;
		numberOfWheels = (int)(Math.random()*4)*2; 
		numberOfEntries = (int)(Math.random()*7); //for 0-6 entries, so 7 total 
		
	}
	
	public void stop() //method to stop vehicle 
	{
		speed = 0.0;
	}
	
	public void accelerate(double acceleration)//method to speed up the vehicle 
	{
		speed += acceleration;
	}
	
	public void brake(double brakingPower)//method to slow vehichle down 
	{
		speed-= brakingPower;
	}
	
}


