package homework_5;

import java.util.Objects;

public class Card implements Comparable<Card> {
    int theValue;
    int theSuit;

    public final static int SPADES = 0;
    public final static int HEARTS = 1;
    public final static int DIAMONDS = 2;
    public final static int CLUBS = 3;
    public final static int JOKER = 4;

    public final static int ACE = 1;
    public final static int CARD_2 = 2;
    public final static int CARD_3 = 3;
    public final static int CARD_4 = 4;
    public final static int CARD_5 = 5;
    public final static int CARD_6 = 6;
    public final static int CARD_7 = 7;
    public final static int CARD_8 = 8;
    public final static int CARD_9 = 9;
    public final static int CARD_10 = 10;
    public final static int JACK = 11;
    public final static int QUEEN = 12;
    public final static int KING = 13;

    public Card(int theSuit, int theValue) {
        this.theValue = theValue;
        this.theSuit = theSuit;
    }

    protected int getTheValue() {
        return theValue;
    }

    protected void setTheValue(int theValue) {
        this.theValue = theValue;
    }

    protected int getTheSuit() {
        return theSuit;
    }

    protected void setTheSuit(int theSuit) {
        this.theSuit = theSuit;
    }

    public String getValueTitle(){
        switch(this.theValue){
            case ACE: return "ACE";
            case CARD_2 : return "2";
            case CARD_3 : return "3";
            case CARD_4 : return "4";
            case CARD_5 : return "5";
            case CARD_6 : return "6";
            case CARD_7 : return "7";
            case CARD_8 : return "8";
            case CARD_9 : return "9";
            case CARD_10 : return "10";
            case JACK : return "11";
            case QUEEN : return "12";
            case KING : return "13";
            default: return null;
        }
    }

    public String getSuiteTitle(){
        switch(this.theSuit){
            case SPADES : return "SPADES";
            case HEARTS : return "HEARTS";
            case DIAMONDS : return "DIAMONDS";
            case CLUBS : return "CLUBS";
            default: return null;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Card card = (Card) other;
        return theValue == card.theValue && theSuit == card.theSuit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(theValue, theSuit);
    }

    @Override
    public String toString() {
        return "Card{" +
                "theValue=" + theValue +
                ", theSuit=" + theSuit +
                '}';
    }


    @Override
    public int compareTo(Card other) {
        if(this.theValue == other.theValue && this.theSuit == other.theSuit) return 0;
        else if(this.theSuit >= other.theSuit && this.theValue > other.theValue) return 1;
        else return -1;

    }
}
