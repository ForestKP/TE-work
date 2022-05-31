package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));

        List<Bid> allBidsCopy = generalAuction.getAllBids();
        allBidsCopy.remove(0);


        generalAuction.placeBid(new Bid("Rick Astley", 13));
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids

        System.out.println("The winner as of now is: " + generalAuction.getHighBid().getBidder());

        ReserveAuction myReserveAuction = new ReserveAuction("unique lobster", 2000);
        myReserveAuction.placeBid(new Bid("someone who doesn't know lobster",12));
        myReserveAuction.placeBid(new Bid("someone who wants the lobster",2000));
        myReserveAuction.placeBid(new Bid("someone who wants the lobster EVEN MORE",2500));

        BuyoutAuction fancyVestAuction = new BuyoutAuction("Fancy crochet vest", 300);
        fancyVestAuction.placeBid(new Bid("Steve", 250));
        fancyVestAuction.placeBid(new Bid("Steve's Arch Nemesis", 310));
        fancyVestAuction.placeBid(new Bid("Steve", 350));

        List<Auction> currentAuctions = new ArrayList<Auction>();
        currentAuctions.add(generalAuction);
        currentAuctions.add(myReserveAuction);
        currentAuctions.add(fancyVestAuction);

        for(Auction singleAuction : currentAuctions) {
            System.out.println(singleAuction.getItemForSale() + " " + singleAuction.getHighBid().getBidder() + " " + singleAuction.getHighBid().getBidAmount());
        }
    }
}
