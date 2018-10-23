package com.store;

public class Main {

    public static void main(String[] args) {
        Card bronzeCard = new BronzeCard("John Do",0);
        Card silverCard = new SilverCard("John Do",600);
        Card goldCard = new GoldCard("John Do",1500);

        System.out.println("\tBRONZE");
        PayDesk.printPurchaseInfo(bronzeCard,150);
        System.out.println("\tSILVER");
        PayDesk.printPurchaseInfo(silverCard, 850);
        System.out.println("\tGOLD");
        PayDesk.printPurchaseInfo(goldCard,1300);
    }
}