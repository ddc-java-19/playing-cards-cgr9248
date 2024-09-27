package edu.cnm.deepdive.model;

public class Card implements Comparable<Card> {

  private final Rank rank;
  private final Suit suit;
  private final String stringForm;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    stringForm = rank.getSymbol() + suit.getSymbol();
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return stringForm;
  }

  @Override
  public int compareTo(Card other) {
    int comparison = this.suit.compareTo(other.suit);
    if (comparison == 0) {
      comparison = this.rank.compareTo(other.rank);
    }
    return comparison;
  }
}
