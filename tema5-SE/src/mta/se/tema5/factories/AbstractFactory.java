package mta.se.tema5.factories;

import mta.se.tema5.beings.interfaces.IAnimal;
import mta.se.tema5.beings.interfaces.IHuman;
import mta.se.tema5.beings.interfaces.IPlant;

/**
 * abstract class which creates factory classes
 * 
 * @author petru scurtu
 *
 */
public abstract class AbstractFactory {
	/**
	 * will create an IHuman object
	 * 
	 * @param name - the name of the person
	 * @param race - the race of the person - Caucasian,Negroid,Mongoloid
	 * @param nation - the name of the person
	 * @return an IHuman object
	 */
	public abstract IHuman makeHuman(String name,String race,String nation); 
	
	/**
	 * will create an IAnimal object
	 * 
	 * @param name - the name of the animal
	 * @param type - the type of the animal - Carnivore,Omnivore,Herbivore
	 * @param species -the species of the animal
	 * @return an IAnimal object
	 */
	public abstract IAnimal makeAnimal(String name,String type,String species);
	
	/**
	 * will create an IPlant object
	 * 
	 * @param name - the name of the plant
	 * @param type - the type of plant - Carnivore,Ordinary
	 * @param species - the species of the plant
	 * @return An IPlant object
	 */
	public abstract IPlant makePlant(String name,String type,String species);
}
