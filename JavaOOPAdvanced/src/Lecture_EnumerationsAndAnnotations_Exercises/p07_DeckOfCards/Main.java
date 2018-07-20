package Lecture_EnumerationsAndAnnotations_Exercises.p07_DeckOfCards;

public class Main {
    public static void main(String[] args) {
        CardSuits[] cardSuits = CardSuits.values();
        CardRank[] cardRanks = CardRank.values();

        for (CardSuits cardSuit : cardSuits) {

            for (CardRank cardRank : cardRanks) {
                System.out.println(cardRank + " of "+ cardSuit);
            }
        }
    }
}
