
public class JuniorMathFacade {

	public int absoluteValue(int num){
		return Math.abs(num);
	}
	
	public double cubeRoot(double num){
		return Math.cbrt(num);
	}
	
	public double squareRoot(double num){
		return Math.sqrt(num);
	}
	
	public double xToThePowerOfy(double x, double y){
		return Math.pow(x, y);
	}
	
	public int roundDoubleToInterger(double num){
		return (int) Math.rint(num);
	}
}
