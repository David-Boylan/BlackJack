package blackjackGame;
import java.util.*;

public class Dealer {
    public String DealPlayer() {
        String aceOfSpades = "AS";
        String twoOfSpades = "2S";
        String threeOfSpades = "3S";
        String fourOfSpades = "4S";
        String fiveOfSpades = "5S";
        String sixOfSpades = "6S";
        String sevenOfSpades = "7S";
        String eightOfSpades = "8S";
        String nineOfSpades = "9S";
        String tenOfSpades = "10S";
        String jackOfSpades = "JS";
        String queenOfSpades = "QS";
        String kingOfSpades = "KS";
        // clubs
        String aceOfClubs = "AC";
        String twoOfClubs = "2C";
        String threeOfClubs = "3C";
        String fourOfClubs = "4C";
        String fiveOfClubs = "5C";
        String sixOfClubs = "6C";
        String sevenOfClubs = "7C";
        String eightOfClubs = "8C";
        String nineOfClubs = "9C";
        String tenOfClubs = "10C";
        String jackOfClubs = "JC";
        String queenOfClubs = "QC";
        String kingOfClubs = "KC";
        // diamonds
        String aceOfDiamonds = "AD";
        String twoOfDiamonds = "2D";
        String threeOfDiamonds = "3D";
        String fourOfDiamonds = "4D";
        String fiveOfDiamonds = "5D";
        String sixOfDiamonds = "6D";
        String sevenOfDiamonds = "7D";
        String eightOfDiamonds = "8D";
        String nineOfDiamonds = "9D";
        String tenOfDiamonds = "10D";
        String jackOfDiamonds = "JD";
        String queenOfDiamonds = "QD";
        String kingOfDiamonds = "KD";
        // hearts
        String aceOfHearts = "AH";
        String twoOfHearts = "2H";
        String threeOfHearts = "3H";
        String fourOfHearts = "4H";
        String fiveOfHearts = "5H";
        String sixOfHearts = "6H";
        String sevenOfHearts = "7H";
        String eightOfHearts = "8H";
        String nineOfHearts = "9H";
        String tenOfHearts = "10H";
        String jackOfHearts = "JH";
        String queenOfHearts = "QH";
        String kingOfHearts = "KH";
        String junk = "nothing";
        Random rand = new Random();
        int i = 0;
        while (i < 1) {
            int cardId = rand.nextInt(52) + 1;
            if (cardId == 1 && Cards.aceOfSpades == 1) {
                i++;
                Cards.aceOfSpades -= 1;
                return aceOfSpades;
            } else if (cardId == 2 && Cards.twoOfSpades == 1) {
                i++;
                Cards.twoOfSpades -= 1;
                return twoOfSpades;
            } else if (cardId == 3 && Cards.threeOfSpades == 1) {
                i++;
                Cards.threeOfSpades -= 1;
                return threeOfSpades;
            } else if (cardId == 4 && Cards.fourOfSpades == 1) {
                i++;
                Cards.fourOfSpades -= 1;
                return fourOfSpades;
            } else if (cardId == 5 && Cards.fiveOfSpades == 1) {
                i++;
                Cards.fiveOfSpades -= 1;
                return fiveOfSpades;
            } else if (cardId == 6 && Cards.sixOfSpades == 1) {
                i++;
                Cards.sixOfSpades -= 1;
                return sixOfSpades;
            } else if (cardId == 7 && Cards.sevenOfSpades == 1) {
                i++;
                Cards.sevenOfSpades -= 1;
                return sevenOfSpades;
            } else if (cardId == 8 && Cards.eightOfSpades == 1) {
                i++;
                Cards.eightOfSpades -= 1;
                return eightOfSpades;
            } else if (cardId == 9 && Cards.nineOfSpades == 1) {
                i++;
                Cards.nineOfSpades -= 1;
                return nineOfSpades;
            } else if (cardId == 10 && Cards.tenOfSpades == 1) {
                i++;
                Cards.tenOfSpades -= 1;
                return tenOfSpades;
            } else if (cardId == 11 && Cards.jackOfSpades == 1) {
                i++;
                Cards.jackOfSpades -= 1;
                return jackOfSpades;
            } else if (cardId == 12 && Cards.queenOfSpades == 1) {
                i++;
                Cards.queenOfSpades -= 1;
                return queenOfSpades;
            } else if (cardId == 13 && Cards.kingOfSpades == 1) {
                i++;
                Cards.kingOfSpades -= 1;
                return kingOfSpades;
            } else if (cardId == 14 && Cards.aceOfClubs == 1) {
                i++;
                Cards.aceOfClubs -= 1;
                return aceOfClubs;
            } else if (cardId == 15 && Cards.twoOfClubs == 1) {
                i++;
                Cards.twoOfClubs -= 1;
                return twoOfClubs;
            } else if (cardId == 16 && Cards.fourOfClubs == 1) {
                i++;
                Cards.fourOfClubs -= 1;
                return fourOfClubs;
            } else if (cardId == 17 && Cards.fiveOfClubs == 1) {
                i++;
                Cards.fiveOfClubs -= 1;
                return fiveOfClubs;
            } else if (cardId == 18 && Cards.sixOfClubs == 1) {
                i++;
                Cards.sixOfClubs -= 1;
                return sixOfClubs;
            } else if (cardId == 19 && Cards.sevenOfClubs == 1) {
                i++;
                Cards.sevenOfClubs -= 1;
                return sevenOfClubs;
            } else if (cardId == 20 && Cards.eightOfClubs == 1) {
                i++;
                Cards.eightOfClubs -= 1;
                return eightOfClubs;
            } else if (cardId == 21 && Cards.nineOfClubs == 1) {
                i++;
                Cards.nineOfClubs -= 1;
                return nineOfClubs;
            } else if (cardId == 22 && Cards.tenOfClubs == 1) {
                i++;
                Cards.tenOfClubs -= 1;
                return tenOfClubs;
            } else if (cardId == 23 && Cards.jackOfClubs == 1) {
                i++;
                Cards.jackOfClubs -= 1;
                return jackOfClubs;
            } else if (cardId == 24 && Cards.queenOfClubs == 1) {
                i++;
                Cards.queenOfClubs -= 1;
                return queenOfClubs;
            } else if (cardId == 25 && Cards.kingOfClubs == 1) {
                i++;
                Cards.kingOfClubs -= 1;
                return kingOfClubs;
            } else if (cardId == 26 && Cards.aceOfDiamonds == 1) {
                i++;
                Cards.aceOfDiamonds -= 1;
                return aceOfDiamonds;
            } else if (cardId == 27 && Cards.twoOfDiamonds == 1) {
                i++;
                Cards.twoOfDiamonds -= 1;
                return twoOfDiamonds;
            } else if (cardId == 28 && Cards.threeOfDiamonds == 1) {
                i++;
                Cards.threeOfDiamonds -= 1;
                return threeOfDiamonds;
            } else if (cardId == 29 && Cards.fourOfDiamonds == 1) {
                i++;
                Cards.fourOfDiamonds -= 1;
                return fourOfDiamonds;
            } else if (cardId == 30 && Cards.fiveOfDiamonds == 1) {
                i++;
                Cards.fiveOfDiamonds -= 1;
                return fiveOfDiamonds;
            } else if (cardId == 31 && Cards.sixOfDiamonds == 1) {
                i++;
                Cards.sixOfDiamonds -= 1;
                return sixOfDiamonds;
            } else if (cardId == 32 && Cards.sevenOfDiamonds == 1) {
                i++;
                Cards.sevenOfDiamonds -= 1;
                return sevenOfDiamonds;
            } else if (cardId == 33 && Cards.eightOfDiamonds == 1) {
                i++;
                Cards.eightOfDiamonds -= 1;
                return eightOfDiamonds;
            } else if (cardId == 34 && Cards.nineOfDiamonds == 1) {
                i++;
                Cards.nineOfDiamonds -= 1;
                return nineOfDiamonds;
            } else if (cardId == 35 && Cards.tenOfDiamonds == 1) {
                i++;
                Cards.tenOfDiamonds -= 1;
                return tenOfDiamonds;
            } else if (cardId == 36 && Cards.jackOfDiamonds == 1) {
                i++;
                Cards.jackOfDiamonds -= 1;
                return jackOfDiamonds;
            } else if (cardId == 37 && Cards.queenOfDiamonds == 1) {
                i++;
                Cards.queenOfDiamonds -= 1;
                return queenOfDiamonds;
            } else if (cardId == 38 && Cards.kingOfDiamonds == 1) {
                i++;
                Cards.kingOfDiamonds -= 1;
                return kingOfDiamonds;
            } else if (cardId == 39 && Cards.aceOfHearts == 1) {
                i++;
                Cards.aceOfHearts -= 1;
                return aceOfHearts;
            } else if (cardId == 40 && Cards.twoOfHearts == 1) {
                i++;
                Cards.twoOfHearts -= 1;
                return twoOfHearts;
            } else if (cardId == 41 && Cards.threeOfHearts == 1) {
                i++;
                Cards.threeOfHearts -= 1;
                return threeOfHearts;
            } else if (cardId == 42 && Cards.fourOfHearts == 1) {
                i++;
                Cards.fourOfHearts -= 1;
                return fourOfHearts;
            } else if (cardId == 43 && Cards.fiveOfHearts == 1) {
                i++;
                Cards.fiveOfHearts -= 1;
                return fiveOfHearts;
            } else if (cardId == 44 && Cards.sixOfHearts == 1) {
                i++;
                Cards.sixOfHearts -= 1;
                return sixOfHearts;
            } else if (cardId == 45 && Cards.sevenOfHearts == 1) {
                i++;
                Cards.sevenOfHearts -= 1;
                return sevenOfHearts;
            } else if (cardId == 46 && Cards.eightOfHearts == 1) {
                i++;
                Cards.eightOfHearts -= 1;
                return eightOfHearts;
            } else if (cardId == 47 && Cards.nineOfHearts == 1) {
                i++;
                Cards.nineOfHearts -= 1;
                return nineOfHearts;
            } else if (cardId == 48 && Cards.tenOfHearts == 1) {
                i++;
                Cards.tenOfHearts -= 1;
                return tenOfHearts;
            } else if (cardId == 49 && Cards.jackOfHearts == 1) {
                i++;
                Cards.jackOfHearts -= 1;
                return jackOfHearts;
            } else if (cardId == 50 && Cards.queenOfHearts == 1) {
                i++;
                Cards.queenOfHearts -= 1;
                return queenOfHearts;
            } else if (cardId == 51 && Cards.kingOfHearts == 1) {
                i++;
                Cards.kingOfHearts -= 1;
                return kingOfHearts;
            } else if (cardId == 52 && Cards.threeOfClubs == 1) {
                i++;
                Cards.threeOfClubs -= 1;
                return threeOfClubs;
            }
        }
        return junk;
    }

