package main.java.edu.kennesaw.crazy8s.game;

import main.java.edu.kennesaw.crazy8s.cardDeck.Deck;
import main.java.edu.kennesaw.crazy8s.cards.StandardCard;
import main.java.edu.kennesaw.crazy8s.player.Player;

import java.util.Scanner;

public class CrazyEightsGame {

    protected Deck deck;
    protected Player humanPlayer;
    protected Player cpuPlayer;
    protected boolean gameOver = false;
    public CrazyEightsGame(Deck deck, Player humanPlayer, Player cpuPlayer){
        //initialize protected deck and players
        this.deck = deck;
        this.humanPlayer = humanPlayer;
        this.cpuPlayer = cpuPlayer;

        //shuffles deck and initializes player hands as lists to hold cards
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
        //String name = Scanner.next(); - I'll do this aspect of writing player name in console later
        String playerName = "Ahmed";
        System.out.print(playerName);
        Player currentPlayer = humanPlayer;

        //Game header
        System.out.println("==================================================\n" +
                           "Crazy Eights (Simplified)\n" +
                           "==================================================\n");

        //Starting the game with the first discard
        StandardCard startingCard = deck.Draw();
        System.out.println("Starting discard: " + startingCard.getCard());

        //Game Over loop
        do{
            new TurnAction(startingCard, currentPlayer);
        }while (!gameOver);
        //how do I get the turn to work?
        //TurnsContext should call humanPlayer and cpuPlayer individually?
        //do-while loop?
        //new TurnAction(deck, startingCard, humanPlayer);
    }
}
