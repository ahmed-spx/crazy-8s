package main.java.edu.kennesaw.crazy8s.player;

public class CpuPlayer extends PlayerBase{
    private final String name;
    public CpuPlayer(String name){
        this.name = name;
    }

    @Override
    public String get() {
        return name;
    }
}
