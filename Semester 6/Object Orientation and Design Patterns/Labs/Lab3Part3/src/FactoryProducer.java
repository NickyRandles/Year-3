
public class FactoryProducer {
	
	public static EarthThingsAbstractFactory getFactory(String factoryType){
		
		if("living".equalsIgnoreCase(factoryType)){
			return new LivingThingFactory();
		}
		else if("nonliving".equalsIgnoreCase(factoryType)){
			return new NonLivingThingFactory();
		}
		return null;
		
	}

}
