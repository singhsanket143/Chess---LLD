package models.Pieces.Strategy;

import models.Board.Cell;

public interface MovementStrategy {

    boolean canMove(Cell start, Cell end);
}
