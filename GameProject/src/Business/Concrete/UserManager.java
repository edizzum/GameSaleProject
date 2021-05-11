package Business.Concrete;

import Business.Abstract.UserService;

public class UserManager implements UserService {

	@Override
	public void add(Entities.Concrete.User user) {
		System.out.println("Kullanýcý sisteme eklendi: " + user.getFirtsName());
		
	}

	@Override
	public void delete(Entities.Concrete.User user) {
		System.out.println("Kullanýcý sistemden silindi: " + user.getFirtsName());
		
	}

	@Override
	public void update(Entities.Concrete.User user) {
		System.out.println("Kullanýcý sistemde güncellendi: " + user.getFirtsName());
		
	}

	
	
}
