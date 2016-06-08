package factoryClasses;

import gamePieces.*;

public interface BattleGameAbstractFactory{

	public Vehicle getBattleVehicle();
	public DamageItem getDamageItem();
	
}
