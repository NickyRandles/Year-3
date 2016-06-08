
public abstract class Pet {
	
	protected String name;
	protected int age;
	protected String favFood;
	
	public Pet(){
		
	}
	
	public Pet(String n){
		this.name = n;
			
	}
	
	public Pet(String n, int a){
		this.name = n;
		this.age = a;
		
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(int a){
		this.age = a;
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void feedPet(){
		
		System.out.println("The pets favourite food is nothing");
		
	}
	
	public void setFavouriteFood(String foodName){
		this.favFood = foodName;
	}
	
	public String getFavouriteFood(){
		return this.favFood;
	}
	
	public abstract String getCommands();

}
