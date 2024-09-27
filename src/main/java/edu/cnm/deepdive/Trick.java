package edu.cnm.deepdive;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Deck;
import edu.cnm.deepdive.model.Suit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trick {

  public static void main(String[] args) {
    List<Card> blackPile = new ArrayList<>();
    List<Card> redPile = new ArrayList<>();
    distributeCards(createDeck(), blackPile, redPile);
    int NumCardsToSwap = new Random().nextInt( 1 + Math.min(blackPile.size(), redPile.size()));
    swapCards(blackPile, redPile, NumCardsToSwap);
    int blackCount = countCardsForColor(blackPile, Suit.Color.BLACK);
    int redCount = countCardsForColor(redPile, Suit.Color.RED);

    // TODO Display the contents of each pile in color order followed by the corresponding count.
  }

  private static Deck createDeck() {
    Deck deck = new Deck();
    deck.shuffle();
    return deck;
  }

  private static void distributeCards(Deck deck, List<Card> blackPile, List<Card> redPile) {
    while (!deck.isEmpty()) {
      Card selector = deck.deal();
      Card next = deck.deal();
      if (selector.getSuit().getColor() == Suit.Color.BLACK) {
        blackPile.add(next);
      } else {
        redPile.add(next);
      }
    }
  }
  private static void swapCards(List<Card> blackPile, List<Card> redPile, int numCardsToSwap) {
    for (int i = 0; i < numCardsToSwap; i++) {
      blackPile.add(redPile.removeFirst());
      redPile.add(blackPile.removeFirst());
    }
  }

  private static int countCardsForColor(List<Card> cards, Suit.Color color) {
    int count = 0;
    for (Card card : cards) {
      if (card.getSuit().getColor() == color) {
        count++;
      }
    }
    return count;
  }
}
