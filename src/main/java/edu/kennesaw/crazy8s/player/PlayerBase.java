package main.java.edu.kennesaw.crazy8s.player;

import main.java.edu.kennesaw.crazy8s.cards.StandardCard;

import java.util.ArrayList;
import java.util.List;

abstract class PlayerBase implements Player {

    private List<StandardCard> Hand;
    @Override
    public void SetupHand(){
        Hand = new ArrayList<>();
    }
    @Override
    public void playCard(StandardCard card){
        Hand.remove(card);
    }
    @Override
    public void drawCard(StandardCard card){
        Hand.add(card);
    }
}
