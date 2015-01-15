import javax.swing.*;


public class LectureNotes 
{
	//week 2 lectures on classes 
	//How to build a class: 1. Design and implement the instance fields, which store properties of the objects 
	//2. Design the public methods and comment of what method does them for what they do with @parameters and @return type 
	//3. Implement constructors and other private methods 
	
	//example class 
	public class Student
	{
		/*
		 * Access modifies: variables that are either public or private 
1. 			Private- accessible only by methods of the same class, used to prevent other classes from accessing this information
2.			Public- accessible by other classes, usually don't have public member variables, but if you do you need to create public methods to allow access to private data 
		 */
		
		private String name; //member variables (noun or descriptive phrase)
		private double GPA; //they store properties of an object 
		
		
		//if you don't make a constructor method Java will automatically make one for you but if you want both you must define them 
		public Student ()//default constructor, initialized to default values 
		{
			this.name = null; //"this" is a reference to self (i.e. the "current instantiation")
			this.GPA = 0.0; //"this" can be referenced within the scope of the class definition, but not outside it
		}
		
		public Student (String name, double GPA)//overloaded constructor that allows you to create student object 
		{
			/*Constructors are methods that allocate memory for the object, assigns address of object to object variable 
			 * Initializes the member variables 
			 * Properties: almost always PUBLIC, same name as the class it's in, no return type, not even void 
			 * Invoked by new (usually in main method) 
			 */
			this.name = name; 
			this.GPA = GPA; 
		}
		
		//accessor method, usually starts with "get", it accesses info without making modifications 
		public double getGPA()
		{
			return this.GPA;
		}
		
		//accessor method 
		public String getName()
		{
			return this.name;
		}
		
		//mutator method, usually starts with "set", modifies object on which it is invoked 
		public void setGPA (double GPA)
		{
			this.GPA = GPA;
		}
		
		/*
		 *the lines of code below would be in your main method
		double gpa = Student1.getGPA(); this uses your accessor method 	
		student1.setGPA(4.0); this uses your mutator method 	
		*/
	}
	
	//Inner class example 
	public class MyFrame
	{
		public static void main (String[] args)
		{
			final JLabel myLabel; //for ClickListener to access any local variables in main(), you need to make those variables final 
			class ClickListener implements Action Listener //the ClickListener class is only visible inside main()
			{
				public void actionPerformed (ActionEvent event)
				{
					System.out.println("Button Clicked");
				}
			}
		//.......(main method code) 
		}
	}
	
	//Inner class inside a class 
	public class MyFrame 
	{
		class ClickListener implements ActionListener 
		{
			public void actionPerformed(ActionEvent event) 
			{
				System.out.println("Button Clicked) ");
			}
		}
		//.........MyFrame code continued. Note that the ClickListener class is inside an enclosing class but outside its methods and is now 
		//available to all methods and member variables of the enclosing MyFrame class!!! 
		//It can also access all private member variables (like myLabel below) and there is no need to make myLabel final 
		public void createPanel 
		{
			//.....
		}
		private JLabel myLabel;
	}
	
	//GUI Notes 
	//GUIs are based on frames, which are top-level windows
	//First create a class (ie MyFrame) that extends a Jframe and add this to top of file: import javax.swing.*;
	public class MyFrame extends JFrame 
	{ 
		private JLabel label1;//add a member variable to MyFrame so that you can refer to the Jlabel reference later on that stores JLabel object
		private JButton button1;//button member variable 
		
		public MyFrame()//default constructor, won't do anything unless instantiated in main method (below) 
		{
			setSize (400, 200);
			setTitle ("Hello World");
			setDefaultCloseOperation(EXIT_ON_CLOSE);//exits when user closes window 
			this.label1 = new JLabel ("This is a label");//Instantiates the JLavel object by calling the constructor and that argument in it is what appears 
			this.button1 = new JButton("This is a button");//(You can get and test the text using getText() and setText()
			this.setLayout(new FlowLayout()); //creates a new FlowLayout object and sets the layout of the MyFrame objects, (line added right before widgets)
			this.add(label1);//adds the JLabel to the JFrame, which is different from adding the JLabel as a member variable
			//This line is needed because you have to repaint the JLabel to the JFrame and also pass relevant GUI events to the object 
			this.add(button1);
			this.listener = new ButtonListner(); //instantiates a Button Listener, needed for button to take action when user presses it 
			this.buttonA.addActionListener (this.listener); //registers the listener with the JButton object by grabbing buttonA and passing this.litener argument
			
			/*
			 * Border layout example code, starting where the this.label1 starts above: 
			 * this.buttonA = new JButton("Page_Start");
			 * this.buttonB = new JButton("Center");
			 * this.buttonC = new JButton("Line_Start");
			 * this.buttonD = new JButton("Page_End"); 
			 * this.buttonE = new JButton("Line_End");
			 * this.setLayout(new BorderLayout());
			 * this.add (buttonA, BorderLayout.PAGE_START);
			 * this.add (buttonB, BorderLayout.CENTER);
			 * this.add (buttonC, BorderLayout.LINE_START);
			 * this.add (buttonD, BorderLayout.PAGE_END);
			 * this.add (buttonE, BorderLayout.LINE_END);
			 * 
			 * 
			 * 
			 * GridLayout example code, starting at same place as above, it will place A and B on top of C and D for a 2 x 2 grid
			 * so it fills row first before moving to next row 
			 * this.buttonA = new JButton("A");
			 * this.buttonB = new JButton("B");
			 * this.buttonC = new JButton("C");
			 * this.buttonD = new JButton("D"); 
			 * this.setLayout (new GridLayout (2, 2));
			 * this.add (buttonA); 
			 * this.add (buttonB);
			 * this.add (buttonC);
			 * this.add (buttonD);
			 */
		}
		
		
		public static void main (String args[])
		{
			MyFrame fr = new MyFrame();
			fr.setVisible(true);
		}
	}
	
	
	
}
