package main.java.edu.kennesaw.crazy8s.game;

import main.java.edu.kennesaw.crazy8s.cardDeck.Deck;
import main.java.edu.kennesaw.crazy8s.cards.StandardCard;
import main.java.edu.kennesaw.crazy8s.player.Player;

import javax.swing.text.PlainDocument;

public class TurnAction {
        //constructor that will take current card, and current player
        //do-while loop that will have an "end game" method or class
        //end game will be if either player has no cards, or no moves can be made and there's no deck left
    public TurnAction(Deck deck, StandardCard currentCard, Player currentPlayer){
        System.out.println("Top Discard: " + currentCard.getCard());
        System.out.println("Deck remaining: " + deck.Size());
    }
}

