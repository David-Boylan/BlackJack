package blackjackGame;

public class Cards {

    // spades
    public static int aceOfSpades = 1;
    public static int twoOfSpades = 1;
    public static int threeOfSpades = 1;
    public static int fourOfSpades = 1;
    public static int fiveOfSpades = 1;
    public static int sixOfSpades = 1;
    public static int sevenOfSpades = 1;
    public static int eightOfSpades = 1;
    public static int nineOfSpades = 1;
    public static int tenOfSpades = 1;
    public static int jackOfSpades = 1;
    public static int queenOfSpades = 1;
    public static int kingOfSpades = 1;
    // clubs
    public static int aceOfClubs = 1;
    public static int twoOfClubs = 1;
    public static int threeOfClubs = 1;
    public static int fourOfClubs = 1;
    public static int fiveOfClubs = 1;
    public static int sixOfClubs = 1;
    public static int sevenOfClubs = 1;
    public static int eightOfClubs = 1;
    public static int nineOfClubs = 1;
    public static int tenOfClubs = 1;
    public static int jackOfClubs = 1;
    public static int queenOfClubs = 1;
    public static int kingOfClubs = 1;
    // diamonds
    public static int aceOfDiamonds = 1;
    public static int twoOfDiamonds = 1;
    public static int threeOfDiamonds = 1;
    public static int fourOfDiamonds = 1;
    public static int fiveOfDiamonds = 1;
    public static int sixOfDiamonds = 1;
    public static int sevenOfDiamonds = 1;
    public static int eightOfDiamonds = 1;
    public static int nineOfDiamonds = 1;
    public static int tenOfDiamonds = 1;
    public static int jackOfDiamonds = 1;
    public static int queenOfDiamonds = 1;
    public static int kingOfDiamonds = 1;
    // hearts
    public static int aceOfHearts = 1;
    public static int twoOfHearts = 1;
    public static int threeOfHearts = 1;
    public static int fourOfHearts = 1;
    public static int fiveOfHearts = 1;
    public static int sixOfHearts = 1;
    public static int sevenOfHearts = 1;
    public static int eightOfHearts = 1;
    public static int nineOfHearts = 1;
    public static int tenOfHearts = 1;
    public static int jackOfHearts = 1;
    public static int queenOfHearts = 1;
    public static int kingOfHearts = 1;

    int junk = 0;

    public int value(String card) {
        if (card == "AS") {
            return 11;
        }
        if (card == "2S") {
            return 2;
        }
        if (card == "3S") {
            return 3;
        }
        if (card == "4S") {
            return 4;
        }
        if (card == "5S") {
            return 5;
        }
        if (card == "6S") {
            return 6;
        }
        if (card == "7S") {
            return 7;
        }
        if (card == "8S") {
            return 8;
        }
        if (card == "9S") {
            return 9;
        }
        if (card == "10S") {
            return 10;
        }
        if (card == "JS") {
            return 10;
        }
        if (card == "QS") {
            return 10;
        }
        if (card == "KS") {
            return 10;
        }
        if (card == "AC") {// clubs
            return 11;
        }
        if (card == "2C") {
            return 2;
        }
        if (card == "3C") {
            return 3;
        }
        if (card == "4C") {
            return 4;
        }
        if (card == "5C") {
            return 5;
        }
        if (card == "6C") {
            return 6;
        }
        if (card == "7C") {
            return 7;
        }
        if (card == "8C") {
            return 8;
        }
        if (card == "9C") {
            return 9;
        }
        if (card == "10C") {
            return 10;
        }
        if (card == "JC") {
            return 10;
        }
        if (card == "QC") {
            return 10;
        }
        if (card == "KC") {
            return 10;
        }
        if (card == "AD") {// diamonds
            return 11;
        }
        if (card == "2D") {
            return 2;
        }
        if (card == "3D") {
            return 3;
        }
        if (card == "4D") {
            return 4;
        }
        if (card == "5D") {
            return 5;
        }
        if (card == "6D") {
            return 6;
        }
        if (card == "7D") {
            return 7;
        }
        if (card == "8D") {
            return 8;
        }
        if (card == "9D") {
            return 9;
        }
        if (card == "10D") {
            return 10;
        }
        if (card == "JD") {
            return 10;
        }
        if (card == "QD") {
            return 10;
        }
        if (card == "KD") {
            return 10;
        }
        if (card == "AH") {// hearts
            return 11;
        }
        if (card == "2H") {
            return 2;
        }
        if (card == "3H") {
            return 3;
        }
        if (card == "4H") {
            return 4;
        }
        if (card == "5H") {
            return 5;
        }
        if (card == "6H") {
            return 6;
        }
        if (card == "7H") {
            return 7;
        }
        if (card == "8H") {
            return 8;
        }
        if (card == "9H") {
            return 9;
        }
        if (card == "10H") {
            return 10;
        }
        if (card == "JH") {
            return 10;
        }
        if (card == "QH") {
            return 10;
        }
        if (card == "KH") {
            return 10;
        }
        return junk;
    }
}