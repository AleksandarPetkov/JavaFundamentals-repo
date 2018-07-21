package Lecture_EnumerationsAndAnnotations_Exercises.p08_CardGame;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    private List<Card> cards;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getBestCardPower(){
        Card current = null;
        int biggestCard = 0;

        for (Card card : cards) {
          if (card.getCardPower() > biggestCard){
              biggestCard = card.getCardPower();
              current = card;
          }
        }
        return current;
    }

    public boolean isCardPresent(Card currentcard){
        for (Card card : cards) {
            if (currentcard.getCardRank().equals(card.getCardRank()) &&
                    currentcard.getCardSuits().equals(card.getCardSuits())){
                return true;
            }
        }
        return false;
    }

}
