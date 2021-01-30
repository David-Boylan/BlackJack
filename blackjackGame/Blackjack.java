package blackjackGame;

import java.util.*;

public class Blackjack {
    public static void main(String args[]) {
        Scanner Gargrave = new Scanner(System.in);
        Dealer deal = new Dealer();
        Cards card = new Cards();
        String reply = "yes";
        boolean pickedACard = false;
        while (reply == "yes" || reply == "Yes" || reply == "y" || reply == "Y") {
            Dealer.shuffle();
            boolean win = true;
            int i = 0;
            int cardTotal = 0;
            String hitStand = "hit";
            String playerCard1 = "";
            String playerCard2 = "";
            String playerCard3 = "";
            String playerCard4 = "";
            String playerCard5 = "";
            String comCard1 = "";
            String comCard2 = "";
            String comCard3 = "";
            String comCard4 = "";
            String comCard5 = "";
            while (i < 1) { // get card 1
                playerCard1 = deal.DealPlayer();
                if (playerCard1 != "nothing") {
                    i++;
                    cardTotal = card.value(playerCard1);
                }
            }
            while (i < 2) { // get card 2
                playerCard2 = deal.DealPlayer();
                if (playerCard2 != "nothing") {
                    i++;
                    cardTotal += card.value(playerCard2);
                }
            }
            while (hitStand.equals("hit") && playerCard5.equals("")) {
                pickedACard = false;
                System.out.println("your total card total is " + cardTotal + " would you like to hit or stand");
                hitStand = Gargrave.next();
                if (hitStand.equals("hit") || hitStand.equals("Hit") || hitStand.equals("h") || hitStand.equals("H")) {
                    if (playerCard3 == "" && pickedACard == false) {
                        while (i < 3) {
                            playerCard3 = deal.DealPlayer();
                            if (playerCard3 != "nothing" && pickedACard == false) {
                                i++;
                                cardTotal = cardTotal + card.value(playerCard3);
                                pickedACard = true;
                            }
                        }
                    }
                    if (playerCard4 == "" && pickedACard == false) {
                        while (i < 4) {
                            playerCard4 = deal.DealPlayer();
                            if (playerCard4 != "nothing") {
                                i++;
                                cardTotal = cardTotal + card.value(playerCard4);
                                pickedACard = true;
                            }
                        }
                    }
                    if (playerCard5 == "" && pickedACard == false) {
                        while (i < 5) {
                            playerCard5 = deal.DealPlayer();
                            if (playerCard5 != "nothing") {
                                i++;
                                cardTotal = cardTotal + card.value(playerCard5);
                                pickedACard = true;
                            }
                        }
                    }
                }
            }
        }
    }
}