package edu.cnm.deepdive;

public class Suit {

  public static final Suit CLUBS = new Suit('♣', "CLUBS");
  public static final Suit DIAMONDS = new Suit('♢', "DIAMONDS");
  public static final Suit HEARTS = new Suit('♡', "HEARTS");
  public static final Suit SPADES = new Suit('♠', "SPADES");

  private static final Suit [] values = {CLUBS, DIAMONDS, HEARTS, SPADES};

  private final char symbol;
  private final String name;

  private Suit(char symbol, String name) {
    this.symbol = symbol;
    this.name = name;
  }

  public char getSymbol() {
    return symbol;
  }

  public String getName() {
    return name;
  }

  public static Suit[] getValues() {
      return values.clone();
  }

  public int ordinal() {
    int position = -1;
    for (int i = 0; i < values.length; i++) {
      if (values[i] == this) {
        position = i;
        break;
      }
    }
    return position;
  }

  public static Suit valueOf(String name) {
    for (Suit suit : values) {
      if (suit.name.equals(name)) {
        return suit;
      }
    }
    throw new IllegalArgumentException();
  }

  @Override
  public String toString() {
    return name;
  }

}
