package Lecture_EnumerationsAndAnnotations_Exercises.p07_DeckOfCards;

public class Card {
    private CardRank cardRank;
    private CardSuits cardSuits;
    private int cardPower;

    public Card(String cardRank, String cardSuits) {
        this.cardRank = Enum.valueOf(CardRank.class, cardRank);
        this.cardSuits = Enum.valueOf(CardSuits.class, cardSuits);
    }

    public int getCardPower(){
        this.cardPower =  cardRank.getCardPower() + cardSuits.getCardsSuits();
        return this.cardPower;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",cardRank.name(),cardSuits.name(),
                cardRank.getCardPower() + cardSuits.getCardsSuits());
    }


}
