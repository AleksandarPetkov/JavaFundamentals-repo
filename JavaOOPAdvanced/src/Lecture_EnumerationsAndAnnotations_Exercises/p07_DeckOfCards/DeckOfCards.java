package Lecture_EnumerationsAndAnnotations_Exercises.p07_DeckOfCards;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DeckOfCards implements Comparator<Card> {
    private List<Card> cards;

    public DeckOfCards() {
        this.cards = new ArrayList<>();
    }

    public List<Card> getCards() {
        return cards;
    }

    @Override
    public int compare(Card firstCard, Card secondCard) {
        return Integer.compare(secondCard.getCardPower(), firstCard.getCardPower());
    }
}
