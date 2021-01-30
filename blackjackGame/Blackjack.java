package blackjackGame;
import java.util.*;

public class Blackjack {
    public static void main(String args[]) {
        Scanner Gargrave = new Scanner(System.in);
        Dealer deal = new Dealer();
        Cards card = new Cards();
        String reply = "yes";
        while (reply == "yes" || reply == "Yes" || reply == "y"|| reply == "Y"){
            Dealer.shuffle();
            boolean win = true;
            int i=0;
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
            while (i<1){ //get card 1
                playerCard1 = deal.DealPlayer();
                if (playerCard1 != "nothing"){
                    i++;
                }
            }
            while (i<2){ //get card 2
                playerCard2 = deal.DealPlayer();
                if (playerCard2 != "nothing"){
                    i++;
                }
            }
            cardTotal = card.value(playerCard1) +card.value(playerCard2); //card total
            while (hitStand == "hit" && playerCard5 != "" && win != false){
                System.out.println("your total card total is " + cardTotal + " would you like to hit or stand");
                hitStand = Gargrave.nextLine();
                if (hitStand == "hit" || hitStand == "Hit" || hitStand == "h" || hitStand == "H"){
                    if (playerCard3 == ""){
                        while(i<3){
                            playerCard3 = deal.DealPlayer();
                            if(playerCard3 != "nothing"){
                                i++;
                                cardTotal = cardTotal + card.value(playerCard3);
                            }
                        }
                    }
                }
                if (playerCard4 == ""){
                    while(i<4){
                        playerCard4 = deal.DealPlayer();
                        if(playerCard4 != "nothing"){
                            i++;
                            cardTotal = cardTotal + card.value(playerCard4);
                        }
                    }
                }
                if (playerCard5 == ""){
                    while(i<5){
                        playerCard5 = deal.DealPlayer();
                        if(playerCard5 != "nothing"){
                            i++;
                            cardTotal = cardTotal + card.value(playerCard5);
                        }
                    }
                }
            }
            hitStand = "hit";
        }
    }
}