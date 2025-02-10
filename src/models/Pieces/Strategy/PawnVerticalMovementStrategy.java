package models.Pieces.Strategy;

import models.Board.Cell;

public class PawnVerticalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end) {
        // TODO: Implement step logic
        return start.getX() == end.getX();
    }
}
