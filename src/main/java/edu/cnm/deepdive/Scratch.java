package edu.cnm.deepdive;

import edu.cnm.deepdive.model.Deck;
import edu.cnm.deepdive.service.ColorComparator;

public class Scratch {

  public static void main(String[] args) {
    Deck deck = new Deck();
    System.out.println(deck);
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    deck.sort(new ColorComparator());
    System.out.println(deck);
    /*
    while (!deck.isEmpty()) {
      Card card = deck.deal();
      System.out.printf("%s of %s%n", card.getRank(), card.getSuit());
    }*/
  }
}
