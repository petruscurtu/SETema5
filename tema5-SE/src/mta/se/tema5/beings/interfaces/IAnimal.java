package mta.se.tema5.beings.interfaces;

/**
 * Interface that models the basic functions of an animal
 * 
 * @author petru scurtu
 * @version 1.0
 * @since 11.11.2014
 * 
 */
public interface IAnimal {
	

	/**
	 * Sleep function - will make the animal sleep
	 * 
	 * @param none
	 * @return none
	 */
	public void sleep();

	/**
	 * Eat function - will make the animal eat
	 * 
	 * @param none
	 * @return none
	 */
	public void eat();

	/**
	 * Die function - will kill the animal
	 * 
	 * @param none
	 * @return none
	 * 
	 */
	public void die();
	

}
