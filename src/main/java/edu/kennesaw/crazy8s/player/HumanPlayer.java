package main.java.edu.kennesaw.crazy8s.player;

public class HumanPlayer extends PlayerBase {
    private final String name;
    public HumanPlayer(String name){
        this.name = name;
    }

    @Override
    public String get() {
        return name;
    }
}
