package mta.se.tema5.beings.animals;

import mta.se.tema5.beings.interfaces.IAnimal;

/**
 * represents a carnivorous animal
 * 
 * @author petru scurtu
 * @category animals
 */
public class CarnivoreAnimal implements IAnimal {
	/**
	 * the name of the animal
	 */
	private String name;
	/**
	 * the species of the animal
	 */
	private String species;
	
	/**
	 * constructor 
	 * @param name - the name of the animal
	 * @param species - the species of the animal
	 */
	public CarnivoreAnimal(String name, String species) {
		super();
		this.name = name;
		this.species = species;
	}

	/**
	 * will make the animal sleep
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+name+" will go to sleep");
	}

	/**
	 * will make the animal eat
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The "+name+" is eating");
	}

	/**
	 * will kill the animal
	 */
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("The "+name+" will die");
	}
	
	/**
	 * will make the animal hunt
	 */
	public void hunt(){
		System.out.println("The "+name+" will hunt");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the species
	 */
	public String getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(String species) {
		this.species = species;
	}

}
