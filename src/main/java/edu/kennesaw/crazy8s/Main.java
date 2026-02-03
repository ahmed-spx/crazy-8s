package main.java.edu.kennesaw.crazy8s;

import main.java.edu.kennesaw.crazy8s.cardDeck.Deck;
import main.java.edu.kennesaw.crazy8s.game.CrazyEightsGame;
import main.java.edu.kennesaw.crazy8s.player.CpuPlayer;
import main.java.edu.kennesaw.crazy8s.player.HumanPlayer;
import main.java.edu.kennesaw.crazy8s.player.Player;
public class Main {
    public static void main(String[] args) {

        Player human = new HumanPlayer("You");
        Player cpu = new CpuPlayer("CPU");

        Deck deck = new Deck();
        CrazyEightsGame game = new CrazyEightsGame(deck, human, cpu);
        //game.run();

    }
}