package mta.se.tema5.beings.interfaces;

/**
 * Interface that models the basic functions of a plant
 * 
 * @author petru scurtu
 * @version 1.0
 * @since 11.11.2014
 * 
 */
public interface IPlant {

	/**
	 * Sleep function - will make the plant sleep
	 * 
	 * @param none
	 * @return none
	 */
	public void sleep();

	/**
	 * Photosynthesis - the plant eats and sleeps
	 * 
	 * @param none
	 * @return none
	 * 
	 */
	public void makePhotosynthesis();

	/**
	 * Die function - will kill the animal
	 * 
	 * @param none
	 * @return none
	 * 
	 */
	public void die();

}
