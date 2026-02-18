package main.java.edu.kennesaw.crazy8s.cards;
import main.java.edu.kennesaw.crazy8s.domain.Rank;
import main.java.edu.kennesaw.crazy8s.domain.Suit;


public class StandardCard implements Card {
    protected String card;
    protected Rank rank;
    protected Suit suit;

    @Override
    public String getCard() {
        return card;
    }
    public StandardCard standardCard(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
    }
}
