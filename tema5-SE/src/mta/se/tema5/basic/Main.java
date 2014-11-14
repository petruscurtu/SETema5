/**
 * 
 */
package mta.se.tema5.basic;

import mta.se.tema5.beings.interfaces.IAnimal;
import mta.se.tema5.beings.interfaces.IHuman;
import mta.se.tema5.beings.interfaces.IPlant;
import mta.se.tema5.factories.AbstractFactory;
import mta.se.tema5.factories.producers.AbstractFactoryProducer;
import mta.se.tema5.beings.animals.CarnivoreAnimal;

/**
 * main class of the program
 * 
 * @author petru scurtu
 * 
 */
public class Main {

	/**
	 * starting point of the program
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		AbstractFactoryProducer producer = new AbstractFactoryProducer();
		AbstractFactory humanFactory = producer.getFactory("Human");
		if(humanFactory==null)
			throw new Exception("Human factory was not succesfully created - check parameters");
		IHuman caucasian = humanFactory.makeHuman("Alex", "Caucasian",
				"romanian");
		if(caucasian==null)
			throw new Exception("Human was not succesfully created - check paramaters");
		caucasian.work();
		AbstractFactory plantFactory = producer.getFactory("Plant");
		if(plantFactory==null)
			throw new Exception("Plant factory was not succesfully created - check parameters");
		IPlant normalPlant = plantFactory.makePlant("rose", "Ordinary",
				"floare");
		if(normalPlant==null)
			throw new Exception("Plant was not succesfully created - check parameters");
		normalPlant.makePhotosynthesis();
		AbstractFactory animalFactory = producer.getFactory("Animal");
		if(animalFactory==null)
			throw new Exception("Animal factory was not succesfully created - check parameters");
		IAnimal animal = animalFactory
				.makeAnimal("lion", "Carnivore", "feline");
		if(animal==null)
			throw new Exception("Animal was not succesfully created - check parameters");
		((CarnivoreAnimal) animal).hunt();
		}
		catch(Exception ex)
		{	
			System.out.println("Error: "+ ex.getMessage());
			System.out.println("Cause: "); ex.printStackTrace();
		}
	}

}
