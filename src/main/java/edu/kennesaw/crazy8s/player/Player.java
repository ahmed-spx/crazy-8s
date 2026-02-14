package main.java.edu.kennesaw.crazy8s.player;

import main.java.edu.kennesaw.crazy8s.cards.StandardCard;

public interface Player {
    void playCard(StandardCard card);

    void drawCard(StandardCard card);
    void SetupHand();
    String get();

    }