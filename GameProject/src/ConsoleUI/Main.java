package ConsoleUI;

import Business.Concrete.CampaignManager;
import Business.Concrete.GameManager;
import Business.Concrete.SaleManager;
import Business.Concrete.UserManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		User Ediz = new User(1, "Ediz", "Züm", "12345678910", 2001);
		User Selman = new User(2, "Selman", "Yazar", "12345678911", 2002);
		User Can = new User(3, "Can", "Kazýmoðlu", "12345678912", 2003);
		
		userManager.add(Ediz);
		userManager.delete(Selman);
		userManager.update(Can);
		
		System.out.println("-------------------------");
		
		GameManager gameManager = new GameManager();
		Game CS = new Game(1, "CS:GO", 24);
		Game Valorant = new Game(2, "Valorant", 19.90);
		Game[] games = {Valorant, CS};
		
		gameManager.add(Valorant);
		gameManager.delete(CS);
		gameManager.update(Valorant);
		gameManager.addMultiple(games);
		
		System.out.println("-------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign NewYearCampaign = new Campaign("Yeni Yýl Ýndirimi", 30);
		Campaign BlackFridayCampaign = new Campaign("Kara Cuma Ýndirimi", 60);
		
		campaignManager.add(BlackFridayCampaign);
		campaignManager.delete(NewYearCampaign);
		campaignManager.update(BlackFridayCampaign);
		
		System.out.println("-------------------------");
		
		SaleManager saleManager = new SaleManager();
		saleManager.addToList(games, Ediz);
		saleManager.sale(games, Ediz, BlackFridayCampaign);
		
		System.out.println("-------------------------");
		
		saleManager.addToList(games, Selman);
		saleManager.sale(games, Selman, NewYearCampaign);
		
		System.out.println("-------------------------");
		
		saleManager.addToList(games, Can);
		saleManager.sale(games, Can, BlackFridayCampaign);
	}
}
