package models.Pieces.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class VerticalMovementStrategy implements MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
       if(start.getY() != end.getY()){
           // for a vertical movement the column character should be the same
           return false;
       }

        int step = (end.getX() > start.getX()) ? 1 : -1; // determine the direction of the movement
        int currentRow = start.getX() + step;

        while(currentRow != end.getX() && currentRow >= 0 && currentRow < 8) {
            if(board.getBoard().get(currentRow).get(start.getY() - 'a').hasPiece()) {
                return false; // there is a piece in the way
            }
            currentRow += step;
        }

        return !end.hasPiece() || end.getPiece().get().getColor() != start.getPiece().get().getColor();

    }
}
