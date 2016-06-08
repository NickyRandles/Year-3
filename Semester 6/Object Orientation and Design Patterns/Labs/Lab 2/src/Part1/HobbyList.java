package Part1;

public class HobbyList {
	
	private String [] hobby = new String[10];
	private int size = 0;
	
	public void addHobby(String hobby){
		if(size < this.hobby.length){
			this.hobby[size] = hobby;
			size++;
		}
		else{
			System.out.println("The hobbies list is full");
		}
	}
	
	public String [] getHobby(){
			return hobby;
	}
	
	public int getSize(){
		return size;
	}

}
