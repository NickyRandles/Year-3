import java.util.Vector;


public class EarthMaker {

	public static void main(String [] args){
		Vector<EarthThingsAbstractFactory> factory = new Vector<EarthThingsAbstractFactory>();
		int random = 0;
		String [] type = {"", "living", "nonliving"};
		for(int i = 0; i < 1000000; i++){
			random = (int) ((Math.random() * 2) + 1);
			factory.add(FactoryProducer.getFactory(type[random]));
			factory.elementAt(i).getThing();
		}
		
	}
		
}
