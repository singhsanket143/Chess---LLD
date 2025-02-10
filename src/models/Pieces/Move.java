package models.Pieces;

import models.Board.Cell;

public class Move {

    private final Cell source;
    private final Cell destination;

    public Move(Cell source, Cell destination) {
        this.source = source;
        this.destination = destination;
    }

    public Cell getSource() {
        return source;
    }

    public Cell getDestination() {
        return destination;
    }

}
