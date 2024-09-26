package edu.cnm.deepdive;

public enum Suit {

  CLUBS('♣'),
  DIAMONDS('♢'),
  HEARTS('♡'),
  SPADES('♠');

  private final char symbol;

  Suit(char symbol) {
    this.symbol = symbol;
  }

  public char getSymbol() {
    return symbol;
  }

}
