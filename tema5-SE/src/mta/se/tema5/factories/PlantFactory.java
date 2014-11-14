package mta.se.tema5.factories;

import mta.se.tema5.beings.interfaces.IAnimal;
import mta.se.tema5.beings.interfaces.IHuman;
import mta.se.tema5.beings.interfaces.IPlant;
import mta.se.tema5.beings.plants.CarnivorePlant;
import mta.se.tema5.beings.plants.OrdinaryPlant;

/**
 * abstract class used for creating plant objects
 * 
 * @author petru scurtu
 * 
 */
public class PlantFactory extends AbstractFactory {
	
	@Override
	public IHuman makeHuman(String name, String race, String nation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAnimal makeAnimal(String name, String type, String species) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IPlant makePlant(String name, String type, String species) {
		// TODO Auto-generated method stub
		if (type == "Carnivore") {
			return new CarnivorePlant(name, species);
		} else if (type == "Ordinary") {
			return new OrdinaryPlant(name, species);
		}
		return null;
	}

}
