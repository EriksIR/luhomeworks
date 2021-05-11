package homework_5.cardapp;

import homework_5.Card;

import static homework_5.Card.*;

public class CardApp {
    public static void main(String[] args) {
        Card card1 = new Card(DIAMONDS,CARD_2);
        Card card2 = new Card(DIAMONDS,CARD_2);
        System.out.println(" cards are equal ? "+card1.equals(card2));

        Card card3 = new Card(DIAMONDS,CARD_2);
        Card card4 = new Card(DIAMONDS,CARD_5);
        System.out.println(" which cards is greater ? "+(card3.compareTo(card4)));

        Card card5 = new Card(DIAMONDS,CARD_2);
        Card card6 = new Card(DIAMONDS,QUEEN);
        System.out.println(" card 1 = "+card5.getValueTitle()+" "+card5.getSuiteTitle());
        System.out.println(" card 1 = "+card5+"card 2 = "+card6);
    }
}
