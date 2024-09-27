package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck {

  private final List<Card> cards = new ArrayList<Card>();

  private Iterator<Card> iterator;

  public Deck() {
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(r, s);
        cards.add(c);
      }
    }
    iterator = cards.iterator();
  }

  public void shuffle() {
    Collections.shuffle(cards);
    iterator = cards.iterator();
  }

  public Card deal() {
    if (!iterator.hasNext()) {
      shuffle();
    }
    return iterator.next();
  }

  public boolean isEmpty() {
    return !iterator.hasNext();
  }

  @Override
  public String toString() {
    return cards.toString();
  }
}
