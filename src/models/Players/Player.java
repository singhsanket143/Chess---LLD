package models.Players;

import models.Pieces.Move;

public abstract class Player {

    private final String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Move makeMove();

}
