package main.java.edu.kennesaw.crazy8s.game;

import main.java.edu.kennesaw.crazy8s.cardDeck.Deck;
import main.java.edu.kennesaw.crazy8s.cards.StandardCard;
import main.java.edu.kennesaw.crazy8s.player.Player;

import java.util.Scanner;

public class CrazyEightsGame {

    protected Deck deck;
    protected Player humanPlayer;
    protected Player cpuPlayer;
    public CrazyEightsGame(Deck deck, Player humanPlayer, Player cpuPlayer){
        //initialize protected deck and players
        this.deck = deck;
        this.humanPlayer = humanPlayer;
        this.cpuPlayer = cpuPlayer;

        //shuffles deck and sets up hands' lists
        deck.Shuffle();
        humanPlayer.SetupHand();
        cpuPlayer.SetupHand();

        //sets up human player hand
        humanPlayer.drawCard(deck.Draw());
        humanPlayer.drawCard(deck.Draw());
        humanPlayer.drawCard(deck.Draw());
        humanPlayer.drawCard(deck.Draw());
        humanPlayer.drawCard(deck.Draw());

        //sets up cpu player hand
        cpuPlayer.drawCard(deck.Draw());
        cpuPlayer.drawCard(deck.Draw());
        cpuPlayer.drawCard(deck.Draw());
        cpuPlayer.drawCard(deck.Draw());
        cpuPlayer.drawCard(deck.Draw());

    }

    public void run() {
        System.out.print("Enter your name (or press Enter for 'Player'): ");
        //String name = Scanner.next();
        String name = "Ahmed";
        System.out.print(name);

        //Game header
        System.out.println("==================================================\n" +
                           "Crazy Eights (Simplified)\n" +
                           "==================================================\n");

        //Starting the game with the first discard
        StandardCard startingCard = deck.Draw();
        System.out.println("Starting discard: " + startingCard.getCard());

        //how do I get the turn to work?
        //new TurnAction(deck, startingCard, humanPlayer);
    }
}
