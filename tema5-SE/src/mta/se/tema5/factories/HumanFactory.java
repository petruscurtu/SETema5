package mta.se.tema5.factories;

import mta.se.tema5.beings.humans.Caucasian;
import mta.se.tema5.beings.humans.Mongoloid;
import mta.se.tema5.beings.humans.Negroid;
import mta.se.tema5.beings.interfaces.IAnimal;
import mta.se.tema5.beings.interfaces.IHuman;
import mta.se.tema5.beings.interfaces.IPlant;

public class HumanFactory extends AbstractFactory{

	@Override
	public IHuman makeHuman(String name, String race, String nation) {
		// TODO Auto-generated method stub
		if(race=="Caucasian"){
			return new Caucasian(name, nation);
		}else if(race=="Mongoloid"){
			return new Mongoloid(name, nation);
		}else if(race=="Negroid"){
			return new Negroid(name, nation);
		}
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
		return null;
	}

}
