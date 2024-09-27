package edu.cnm.deepdive.service;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Suit;
import java.util.Comparator;

public class ColorComparator implements Comparator<Card> {

  @Override
  public int compare(Card card1, Card card2) {
    Suit suit1 = card1.getSuit();
    Suit suit2 = card2.getSuit();
    int comparison = suit1.getColor().compareTo(suit2.getColor());
    if (comparison == 0) {
      comparison = suit1.compareTo(suit2);
    if (comparison == 0) {
      comparison = card1.getRank().compareTo(card2.getRank());
      }
    }
    return comparison;
  }
}
