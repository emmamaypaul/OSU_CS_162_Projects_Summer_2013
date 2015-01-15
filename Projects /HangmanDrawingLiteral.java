/**
 * @author Emma Paul 
 * July 21, 2013
 * Assignment 2 - Hangman Game
 * 
 * GUI class for adding body parts as game is played 
 */

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;
import javax.swing.JPanel;


public class HangmanDrawingLiteral extends JComponent
{
	private int numBodyPartsDisplayed = 0;
	public HangmanDrawingLiteral()
	{
		this.setMinimumSize(new Dimension(100,100));
	}
	public void displayNewBodyPart()
	{
		numBodyPartsDisplayed++;
	}
	public void paintComponent(Graphics g) //I referenced pg 66 to make my graphics! 
	{
		double x = 150;
		double y = 40;
		double diameter= 60;
		double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14, x15, x16;
		double y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, y11;
		//code to draw neck line 
				x1 = x + 30; //add 30 to go to center of circle point since radius is 30
				  x2 = x1 + 80;
				  x3 = x1 - 80;
				  x4 = x2 + 30;
				  x5 = x3 - 30;
				  x6 = x2 + 20;
				   x7 = x3 - 20;
			    y1 = y + 60; //add 60 (length of circle diameter) to start point at bottom of circle
				y2 = y1 + 30; //add 30 to make nick line 
				 y3 = y2 + 120;
				   y4 = y3 + 70;
					 y5 = y2 - 10;
				y8 = y4 + 40;//for structure 
				x11 = x1 - 10;
				y9 = y1 - 13;
			    x12 = x11 + 20;
			    x15 = x11 + 3;
			    x16 = x11 - 3;
				  x13 = x12 + 3;
					 x14 = x12 - 3;
					 y10 = y9 - 20;
				     y11 = y10 - 5;
					
		Graphics2D g2 = (Graphics2D) g;//prepare for graphics 
		
		//code to draw hanging structure for hangman 
		y6 = 40;
		y7 = y6 - 30;
		Line2D.Double segment11 = new Line2D.Double(180, y6, 180, y7);//line above head 
		g2.draw(segment11);
		x8 = 180 + 150;
		Line2D.Double segment12 = new Line2D.Double(180, y7, x8, y7);//top line to right 
		g2.draw(segment12);
		
		Line2D.Double segment13 = new Line2D.Double(x8, y7, x8, y8);//line for body of structure
		g2.draw(segment13);
		x9 = 180 - 150;
		x10 = x8 + 70;
		Line2D.Double segment14 = new Line2D.Double(x9, y8, x10, y8);//line for base of structure
		g2.draw(segment14);
		
		if(numBodyPartsDisplayed > 0)
		{
		//code to draw circle for head
		
		Ellipse2D.Double circle = new Ellipse2D.Double(x, y, diameter, diameter);
		g2.draw(circle);
	    }
		if(numBodyPartsDisplayed > 1)
		{
		
		Point2D.Double from = new Point2D.Double(x1, y1);
		Point2D.Double to = new Point2D.Double(x1, y2);
		Line2D.Double segment = new Line2D.Double(from, to);
		g2.draw(segment);
		}
		
		if(numBodyPartsDisplayed > 2 )
		{
		//code to draw right arm 
	  
		Line2D.Double segment2 = new Line2D.Double(x1, y2, x2, y2);
		g2.draw(segment2);
		}
		
		if(numBodyPartsDisplayed > 3)
		{
		//code to draw left arm 
	
		Line2D.Double segment3 = new Line2D.Double(x1, y2, x3, y2);
		g2.draw(segment3);
		}
		
		if(numBodyPartsDisplayed > 4)
		{
		//code to draw body 
	   
		Line2D.Double segment4 = new Line2D.Double(x1, y2, x1, y3);
		g2.draw(segment4);
		}
		
		if(numBodyPartsDisplayed > 5)
		{
		//code to draw right leg
	 
		Line2D.Double segment5 = new Line2D.Double(x1, y3, x2, y4);
		g2.draw(segment5);
		}
		
		if(numBodyPartsDisplayed > 6)
		{
		//code to draw left leg 
		Line2D.Double segment6 = new Line2D.Double(x1, y3, x3, y4);
		g2.draw(segment6);
		}
		
		if(numBodyPartsDisplayed > 7)
		{
		//code to draw right foot 
	
		Line2D.Double segment7 = new Line2D.Double(x2, y4, x4, y4);
		g2.draw(segment7);
		}
		
		if(numBodyPartsDisplayed > 8)
		{
		//code to draw left foot 
		
		Line2D.Double segment8 = new Line2D.Double(x3, y4, x5, y4);
		g2.draw(segment8);
		}
		
		if(numBodyPartsDisplayed > 9)
		{
		//code to draw right hand 
		
		Line2D.Double segment9 = new Line2D.Double(x2, y2, x6, y5);
		g2.draw(segment9);
		}
		
		if(numBodyPartsDisplayed > 10)
		{
		//code to draw left hand 
	 
		Line2D.Double segment10 = new Line2D.Double(x3, y2, x7, y5);
		g2.draw(segment10);
		}
		
		if(numBodyPartsDisplayed > 11)
		{
		//code to draw mouth 
		
		Line2D.Double segment15 = new Line2D.Double(x11, y9, x12, y9);
		g2.draw(segment15);
		}
	    
		if(numBodyPartsDisplayed > 12)
		{
	    //code to draw right dead eye
	   
		Line2D.Double segment16 = new Line2D.Double(x14, y10, x13, y11);
		g2.draw(segment16);
		Line2D.Double segment17 = new Line2D.Double(x14, y11, x13, y10);
		g2.draw(segment17);
		}
		
		if(numBodyPartsDisplayed > 13)
		{
		//code to draw left dead eye
	  
		Line2D.Double segment18 = new Line2D.Double(x15, y11, x16, y10);
		g2.draw(segment18);
		Line2D.Double segment19 = new Line2D.Double(x15, y10, x16, y11);
		g2.draw(segment19);
		}
    }
	

}
