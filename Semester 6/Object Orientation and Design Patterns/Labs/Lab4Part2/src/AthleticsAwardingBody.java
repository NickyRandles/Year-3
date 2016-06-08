
public class AthleticsAwardingBody extends AwardingBody{
	
	@Override
	public Prize getPrize(int prize) {
		if(prize == 1){
			new GoldMedal();
		}
		else if(prize == 2){
			new SilverMedal();
		}
		else{
			new BronzeMedal();
		}
		return null;
	}

}
