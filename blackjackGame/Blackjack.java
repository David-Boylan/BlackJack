package blackjackGame;

import java.util.*;

public class Blackjack {
    public static void main(String args[]) {
        Scanner Gargrave = new Scanner(System.in);
        Dealer deal = new Dealer();
        Cards card = new Cards();
        String reply = "yes";
        boolean pickedACard = false;
        while (reply.equals("yes")) {
            Dealer.shuffle();
            boolean win = false;
            int i = 0;
            int c = 0;
            int playerCardTotal = 0;
            int comCardTotal = 0;
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
                    playerCardTotal = card.value(playerCard1);
                }
            }
            while (c < 1) { // get card 1
                comCard1 = deal.DealPlayer();
                if (comCard1 != "nothing") {
                    c++;
                    comCardTotal = card.value(comCard1);
                }
            }
            while (i < 2) { // get card 2
                playerCard2 = deal.DealPlayer();
                if (playerCard2 != "nothing") {
                    i++;
                    playerCardTotal += card.value(playerCard2);
                }
            }
            while (i < 2) { // get card 2
                comCard2 = deal.DealPlayer();
                if (comCard2 != "nothing") {
                    c++;
                    comCardTotal += card.value(comCard2);
                }
            }
            System.out.println("the computer has " + comCardTotal);
            while (hitStand.equals("hit") && playerCard5.equals("") && playerCardTotal < 22 && playerCard5 == "") {
                pickedACard = false;
                System.out.println("your total card total is " + playerCardTotal + " would you like to hit or stand");
                hitStand = Gargrave.next();
                if (hitStand.equals("hit") || hitStand.equals("Hit") || hitStand.equals("h") || hitStand.equals("H")) {
                    if (playerCard3 == "" && pickedACard == false) {
                        while (i < 3) {
                            playerCard3 = deal.DealPlayer();
                            if (playerCard3 != "nothing") {
                                i++;
                                playerCardTotal = playerCardTotal + card.value(playerCard3);
                                pickedACard = true;
                            }
                        }
                    }
                    if (playerCard4 == "" && pickedACard == false) {
                        while (i < 4) {
                            playerCard4 = deal.DealPlayer();
                            if (playerCard4 != "nothing") {
                                i++;
                                playerCardTotal = playerCardTotal + card.value(playerCard4);
                                pickedACard = true;
                            }
                        }
                    }
                    if (playerCard5 == "" && pickedACard == false) {
                        while (i < 5) {
                            playerCard5 = deal.DealPlayer();
                            if (playerCard5 != "nothing") {
                                i++;
                                playerCardTotal = playerCardTotal + card.value(playerCard5);
                                pickedACard = true;
                            }
                        }
                    }
                }
            }
            if (playerCardTotal > 21) {
                if (playerCard1 == "AS" || playerCard1 == "AH" || playerCard1 == "AD" || playerCard1 == "AC") {
                    playerCardTotal -= 10;
                }
            }
            if (playerCardTotal > 21) {
                if (playerCard2 == "AS" || playerCard2 == "AH" || playerCard2 == "AD" || playerCard2 == "AC") {
                    playerCardTotal -= 10;
                }
            }
            if (playerCardTotal > 21) {
                if (playerCard3 == "AS" || playerCard3 == "AH" || playerCard3 == "AD" || playerCard3 == "AC") {
                    playerCardTotal -= 10;
                }
            }
            if (playerCardTotal > 21) {
                if (playerCard4 == "AS" || playerCard4 == "AH" || playerCard4 == "AD" || playerCard4 == "AC") {
                    playerCardTotal -= 10;
                }
            }
            if (playerCardTotal > 21) {
                if (playerCard5 == "AS" || playerCard5 == "AH" || playerCard5 == "AD" || playerCard5 == "AC") {
                    playerCardTotal -= 10;
                }
            }
            if (playerCardTotal > 21) {
                System.out.println("You busted at " + playerCardTotal);
            } else {
                System.out.println("You end at " + playerCardTotal);
            }
            c = 2;
            while (comCardTotal < 16 && comCard5 == "") {
                pickedACard = false;
                if (comCard3 == "" && pickedACard == false) {
                    while (c < 3) {
                        comCard3 = deal.DealPlayer();
                        if (comCard3 != "nothing") {
                            c++;
                            comCardTotal = comCardTotal + card.value(comCard3);
                            pickedACard = true;
                        }
                    }
                }
                if (comCard4 == "" && pickedACard == false) {
                    while (c < 4) {
                        comCard4 = deal.DealPlayer();
                        if (comCard4 != "nothing") {
                            c++;
                            comCardTotal = comCardTotal + card.value(comCard4);
                            pickedACard = true;
                        }
                    }
                }
                if (comCard5 == "" && pickedACard == false) {
                    while (c < 5) {
                        comCard5 = deal.DealPlayer();
                        if (comCard5 != "nothing") {
                            c++;
                            comCardTotal = comCardTotal + card.value(comCard5);
                            pickedACard = true;
                        }
                    }
                }
            }
            if (comCardTotal > 21) {
                if (comCard1 == "AS" || comCard1 == "AH" || comCard1 == "AD" || comCard1 == "AC") {
                    comCardTotal -= 10;
                }
            }
            if (comCardTotal > 21) {
                if (comCard2 == "AS" || comCard2 == "AH" || comCard2 == "AD" || comCard2 == "AC") {
                    comCardTotal -= 10;
                }
            }
            if (comCardTotal > 21) {
                if (comCard3 == "AS" || comCard3 == "AH" || comCard3 == "AD" || comCard3 == "AC") {
                    comCardTotal -= 10;
                }
            }
            if (comCardTotal > 21) {
                if (comCard4 == "AS" || comCard4 == "AH" || comCard4 == "AD" || comCard4 == "AC") {
                    comCardTotal -= 10;
                }
            }
            if (comCardTotal > 21) {
                if (comCard5 == "AS" || comCard5 == "AH" || comCard5 == "AD" || comCard5 == "AC") {
                    comCardTotal -= 10;
                }
            }
            System.out.println("and the computer got " + comCardTotal);
            if (playerCardTotal > comCardTotal && playerCardTotal <= 21 && comCardTotal <= 22) {
                win = true;
            } else if (playerCardTotal == comCardTotal) {
                win = false;
            }
            if (win == true) {
                System.out.println("You Win :)");
            } else if (playerCardTotal == comCardTotal) {
                System.out.println("You tied with the Computer :|");
            } else {
                System.out.println("computer wins :(");
            }
            System.out.println("would you like to play again?");
            reply = Gargrave.next();
        }
    }
}