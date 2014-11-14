package mta.se.tema5.beings.humans;

import mta.se.tema5.beings.interfaces.IHuman;

/**
 * represents a negroid human
 * 
 * @author petru scurtu
 * @category humans
 */
public class Negroid implements IHuman {

	/**
	 * the name of the person
	 */
	private String name;
	/**
	 * the race of the person
	 */
	private final String race = "Caucasian";
	/**
	 * the nation of the person
	 */
	private String nation;

	/**
	 * constructor
	 * 
	 * @param name
	 *            - the name of the person
	 * @param nation
	 *            - the nation of the person
	 */
	public Negroid(String name, String nation) {
		super();
		this.name = name;
		this.nation = nation;
	}

	/**
	 * will make the person sleep
	 */
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name + " is sleeping");
	}
	
	/**
	 * will make the person work
	 */
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(name + " is working");
	}

	/**
	 * will make the person eat
	 */
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name + " is eating");
	}
	
	/**
	 * will kill the person
	 */
	@Override
	public void die() {
		// TODO Auto-generated method stub
		System.out.println(name + " will die");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * @param nation
	 *            the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * 
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

}
