package com.techelevator;

public class Bid {

	private String bidder;
	private int bidAmount;

	//constructor
	public Bid(String bidder, int bidAmount) {
		this.bidder = bidder;
		this.bidAmount = bidAmount;
	}

	//getters and setters
	//they are 100% methods
	public String getBidder() {
		return bidder;
	}

	public int getBidAmount() {
		return bidAmount;
	}


}