    static void shuffle() {
        // spades
        Cards.aceOfSpades = 1;
        Cards.twoOfSpades = 1;
        Cards.threeOfSpades = 1;
        Cards.fourOfSpades = 1;
        Cards.fiveOfSpades = 1;
        Cards.sixOfSpades = 1;
        Cards.sevenOfSpades = 1;
        Cards.eightOfSpades = 1;
        Cards.nineOfSpades = 1;
        Cards.tenOfSpades = 1;
        Cards.jackOfSpades = 1;
        Cards.queenOfSpades = 1;
        Cards.kingOfSpades = 1;
        // clubs
        Cards.aceOfClubs = 1;
        Cards.twoOfClubs = 1;
        Cards.threeOfClubs = 1;
        Cards.fourOfClubs = 1;
        Cards.fiveOfClubs = 1;
        Cards.sixOfClubs = 1;
        Cards.sevenOfClubs = 1;
        Cards.eightOfClubs = 1;
        Cards.nineOfClubs = 1;
        Cards.tenOfClubs = 1;
        Cards.jackOfClubs = 1;
        Cards.queenOfClubs = 1;
        Cards.kingOfClubs = 1;
        // diamonds
        Cards.aceOfDiamonds = 1;
        Cards.twoOfDiamonds = 1;
        Cards.threeOfDiamonds = 1;
        Cards.fourOfDiamonds = 1;
        Cards.fiveOfDiamonds = 1;
        Cards.sixOfDiamonds = 1;
        Cards.sevenOfDiamonds = 1;
        Cards.eightOfDiamonds = 1;
        Cards.nineOfDiamonds = 1;
        Cards.tenOfDiamonds = 1;
        Cards.jackOfDiamonds = 1;
        Cards.queenOfDiamonds = 1;
        Cards.kingOfDiamonds = 1;
        // hearts
        Cards.aceOfHearts = 1;
        Cards.twoOfHearts = 1;
        Cards.threeOfHearts = 1;
        Cards.fourOfHearts = 1;
        Cards.fiveOfHearts = 1;
        Cards.sixOfHearts = 1;
        Cards.sevenOfHearts = 1;
        Cards.eightOfHearts = 1;
        Cards.nineOfHearts = 1;
        Cards.tenOfHearts = 1;
        Cards.jackOfHearts = 1;
        Cards.queenOfHearts = 1;
        Cards.kingOfHearts = 1;

    }
}