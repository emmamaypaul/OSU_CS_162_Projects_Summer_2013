/**  @Author Joseph Jess
 *	 @version 0.1, 01/20/2013
 *   This is an exception intended for being thrown when a new guess has already been made
 **/
public class Ass3AlreadyGuessedException extends Exception 
{	
    public Ass3AlreadyGuessedException(String message)
    {
		super(message);
    } 
}
