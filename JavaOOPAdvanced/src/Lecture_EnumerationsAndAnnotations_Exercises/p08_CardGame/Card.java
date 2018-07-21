package Lecture_EnumerationsAndAnnotations_Exercises.p08_CardGame;

public class Card {
    private CardRank cardRank;
    private CardSuits cardSuits;
    private int cardPower;

    public Card(String cardRank, String cardSuits) {
        this.cardRank = Enum.valueOf(CardRank.class, cardRank);
        this.cardSuits = Enum.valueOf(CardSuits.class, cardSuits);
    }

    public int getCardPower(){
        this.cardPower =  cardRank.getCardRank() + cardSuits.getCardsSuits();
        return this.cardPower;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public CardSuits getCardSuits() {
        return cardSuits;
    }
}
