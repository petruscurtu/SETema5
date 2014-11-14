package mta.se.tema5.beings.interfaces;

/**
 * Interface that models the basic functions of a human
 * 
 * @author petru scurtu
 * @version 1.0
 * @since 11.11.2014
 * 
 */
public interface IHuman {
	
	/**
	 * Sleep function - will make the person sleep
	 * 
	 * @param none
	 * @return none
	 */
	public void sleep();
	
	/**
	 * Work function - will make the person work
	 * 
	 * @param none
	 * @return none
	 */
	public void work();
	
	/**
	 * Eat function - will make the person eat
	 * 
	 * @param none
	 * @return none
	 */
	public void eat();
	
	/**
	 * Die function - will kill the person
	 * 
	 * @param none
	 * @return none
	 */
	public void die();

}
