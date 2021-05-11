package Business.Concrete;

import Business.Abstract.UserService;

public class UserManager implements UserService {

	@Override
	public void add(Entities.Concrete.User user) {
		System.out.println("Kullan�c� sisteme eklendi: " + user.getFirtsName());
		
	}

	@Override
	public void delete(Entities.Concrete.User user) {
		System.out.println("Kullan�c� sistemden silindi: " + user.getFirtsName());
		
	}

	@Override
	public void update(Entities.Concrete.User user) {
		System.out.println("Kullan�c� sistemde g�ncellendi: " + user.getFirtsName());
		
	}

	
	
}
