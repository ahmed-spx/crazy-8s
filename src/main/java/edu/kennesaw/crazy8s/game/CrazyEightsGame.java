package main.java.edu.kennesaw.crazy8s.game;

import main.java.edu.kennesaw.crazy8s.cardDeck.Deck;
import main.java.edu.kennesaw.crazy8s.player.Player;

import java.util.Scanner;

public class CrazyEightsGame {

    public CrazyEightsGame(Deck deck, Player humanPlayer, Player cpuPlayer){
        //initializes deck and hands lists
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

        //call TurnAction and give first card from deck at target card
    }

    public void run() {
        System.out.print("Enter your name (or press Enter for 'Player'): ");
        //String name = Scanner.next();
        String name = "Ahmed";
        System.out.print(name);

        System.out.println("==================================================\n" +
                           "Crazy Eights (Simplified)\n" +
                           "==================================================\n");

        //how do I call the deck here?
    }
}
