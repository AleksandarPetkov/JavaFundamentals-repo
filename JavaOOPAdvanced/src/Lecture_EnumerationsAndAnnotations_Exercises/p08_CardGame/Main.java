package Lecture_EnumerationsAndAnnotations_Exercises.p08_CardGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchFieldException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String firstPlayer = reader.readLine();
        String secondPlayer = reader.readLine();
        DeckOfCards deckOfFirstPlayer = new DeckOfCards();
        DeckOfCards deckOSecondPlayer = new DeckOfCards();

        // First Player
        while (deckOfFirstPlayer.getCards().size() != 5) {
            String[] tokens = reader.readLine().split(" of ");

            // check for valid card
            try {
                Card currentCard = new Card(tokens[0], tokens[1]);

                //check card is in the deck
                boolean isPresent = deckOfFirstPlayer.isCardPresent(currentCard);
                if (isPresent == false){
                    deckOfFirstPlayer.getCards().add(currentCard);
                } else {
                    System.out.println("Card is not in the deck.");
                }

            } catch (Exception e) {
                System.out.println("No such card exists.");

            }
        }

        // Second Player
        while (deckOSecondPlayer.getCards().size() != 5) {
            String[] tokens = reader.readLine().split(" of ");

            // check for valid card
            try {
                Card currentCard = new Card(tokens[0], tokens[1]);

                //check card is in the deck
                boolean isPresent = deckOSecondPlayer.isCardPresent(currentCard);
                if (isPresent == false){
                    deckOSecondPlayer.getCards().add(currentCard);
                } else {
                    System.out.println("Card is not in the deck.");
                }

            } catch (Exception e) {
                System.out.println("No such card exists.");

            }
        }

        // Lets Game
        Card bestCardFirstPlayer = deckOfFirstPlayer.getBestCardPower();
        Card bestCardSecondPlayer = deckOSecondPlayer.getBestCardPower();

        if (bestCardFirstPlayer.getCardPower() > bestCardSecondPlayer.getCardPower()){
            System.out.println(String.format("%s wins with %s of %s.",firstPlayer,bestCardFirstPlayer.getCardRank(), bestCardFirstPlayer.getCardSuits()));
        } else {
            System.out.println(String.format("%s wins with %s of %s.",secondPlayer,bestCardSecondPlayer.getCardRank(), bestCardSecondPlayer.getCardSuits()));
        }
    }
}
