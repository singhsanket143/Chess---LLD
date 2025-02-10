package models.Pieces.Strategy;

import models.Board.Cell;

public class VerticalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end) {
        return start.getX() == end.getX();
    }
}
