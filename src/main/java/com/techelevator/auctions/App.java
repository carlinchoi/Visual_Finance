package com.techelevator.auctions;

import com.techelevator.auctions.model.Auction;
import com.techelevator.auctions.services.YahooAPI;
import com.techelevator.auctions.services.VisualFinMenu;

public class App {
    private final VisualFinMenu visualFinMenu = new VisualFinMenu();
    private final YahooAPI yahooAPI = new YahooAPI();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;
        while (menuSelection != 0) {
            visualFinMenu.printMainMenu();
            menuSelection = visualFinMenu.promptForMenuSelection();
            if (menuSelection == 1) {
                handleListAllAuctions();
            } else if (menuSelection == 2) {
                handleShowAuctionDetails();
            } else if (menuSelection == 3) {
                handleFindAuctionsByTitle();
            } else if (menuSelection == 4) {
                handleFindAuctionsByPrice();
            } else if (menuSelection != 0) {
                System.out.println("Invalid Selection");
            }
        }
    }

    private void handleListAllAuctions() {
        Auction[] auctions = yahooAPI.getAllAuctions();
        visualFinMenu.printAuctions(auctions);
    }

    private void handleShowAuctionDetails() {
        Auction[] auctions = yahooAPI.getAllAuctions();
        visualFinMenu.printAuctionMenu(auctions);
        int auctionId = visualFinMenu.promptForMenuSelection();
        if (auctionId > 0) {
            Auction auction = yahooAPI.getAuction(auctionId);
            visualFinMenu.printAuction(auction);
        }
    }

    private void handleFindAuctionsByTitle() {
        String title = visualFinMenu.promptForAuctionTitle();
        if (title != null) {
            Auction[] auctions = yahooAPI.getAuctionsMatchingTitle(title);
            visualFinMenu.printAuctions(auctions);
        }
    }

    private void handleFindAuctionsByPrice() {
        double price = visualFinMenu.promptForAuctionPrice();
        if (price > 0) {
            Auction[] auctions = yahooAPI.getAuctionsAtOrBelowPrice(price);
            visualFinMenu.printAuctions(auctions);
        }
    }

}
