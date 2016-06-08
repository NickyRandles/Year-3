
public class Test {

	public static void main(String[] args) {
		
		Pet [] pet = new Pet[5];
		
		pet[0] = new Dog("Scamp", 1, "run");
		pet[1] = new Dog("Molly", 2, "fetch");
		pet[2] = new Dog("Rover", 3, "dig");
		pet[3] = new Cat("Casper", 4, "climb");
		pet[4] = new Cat("Ginger", 5, "jump");
		
		pet[0].setFavouriteFood("ham");
		pet[1].setFavouriteFood("Pedegree Chum");
		pet[2].setFavouriteFood("bacon");
		pet[3].setFavouriteFood("whiskers");
		pet[4].setFavouriteFood("chicken");
		
		
		for(int i = 0; i < pet.length; i++){				
			System.out.println("Name: " + pet[i].getName() + "\nAge: " + pet[i].getAge() + "\nCommands: " + pet[i].getCommands());
			System.out.println();
		}
		
		for(int i = 0; i < pet.length; i++){
			pet[i].feedPet();	
		}
		
		

	}
	
}


