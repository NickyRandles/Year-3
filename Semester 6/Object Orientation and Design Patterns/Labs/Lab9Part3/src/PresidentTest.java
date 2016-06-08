
public class PresidentTest {

	public static void main(String [] args){
		//creating first president object
		President president = President.createPresident("John", 45);
		//printing first president object
		System.out.println("President's name: " + president.getName() + " President's age: " + president.getAge());
		
		//trying to create second president object
		President president2 = President.createPresident("Ronald", 71);
		//trying to print president object
		System.out.println("President's name: " + president2.getName() + " President's age: " + president2.getAge());
		
		//Result - Unable to create president2 because president object has already be initialized.
	}
}
