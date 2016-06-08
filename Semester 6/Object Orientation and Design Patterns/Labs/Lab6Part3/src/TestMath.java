
public class TestMath {

	public static void main(String [] args){
		JuniorMathFacade facade = new JuniorMathFacade();
		int num = 10;
		double num1 = 10.6, num2 = 5;
		
		System.out.println("The absolute value of " + num + " is " + facade.absoluteValue(num));
		System.out.println("The cube root of " + num1 + " is " + facade.cubeRoot(num1));
		System.out.println("The square root of " + num1 + " is " + facade.squareRoot(num1));
		System.out.println(num1 + " to the power of " + num2 + " equals " + facade.xToThePowerOfy(num1, num2));
		System.out.println(num1 + " round to an integer is " + facade.roundDoubleToInterger(num1));
	}

}
