/**
 * Class for GUI in hangman
 * @author emmamaypaul
 *   
 *   
 *  
 */
import javax.swing.*;
import java.awt.*;
import java.applet.Applet;

public class HangmanGuiPractice extends Applet //not JFrame?
{
	private static final int FRAME_WIDTH = 800; //referenced Big Java pg 741
	private static final int FRAME_HEIGHT = 800;
	
	private JLabel title;
	private JLabel hangmanGraphic;
	private JLabel lettersToChooseFrom;
	private JLabel lettersAlreadyChosen;
	private JLabel lettersCorrect;
	
	
	public HangmanGuiPractice() //for HangmanFrame 
	{
		//createTextField();
		//createPanel();
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	//	setTitle ("Hangman Game");
	//	setDefaultCloseOperation(EXIT_ON_CLOSE);//exits when user closes window 
		
		Panel p = new Panel();
		p.setLayout(new BorderLayout());
		
		 this.title = new JLabel("Hangman Game");
		 this.hangmanGraphic = new JLabel("This is where the hangman graphic will go");
		 this.lettersToChooseFrom = new JLabel("Please choose a letter to guess from the drop down box");
		 this.lettersAlreadyChosen = new JLabel("List of letters already chosen"); 
		 this.lettersCorrect = new JLabel("Correct Guesses");
		 //this.setLayout(new BorderLayout());//sets layout to border layout 
		 this.add (title, BorderLayout.PAGE_START);
		 this.add (hangmanGraphic, BorderLayout.CENTER);
		 this.add (lettersToChooseFrom, BorderLayout.LINE_START);
		 this.add (lettersAlreadyChosen, BorderLayout.PAGE_END);
		 this.add (lettersCorrect, BorderLayout.LINE_END);
		
	
	}
}




/*
	public static void main (String args[])
	{
		HangmanFrame fr = new HangmanFrame();
		fr.setVisible(true);
	}
	
}
*/