package factoryClasses;

import gamePieces.*;

public class LandGameConcreteFactory implements BattleGameAbstractFactory{

	public Vehicle getBattleVehicle(){
		int random = (int) ((Math.random() * 2) + 1);
		if(random == 1){
			return new Car();
		}
		else if(random == 2){
			return new Tank();
		}
		return null;
	}
	
	public DamageItem getDamageItem(){
		return new RoadBlock();
	}
}
