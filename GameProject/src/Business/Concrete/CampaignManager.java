package Business.Concrete;

import Business.Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya sisteme eklenmiþtir: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya sistemde güncellenmiþtir: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya sistemden silinmiþtir: " + campaign.getCampaignName());
		
	}
	
}
