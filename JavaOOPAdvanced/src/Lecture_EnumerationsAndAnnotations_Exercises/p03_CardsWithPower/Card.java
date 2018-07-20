package Lecture_EnumerationsAndAnnotations_Exercises.p03_CardsWithPower;

public class Card {
    private CardRank cardRank;
    private CardSuits cardSuits;

    public Card(String cardRank, String cardSuits) {
        this.cardRank = Enum.valueOf(CardRank.class, cardRank);
        this.cardSuits = Enum.valueOf(CardSuits.class, cardSuits);
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",cardRank.name(),cardSuits.name(),
                cardRank.getCardPower() + cardSuits.getCardsSuits());
    }
}
