package models.Pieces.Strategy;

import models.Board.Cell;

public class HorizontalMovementStrategy implements  MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end) {
        return start.getY() == end.getY();
    }
}
