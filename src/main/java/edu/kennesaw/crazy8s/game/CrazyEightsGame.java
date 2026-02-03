package main.java.edu.kennesaw.crazy8s.game;

import main.java.edu.kennesaw.crazy8s.cardDeck.Deck;
import main.java.edu.kennesaw.crazy8s.player.CpuPlayer;
import main.java.edu.kennesaw.crazy8s.player.HumanPlayer;
import main.java.edu.kennesaw.crazy8s.player.Player;

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


    }

}
