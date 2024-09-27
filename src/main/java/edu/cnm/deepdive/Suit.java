package edu.cnm.deepdive;

public enum Suit {

  CLUBS('♣', Color.BLACK),
  DIAMONDS('♢', Color.RED),
  HEARTS('♡', Color.RED),
  SPADES('♠', Color.BLACK);

  private final char symbol;
  private final Color color;

  Suit(char symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  public char getSymbol() {
    return symbol;
  }

  public Color getColor() {
    return color;
  }

  public enum Color {
    BLACK, RED
  }

}
