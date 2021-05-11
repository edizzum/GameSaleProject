package Business.Concrete;

import Business.Abstract.GameService;
import Entities.Concrete.Game;

public class GameManager implements  GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun sisteme eklenmiþtir: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun sisteme eklenmiþtir: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun sisteme eklenmiþtir: " + game.getGameName());
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for(Game game:games) {
			System.out.println(game.getGameName() + ": Oyunu markete eklenmiþtir");
		}
		
	}
	
}
