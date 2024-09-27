package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    deck.shuffle();
    System.out.println(deck);
    while (!deck.isEmpty()) {
      Card card = deck.deal();
      System.out.printf("%s of %s%n", card.getRank(), card.getSuit());
    }
  }
}
