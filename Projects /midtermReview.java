
public class midtermReview 
{
	public class Dog//whenever you see class you should think declaration 
	{
		String name;
		int age;
		boolean good;
		
		//constructor name has to be same as class name, only method looking that doesn't have a turn type 
		public Dog (String name, int age, boolean good)
		{
			this.name = name;//initialization -new value something attains 
			this.age = age;
			this.good = good;
		}
		
		public String barkAge()
		{
			String retval = "";
			for (int i = 0; i<this.age; i++)
			{
				retval += "woof";
			}
			return retval;
		}
		
	}
	//where we instantiate - make an object 
	public class mainClass
	{
		public void main() 
		{
			String name2 = "Taffy";
			int age2 = 10;
			boolean good = true;
					
			Dog sammy = new Dog("Sammy", 15, true);//literals n
			Dog taffy = new Dog(name2, age2, good);
		}
	}
	//encapsulation is shoving everything you need to run inside a class (bundling methods in one place)
	
}
