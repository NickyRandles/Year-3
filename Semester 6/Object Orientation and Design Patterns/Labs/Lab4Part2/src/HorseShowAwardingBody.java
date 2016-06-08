
public class HorseShowAwardingBody extends AwardingBody{

	@Override
	public Prize getPrize(int prize) {
		if(prize == 1){
			new BlueRibbon();
		}
		else if(prize == 2){
			new RedRibbon();
		}
		else{
			new YellowRibbon();
		}
		return null;
	}

	
}
