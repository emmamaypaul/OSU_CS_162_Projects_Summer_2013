/**
 * @author Emma Paul 
 * July 21, 2013
 * Assignment 2 - Hangman Game
 * 
 * Class to draw the GUI frame and it's components from the HangmanDrawingLiteral
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.lang.*;
import java.util.*;
import java.util.List;

import javax.swing.*;

public class HangmanDrawing extends JFrame
{
	private Player guesser = new Player() //variable guesser is of type Player (which is created in the interface Player class)
	{

		@Override
		public char getGuess() {
			return ((String) model.getSelectedItem()).charAt(0);//when a letter is selected, it grabs it, and you have to set the object to be a character
		}}; //way to get input from comp player 
	private HangmanGameLogic gameState;  //runs the contructor and then returns an object of HangmanLogic type 
	//and binds it to the gameState variable
	private HangmanDrawingLiteral hangmanDrawing = new HangmanDrawingLiteral();
	private JButton playCharButton = new JButton("Play Character");
	private JTextField[] characters;
	private char[] keyPhrase;
	private DefaultComboBoxModel model;//I refactored this to be a field (got help from my tutor for this line!)
	
	
	//constructor 
	public HangmanDrawing(String keyPhrase, Player computerPlayer, List<String> letters)
	{
		
		if (computerPlayer != null)//if computer player has a non null value, assign it to be the guesser, otherwise the human will be the guesser, got help with tutor for this line
		{
			guesser = computerPlayer;
		}
		
		gameState = new HangmanGameLogic(keyPhrase, 13);
		this.add(hangmanDrawing);
		JPanel mainLayout = new JPanel();		
		this.add(mainLayout);
		
		
		mainLayout.add(playCharButton);
		
		hangmanDrawing.setBounds(hangmanDrawing.getX(), hangmanDrawing.getY(), 700, 700);
		this.keyPhrase = gameState.getKeyPhrase().toCharArray();//converts key phrase to character array 
		characters = new JTextField[this.keyPhrase.length]; //creates a new array of type JTextField and assigns it to characters 
		JPanel characterBox = new JPanel(new GridLayout(1, this.keyPhrase.length));
		for (int i= 0; i< this.keyPhrase.length; i++)
		{
			characters[i] = new JTextField(); //creates text field 
			characters [i].setText("_");//populates character box(text field) with _
			characterBox.add(characters[i]);//adding the box to the panel 
			characters[i].setEditable(false);//doesn't allow you to write in boxes 
		}
		
		mainLayout.add(characterBox);//adds panel to frame 
	
		playCharButton.setSize(100, 100);
		
		playCharButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {  //this method gets called whenever the action is done, a callback 
				CurrentState();
			}});
		
		model = new DefaultComboBoxModel();
		JComboBox comboBox = new JComboBox(model);
		mainLayout.add(comboBox);
		for(String chartoadd: letters)
		{
			model.addElement(chartoadd);
		}
	}
	
	 void CurrentState() //void return type because doesn't return anything 
	 //this is the function that gets called to play a character 
	{
		char currentGuess = guesser.getGuess();//assigns guess to current guess variable (using getGuess method) 
		try
		{
			
		
		if(gameState.guessCharacter(currentGuess))//puts correct guesses into boxes 
		{
			for(int i = 0; i< keyPhrase.length; i++)
			{
				if(currentGuess == keyPhrase[i])
				{
					characters[i].setText(Character.toString(currentGuess));
				}
			}
		}
		else
		{
			this.hangmanDrawing.displayNewBodyPart();//update state 
			this.update(this.getGraphics());//redraw it 
		}
		if(gameState.isGameOver())
		{
			JFrame myNewFrame = new JFrame();
			JLabel gameOverLost = new JLabel("Game Over! You Lost");
			myNewFrame.add(gameOverLost);
			myNewFrame.setVisible(true);
		}
		//else if (!(gameState.getKnownKeyPhrase(guessedCharacters).contains("_")))
		else if (!(gameState.getKnownKeyPhrase().contains("-")))
		{
			JFrame myNewestFrame = new JFrame();
			JLabel gameOverWon = new JLabel("Game Over! You won!");
			myNewestFrame.add(gameOverWon);
			myNewestFrame.setVisible(true);
		}
			
		
		}
		catch (Exception e){}
		//if statement to see if game is over (have jtext boxes saying game over or won
	}
	 
	 
}
