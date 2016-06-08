
public class President {

	private static President president = null;
	private String name;
	private int age;
	
	private President(String n, int a){
		name = n;
		age = a;
	}
	
	public static President createPresident(String n, int a){
		if(president == null && a >= 35){
			president = new President(n, a);
		}		
		return president;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
}
