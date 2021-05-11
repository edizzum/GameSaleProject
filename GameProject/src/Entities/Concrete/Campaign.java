package Entities.Concrete;

import Entities.Abstract.Entity;

public class Campaign implements Entity {

	private String campaignName;
	private double campaignDiscount;
	
	public Campaign() {
		
	}
	
	public Campaign(String campaignName, double campaignDiscount) {
		super();
		this.campaignName = campaignName;
		this.campaignDiscount = campaignDiscount;
	}
	

	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public double getCampaignDiscount() {
		return campaignDiscount;
	}
	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
}
