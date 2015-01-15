//interfaces gaurentee functionality by making the contract 
public interface Drivable //new interface 
{
	//these methods do not have a body definition 
	void stop();
	void accelerate (double acceleration);
	void brake (double acceleration); //it's okay the method has the same parameter name as above because the signature (name and paramater type)
	//is what Java uses to determine which method to call 
}