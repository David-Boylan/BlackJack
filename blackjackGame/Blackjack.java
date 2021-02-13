package blackjackGame;

import java.util.*;

public class Blackjack {
    public static void main(String args[]) {
        Scanner Gargrave = new Scanner(System.in);
        Dealer deal = new Dealer();
        Cards card = new Cards();
        String reply = "yes";
        boolean pickedACard = false;
        int money = 100;
        boolean playerCard1AceUsed = false;
        boolean playerCard2AceUsed = false;
        boolean playerCard3AceUsed = false;
        boolean playerCard4AceUsed = false;
        boolean playerCard5AceUsed = false;
        boolean comCard1AceUsed = false;
        boolean comCard2AceUsed = false;
        boolean comCard3AceUsed = false;
        boolean comCard4AceUsed = false;
        boolean comCard5AceUsed = false;
        while (reply.equals("yes") || reply.equals("y") || reply.equals("Yes")) {
            Dealer.shuffle();
            boolean win = false;
            boolean push = false;
            int i = 0;
            int c = 0;
            int bet = 0;
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
            System.out.println("How much would you like to bet, you have $" + money);
            bet = Gargrave.nextInt();
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
            System.out.println("the computer has a " + comCard1);
            while (hitStand.equals("hit") ||hitStand.equals("h") || hitStand.equals("Hit") && playerCardTotal < 22 && playerCard5 == "") {
                pickedACard = false;
                System.out.println("you have a " + playerCard1 + " " + playerCard2 + " " + playerCard3 + " "
                        + playerCard4 + " " + playerCard5 + " ");
                System.out.println("your total card total is " + playerCardTotal + " would you like to hit or stand");
                hitStand = Gargrave.next();
                if(playerCardTotal > 21){
                    hitStand = "stand";
                }
                if (hitStand.equals("hit") || hitStand.equals("Hit") || hitStand.equals("h") || hitStand.equals("H")) {
                    if (playerCard3 == "" && pickedACard == false) {
                        while (i < 3) {
                            playerCard3 = deal.DealPlayer();
                            if (playerCard3 != "nothing") {
                                i++;
                                playerCardTotal = playerCardTotal + card.value(playerCard3);
                                pickedACard = true;
                                if (playerCardTotal > 21) {
                                    if (playerCard1 == "AS" || playerCard1 == "AH" || playerCard1 == "AD" || playerCard1 == "AC" && playerCard1AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard1AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard2 == "AS" || playerCard2 == "AH" || playerCard2 == "AD" || playerCard2 == "AC" && playerCard2AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard2AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard3 == "AS" || playerCard3 == "AH" || playerCard3 == "AD" || playerCard3 == "AC" && playerCard3AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard3AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard4 == "AS" || playerCard4 == "AH" || playerCard4 == "AD" || playerCard4 == "AC" && playerCard4AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard4AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard5 == "AS" || playerCard5 == "AH" || playerCard5 == "AD" || playerCard5 == "AC" && playerCard5AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard5AceUsed = true;
                                    }
                                }
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
                                if (playerCardTotal > 21) {
                                    if (playerCard1 == "AS" || playerCard1 == "AH" || playerCard1 == "AD" || playerCard1 == "AC" && playerCard1AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard1AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard2 == "AS" || playerCard2 == "AH" || playerCard2 == "AD" || playerCard2 == "AC" && playerCard2AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard2AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard3 == "AS" || playerCard3 == "AH" || playerCard3 == "AD" || playerCard3 == "AC" && playerCard3AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard3AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard4 == "AS" || playerCard4 == "AH" || playerCard4 == "AD" || playerCard4 == "AC" && playerCard4AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard4AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard5 == "AS" || playerCard5 == "AH" || playerCard5 == "AD" || playerCard5 == "AC" && playerCard5AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard5AceUsed = true;
                                    }
                                }
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
                                if (playerCardTotal > 21) {
                                    if (playerCard1 == "AS" || playerCard1 == "AH" || playerCard1 == "AD" || playerCard1 == "AC" && playerCard1AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard1AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard2 == "AS" || playerCard2 == "AH" || playerCard2 == "AD" || playerCard2 == "AC" && playerCard2AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard2AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard3 == "AS" || playerCard3 == "AH" || playerCard3 == "AD" || playerCard3 == "AC" && playerCard3AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard3AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard4 == "AS" || playerCard4 == "AH" || playerCard4 == "AD" || playerCard4 == "AC" && playerCard4AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard4AceUsed = true;
                                    }
                                }
                                if (playerCardTotal > 21) {
                                    if (playerCard5 == "AS" || playerCard5 == "AH" || playerCard5 == "AD" || playerCard5 == "AC" && playerCard5AceUsed == false) {
                                        playerCardTotal -= 10;
                                        playerCard5AceUsed = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (playerCardTotal > 21) {
                System.out.println("You busted at " + playerCardTotal);
            } else {
                System.out.println("You end at " + playerCardTotal);
            }
            c = 2;
            while (comCardTotal < 17 && comCard5 == "") {
                pickedACard = false;
                if (comCard3 == "" && pickedACard == false) {
                    while (c < 3) {
                        comCard3 = deal.DealPlayer();
                        if (comCard3 != "nothing") {
                            c++;
                            comCardTotal = comCardTotal + card.value(comCard3);
                            pickedACard = true;
                            if (comCardTotal > 21) {
                                if (comCard1 == "AS" || comCard1 == "AH" || comCard1 == "AD" || comCard1 == "AC" && comCard1AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard1AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard2 == "AS" || comCard2 == "AH" || comCard2 == "AD" || comCard2 == "AC" && comCard2AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard2AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard3 == "AS" || comCard3 == "AH" || comCard3 == "AD" || comCard3 == "AC" && comCard3AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard3AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard4 == "AS" || comCard4 == "AH" || comCard4 == "AD" || comCard4 == "AC" && comCard4AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard4AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard5 == "AS" || comCard5 == "AH" || comCard5 == "AD" || comCard5 == "AC" && comCard5AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard5AceUsed = true;
                                }
                            }
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
                            if (comCardTotal > 21) {
                                if (comCard1 == "AS" || comCard1 == "AH" || comCard1 == "AD" || comCard1 == "AC" && comCard1AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard1AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard2 == "AS" || comCard2 == "AH" || comCard2 == "AD" || comCard2 == "AC" && comCard2AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard2AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard3 == "AS" || comCard3 == "AH" || comCard3 == "AD" || comCard3 == "AC" && comCard3AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard3AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard4 == "AS" || comCard4 == "AH" || comCard4 == "AD" || comCard4 == "AC" && comCard4AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard4AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard5 == "AS" || comCard5 == "AH" || comCard5 == "AD" || comCard5 == "AC" && comCard5AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard5AceUsed = true;
                                }
                            }
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
                            if (comCardTotal > 21) {
                                if (comCard1 == "AS" || comCard1 == "AH" || comCard1 == "AD" || comCard1 == "AC" && comCard1AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard1AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard2 == "AS" || comCard2 == "AH" || comCard2 == "AD" || comCard2 == "AC" && comCard2AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard2AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard3 == "AS" || comCard3 == "AH" || comCard3 == "AD" || comCard3 == "AC" && comCard3AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard3AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard4 == "AS" || comCard4 == "AH" || comCard4 == "AD" || comCard4 == "AC" && comCard4AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard4AceUsed = true;
                                }
                            }
                            if (comCardTotal > 21) {
                                if (comCard5 == "AS" || comCard5 == "AH" || comCard5 == "AD" || comCard5 == "AC" && comCard5AceUsed == false) {
                                    comCardTotal -= 10;
                                    comCard5AceUsed = true;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("and the computer got " + comCardTotal);
            if (playerCardTotal > 21) {
                playerCardTotal = 0;
            }
            if (comCardTotal > 21) {
                comCardTotal = 0;
            }
            if (playerCardTotal > comCardTotal) {
                win = true;
            }
            if (playerCardTotal > 21) {
                win = false;
            }
            if (comCardTotal == playerCardTotal) {
                push = true;
            }
            if (win == true) {
                System.out.println("You Win :)");
                int moneyEarned = bet * 2;
                money = money + moneyEarned;
            } else if (push == true) {
                System.out.println("You tied with the Computer :|");
            } else {
                System.out.println("computer wins :(");
                money = money - bet;
            }
            System.out.println("You have $" + money);
            if (money > 0) {
                System.out.println("would you like to play again?");
                reply = Gargrave.next();
            } else {
                reply = "heck you you loser";
            }
        }
        System.out.println("thanks for playing");
    }
}