package edu.cnm.deepdive;

public class Card {

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

}
