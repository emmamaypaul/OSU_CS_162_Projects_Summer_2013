
//This class holds a single person's information, and is used in the main to create an object 
public class Lab1Helper 
{
		private String name;//
		private int age; 
		private String gender;
		
		/* constructor method for creating Lab1Helper objects 
		 * @param newName, a name for the new Lab1Helper object
		 * @param newAge, the age of the new Lab1Helper object 
		 * @param newMass, the mass of the new Lab1Helper object 
		 */
		public Lab1Helper(String newName, int newAge, String newGender)
		{
			name= newName;
			age= newAge; 
			gender = newGender; 
		}
		/* accessor method for getting a Lab1Helper object's name 
		 * @return name, the name of the Lab1Helper object that this method is called on 
		 */
		public String getName()
		{
			return name; 
		}
		/* accessor method for getting a Lab1Helper object's age
		 * @return age, the age of the Lab1Helper object that this method is called on 
		 */
		public double getAge()
		{
			return age; 
		}
		/* mutator method for setting a Lab1Helper object's name
		 * @param name, the new name for the Being object that this method is called on
		 */
		public void setName(String name)
		{
			this.name=name;
		}
		/* toString method for getting a String representation of Being object 
		 * @return result, the name and apparent age of the Being object that this method is called on 
		 */

		public String toString()
		{
			String result = "The name of this person is: " + name + "," + 
				"\n The age of this person is:" + age + "years old," + 
				"\n The gender of this person is: " + gender;
			return result;
		}
}
