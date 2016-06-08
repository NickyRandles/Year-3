
public class InternationalOilMarket {

	OilPriceIndicator internationalOilPrice = new OilPriceIndicator();
	BritishOilPrice britishOilPrice = new BritishOilPrice();
	JapanOilPrice japanOilPrice = new JapanOilPrice();
	
	public InternationalOilMarket(){
		internationalOilPrice.registerInterest(japanOilPrice);
		internationalOilPrice.registerInterest(britishOilPrice);
		
		japanOilPrice.setLocation(250, 0);
		britishOilPrice.setLocation(500, 0);
				
		new Thread(japanOilPrice).start();
		new Thread(britishOilPrice).start();
		new Thread(internationalOilPrice).start();
	}
	
	public static void main(String [] args){
		new InternationalOilMarket();
	}
}
