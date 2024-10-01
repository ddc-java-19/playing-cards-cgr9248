package edu.cnm.deepdive.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.random.RandomGenerator;

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
    RandomGenerator rng = RandomGenerator.of ("Xoshiro256PlusPlus");
    for(int dest = cards.size () - 1; dest > 0; dest--) {
      int source = rng.nextInt(dest + 1);
      Card temp = cards.get(source);
      cards.set(source, cards.get(dest));
      cards.set(dest, temp);
    }
    Collections.shuffle(cards);
    iterator = cards.iterator();
  }

  public void sort() {
    Collections.sort(cards);
    iterator = cards.iterator();
  }

  public void sort(Comparator<Card> comparator) {
    cards.sort(comparator);
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
