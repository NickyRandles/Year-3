
public class LivingThingFactory implements EarthThingsAbstractFactory{
	String thing;

	public LivingThingFactory(){
		int random = (int) ((Math.random() * 2) + 1);
		if(random == 1){
			thing = "Bird";
		}
		else{
			thing = "Dog";
		}
	}
	
	@Override
	public Thing getThing() {
		
		if("Bird".equalsIgnoreCase(thing)){
			return new Bird();
		}
		else if("Dog".equalsIgnoreCase(thing)){
			return new Dog();
		}
		return null;
	}

}
