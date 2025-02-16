package models.Pieces.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class KingMovementStrategy implements  MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        return true;
    }
}