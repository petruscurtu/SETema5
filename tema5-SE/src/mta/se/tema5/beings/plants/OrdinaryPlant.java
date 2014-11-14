package mta.se.tema5.beings.plants;

import mta.se.tema5.beings.interfaces.IPlant;

/**
 * represents a oridnary plant
 * 
 * @author petru scurtu
 * @category plants
 */
public class OrdinaryPlant implements IPlant{
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
	public OrdinaryPlant(String name, String species) {
		super();
		this.name = name;
		this.species = species;
	}
	
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("The "+name+" will go to sleep");
		
	}

	@Override
	public void makePhotosynthesis() {
		// TODO Auto-generated method stub
		System.out.println("The "+name+" is making photosynthesis and thus is breathing");
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println("The "+name+" will die");
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
