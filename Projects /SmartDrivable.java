
public interface SmartDrivable extends Drivable //extends in order to add new methods but use the methods from Drivable too
{
	int getNumberOfWheels();
	int getNumberOfEntries();
	double getCurrentSpeed();
}