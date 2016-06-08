package Part2;

public class FactoryTest {

	public static void main(String [] args){
		
		String list1 = new String("1 2 3 4 5 6 7 8 9 10");
		String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1");
		String list3 = new String("A,B,C,D,E,F,G,H,I,J");
		
		NumberFactory factory = new NumberFactory();
		factory.getNumberList(list1).display();
		factory.getNumberList(list2).display();
		factory.getNumberList(list3).display();
		
		NumberList list = factory.getNumberList(list1);
		list.display();
				
	}
}
