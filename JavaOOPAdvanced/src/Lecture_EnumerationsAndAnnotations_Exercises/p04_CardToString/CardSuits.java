package Lecture_EnumerationsAndAnnotations_Exercises.p04_CardToString;

public enum CardSuits {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int cardsSuits;

    CardSuits(int cardsSuits) {
        this.cardsSuits = cardsSuits;
    }

    public int getCardsSuits() {
        return cardsSuits;
    }
}
