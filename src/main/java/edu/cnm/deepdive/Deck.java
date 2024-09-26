package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

  private final List<Card> cards = new ArrayList<Card>();

  public Deck() {
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(r, s);
        cards.add(c);
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  @Override
  public String toString() {
    return cards.toString();
  }
}
