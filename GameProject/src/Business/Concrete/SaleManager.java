package Business.Concrete;

import Business.Abstract.SaleService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class SaleManager implements SaleService {
	
	private double discountPercent;
	private double gamePrice;

	@Override
	public void sale(Game[] games, User user, Campaign campaign) {
		for(Game game:games) {
			discountPercent = campaign.getCampaignDiscount();
			gamePrice = game.getGamePrice();
			gamePrice = gamePrice - (gamePrice * discountPercent / 100);
			System.out.println(game.getGameName() +" oyunu " + campaign.getCampaignName() + " uygulanarak "+ user.getFirtsName() + 
					" tarafýndan " + gamePrice + "TL'ye alýnmýþtýr.");
		}
		
	}

	@Override
	public void addToList(Game[] games, User user) {
		for(Game game:games) {
			System.out.println(game.getGameName() + " oyunu sepete " + game.getGamePrice() + " fiyata eklenmiþtir.");
		}
		
	}

}
