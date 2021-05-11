package Business.Abstract;

import Entities.Concrete.Campaign;
import Entities.Concrete.Game;
import Entities.Concrete.User;

public interface SaleService {
	void sale(Game[] games, User user, Campaign campaign);
	void addToList(Game[] games, User user);
}
