package mta.se.tema5.factories;

import mta.se.tema5.beings.animals.CarnivoreAnimal;
import mta.se.tema5.beings.animals.HerbivoreAnimal;
import mta.se.tema5.beings.animals.OmnivoreAnimal;
import mta.se.tema5.beings.interfaces.IAnimal;
import mta.se.tema5.beings.interfaces.IHuman;
import mta.se.tema5.beings.interfaces.IPlant;

public class AnimalFactory extends AbstractFactory {

	@Override
	public IHuman makeHuman(String name, String race, String nation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IAnimal makeAnimal(String name, String type, String species) {
		// TODO Auto-generated method stub
		if (type == "Carnivore") {
			return new CarnivoreAnimal(name, species);
		} else if (type == "Omnivore") {
			return new OmnivoreAnimal(name, species);
		} else if (type == "Herbivore") {
			return new HerbivoreAnimal(name, species);
		}
		return null;
	}

	@Override
	public IPlant makePlant(String name, String type, String species) {
		// TODO Auto-generated method stub
		return null;
	}

}
