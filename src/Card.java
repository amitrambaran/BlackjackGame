
 
public class Card implements Comparable {
    //Symbolic constants

    public static final int CLUB = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;

    /**
     * Construct a card of the given rank, suit and whether it is faceup or
     * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
     * have a rank equal to their number. Jack, Queen, King and Ace have the
     * ranks 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3
     * for Clubs, Diamonds, Hearts and Spades respectively.
     *
     * @param rank
     * @param suit
     * @param faceUp
     */
    int r;
    int s;
    boolean up;

    public Card(int rank, int suit, boolean faceUp) {

        r = rank;
        s = suit;
        up = faceUp;

    }

    /**
     * @return the faceUp
     */
    public boolean isFaceUp() {
        return up; //FIX THIS
    }

    /**
     * @param faceUp the faceUp to set
     */
    public void setFaceUp(boolean faceUp) {

      up = faceUp;

    }

    /**
     * @return the rank
     */
    public int getRank() {
        return r; //FIX THIS
    }

    /**
     * @return the suit
     */
    public int getSuit() {
        return s;//FIX THIS
    }

    @Override
    public boolean equals(Object ob) {
        if (!(ob instanceof Card)) {
            return false;
        }
        Card c = (Card) ob;
        if (c.r == r && c.s == s) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {//DO NOT MODIFY
        int hash = 7;
        hash = 31 * hash + this.getRank();
        hash = 31 * hash + this.getSuit();
        return hash;
    }

    @Override
    public int compareTo(Object obj) {//DO NOT MODIFY
        return compareTo((Card) obj);
    }

    public int compareTo(Card c) {

        if (this.r > c.r) {
            return 1;
            
        }
        if (this.r < c.r) {
            return -1;
            
        } 
        if (this.r == c.r) {
            if (this.s > c.s) {
                return 1;
            }
            if (this.s < c.s) {
                return -1;
            }
        }
        return 0;
    }

    /**
     * Return the rank as a String. For example, the 3 of Hearts produces the
     * String "3". The King of Diamonds produces the String "King".
     *
     * @return the rank String
     */
    public String getRankString() {

        if (this.r == 2) {
            return "2";
        }
        if (this.r == 3) {
            return "3";
        }
        if (this.r == 4) {
            return "4";
        }
        if (this.r == 5) {
            return "5";
        }
        if (this.r == 6) {
            return "6";
        }
        if (this.r == 7) {
            return "7";
        }
        if (this.r == 8) {
            return "8";
        }
        if (this.r == 9) {
            return "9";
        }
        if (this.r == 10) {
            return "10";
        }
        if (this.r == 11) {
            return "Jack";
        }
        if (this.r == 12) {
            return "Queen";
        }
        if (this.r == 13) {
            return "King";
        } else {
            return "Ace";
        }

    }

    /**
     * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
     *
     * @return the suit String
     */
    public String getSuitString() {
        if (s == CLUB) {
            return "Clubs";
        }

        if (s == DIAMOND) {
            return "Diamonds";
        }

        if (s == HEART) {
            return "Hearts";
        } else {
            return "Spades";
        }

    }

    /**
     * Return "?" if the card is facedown; otherwise, the rank and suit of the
     * card.
     *
     * @return the String representation
     */
    @Override
    public String toString() {

        if (!up) {
            return "?";
        } else {
            return getRankString() + " of " + getSuitString(); //FIX THIS
        }
    }

    public static void main(String[] args) {
        //Create 5 of clubs
        Card club5 = new Card(5, 0, true);
        System.out.println("club5: " + club5);
        Card spadeAce = new Card(14, SPADE, true);
        System.out.println("spadeAce: " + spadeAce);
        System.out.println("club5 compareTo spadeAce: "
                + club5.compareTo(spadeAce));
        System.out.println("club5 compareTo club5: "
                + club5.compareTo(club5));
        System.out.println("club5 equals spadeAce: "
                + club5.equals(spadeAce));
        System.out.println("club5 equals club5: "
                + club5.equals(club5));
    }
}
