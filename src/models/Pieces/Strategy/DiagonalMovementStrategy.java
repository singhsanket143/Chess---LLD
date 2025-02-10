package models.Pieces.Strategy;

import models.Board.Cell;

public class DiagonalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end) {
        return Math.abs(start.getX() - end.getX()) == Math.abs(start.getY() - end.getY());
    }
}
