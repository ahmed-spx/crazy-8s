package main.java.edu.kennesaw.crazy8s.cardDeck;
import main.java.edu.kennesaw.crazy8s.cards.StandardCard;
import java.util.*;
import java.util.Collections;

public class Deck{
    //52 cards
    //create list that contain 52 "card" classes
    protected StandardCard AceOfClubs = new StandardCard();
    protected StandardCard AceOfHearts = new StandardCard();
    protected StandardCard AceOfSpades = new StandardCard();
    protected StandardCard AceOfDiamonds = new StandardCard();

    protected StandardCard KingOfClubs = new StandardCard();
    protected StandardCard KingOfHearts = new StandardCard();
    protected StandardCard KingOfSpades = new StandardCard();
    protected StandardCard KingOfDiamonds = new StandardCard();

    protected StandardCard QueenOfClubs = new StandardCard();
    protected StandardCard QueenOfHearts = new StandardCard();
    protected StandardCard QueenOfSpades = new StandardCard();
    protected StandardCard QueenOfDiamonds = new StandardCard();

    protected StandardCard JackOfClubs = new StandardCard();
    protected StandardCard JackOfHearts = new StandardCard();
    protected StandardCard JackOfSpades = new StandardCard();
    protected StandardCard JackOfDiamonds = new StandardCard();

    protected StandardCard TenOfClubs = new StandardCard();
    protected StandardCard TenOfHearts = new StandardCard();
    protected StandardCard TenOfSpades = new StandardCard();
    protected StandardCard TenOfDiamonds = new StandardCard();

    protected StandardCard NineOfClubs = new StandardCard();
    protected StandardCard NineOfHearts = new StandardCard();
    protected StandardCard NineOfSpades = new StandardCard();
    protected StandardCard NineOfDiamonds = new StandardCard();

    protected StandardCard EightOfClubs = new StandardCard();
    protected StandardCard EightOfHearts = new StandardCard();
    protected StandardCard EightOfSpades = new StandardCard();
    protected StandardCard EightOfDiamonds = new StandardCard();

    protected StandardCard SevenOfClubs = new StandardCard();
    protected StandardCard SevenOfHearts = new StandardCard();
    protected StandardCard SevenOfSpades = new StandardCard();
    protected StandardCard SevenOfDiamonds = new StandardCard();

    protected StandardCard SixOfClubs = new StandardCard();
    protected StandardCard SixOfHearts = new StandardCard();
    protected StandardCard SixOfSpades = new StandardCard();
    protected StandardCard SixOfDiamonds = new StandardCard();

    protected StandardCard FiveOfClubs = new StandardCard();
    protected StandardCard FiveOfHearts = new StandardCard();
    protected StandardCard FiveOfSpades = new StandardCard();
    protected StandardCard FiveOfDiamonds = new StandardCard();

    protected StandardCard FourOfClubs = new StandardCard();
    protected StandardCard FourOfHearts = new StandardCard();
    protected StandardCard FourOfSpades = new StandardCard();
    protected StandardCard FourOfDiamonds = new StandardCard();

    protected StandardCard ThreeOfClubs = new StandardCard();
    protected StandardCard ThreeOfHearts = new StandardCard();
    protected StandardCard ThreeOfSpades = new StandardCard();
    protected StandardCard ThreeOfDiamonds = new StandardCard();

    protected StandardCard TwoOfClubs = new StandardCard();
    protected StandardCard TwoOfHearts = new StandardCard();
    protected StandardCard TwoOfSpades = new StandardCard();
    protected StandardCard TwoOfDiamonds = new StandardCard();

    private void SetupDeck (){
        CardDeck.add(AceOfClubs);
        CardDeck.add(AceOfHearts);
        CardDeck.add(AceOfSpades);
        CardDeck.add(AceOfDiamonds);

        CardDeck.add(KingOfClubs);
        CardDeck.add(KingOfHearts);
        CardDeck.add(KingOfSpades);
        CardDeck.add(KingOfDiamonds);

        CardDeck.add(QueenOfClubs);
        CardDeck.add(QueenOfHearts);
        CardDeck.add(QueenOfSpades);
        CardDeck.add(QueenOfDiamonds);

        CardDeck.add(JackOfClubs);
        CardDeck.add(JackOfHearts);
        CardDeck.add(JackOfSpades);
        CardDeck.add(JackOfDiamonds);

        CardDeck.add(TenOfClubs);
        CardDeck.add(TenOfHearts);
        CardDeck.add(TenOfSpades);
        CardDeck.add(TenOfDiamonds);

        CardDeck.add(NineOfClubs);
        CardDeck.add(NineOfHearts);
        CardDeck.add(NineOfSpades);
        CardDeck.add(NineOfDiamonds);

        CardDeck.add(EightOfClubs);
        CardDeck.add(EightOfHearts);
        CardDeck.add(EightOfSpades);
        CardDeck.add(EightOfDiamonds);

        CardDeck.add(SevenOfClubs);
        CardDeck.add(SevenOfHearts);
        CardDeck.add(SevenOfSpades);
        CardDeck.add(SevenOfDiamonds);

        CardDeck.add(SixOfClubs);
        CardDeck.add(SixOfHearts);
        CardDeck.add(SixOfSpades);
        CardDeck.add(SixOfDiamonds);

        CardDeck.add(FiveOfClubs);
        CardDeck.add(FiveOfHearts);
        CardDeck.add(FiveOfSpades);
        CardDeck.add(FiveOfDiamonds);

        CardDeck.add(FourOfClubs);
        CardDeck.add(FourOfHearts);
        CardDeck.add(FourOfSpades);
        CardDeck.add(FourOfDiamonds);

        CardDeck.add(ThreeOfClubs);
        CardDeck.add(ThreeOfHearts);
        CardDeck.add(ThreeOfSpades);
        CardDeck.add(ThreeOfDiamonds);

        CardDeck.add(TwoOfClubs);
        CardDeck.add(TwoOfHearts);
        CardDeck.add(TwoOfSpades);
        CardDeck.add(TwoOfDiamonds);
    }

    private List<StandardCard> CardDeck;
    public Deck(){
        CardDeck = new ArrayList<>();
        SetupDeck();
    }
    public StandardCard getCard(int number){
        return CardDeck.get(number);
    }

    public StandardCard Draw(){
        return CardDeck.remove(0);
    }

    public void Shuffle(){
        Collections.shuffle(CardDeck);
    }
    public int Size(){
        int size = CardDeck.size();
        return size;
    }
}
