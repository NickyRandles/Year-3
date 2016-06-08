import java.util.Iterator;
import java.util.Vector;


public class TestJavaIterator {

	public static void main(String [] args){
		Vector<Animal> animals = new Vector<Animal>();
		
		animals.add(new Pig());
		animals.add(new Sheep());
		animals.add(new Cow());
		animals.add(new Pig());
		animals.add(new Sheep());
		animals.add(new Cow());
		animals.add(new Pig());
		animals.add(new Sheep());
		animals.add(new Cow());
		animals.add(new Pig());
		
		Iterator<Animal> iterator = animals.iterator();
		while(iterator.hasNext()){
			Animal animal = iterator.next();
			animal.display();
		}
	}
}
