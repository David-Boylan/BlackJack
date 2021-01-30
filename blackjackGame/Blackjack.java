package blackjackGame;

public class Blackjack {
    public static void main(String args[]) {
        Dealer deal = new Dealer();
        Cards card = new Cards();
        String reply = "yes";
        while (reply == "yes" || reply == "Yes" || reply == "y"|| reply == "Y"){
            Dealer.shuffle();
            int i=0;
            int cardTotal = 0;
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
        }
    }
}