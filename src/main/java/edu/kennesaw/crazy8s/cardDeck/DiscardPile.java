package main.java.edu.kennesaw.crazy8s.cardDeck;

import main.java.edu.kennesaw.crazy8s.cards.StandardCard;

import java.util.ArrayList;
import java.util.List;

public class DiscardPile {
    private List<StandardCard> CardDeck;
    public DiscardPile(){
        CardDeck = new ArrayList<>();
    }

    public void Remove(StandardCard discardedCard){
        CardDeck.add(discardedCard);
    }

    public int Size(){
        int size = CardDeck.size();
        return size;
    }
}
