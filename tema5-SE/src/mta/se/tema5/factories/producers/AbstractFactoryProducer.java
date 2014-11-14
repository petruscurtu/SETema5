package mta.se.tema5.factories.producers;

import mta.se.tema5.factories.AnimalFactory;
import mta.se.tema5.factories.AbstractFactory;
import mta.se.tema5.factories.HumanFactory;
import mta.se.tema5.factories.PlantFactory;

/**
 * used for getting an abstract factory object
 * 
 * @author petru scurtu
 *
 */
public class AbstractFactoryProducer {
	
	/**
	 * returns an abstract factory depending on choice
	 * 
	 * @param choice -Human , Animal , Plant
	 * @return abstract factory
	 */
	public static AbstractFactory getFactory(String choice){
		if(choice=="Human"){
			return new HumanFactory();
		}else if(choice=="Animal"){
			return new AnimalFactory();
		}else if(choice=="Plant"){
			return new PlantFactory();
		}
		return null;
		
	}

}
