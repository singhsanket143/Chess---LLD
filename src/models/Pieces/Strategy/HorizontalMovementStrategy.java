package models.Pieces.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class HorizontalMovementStrategy implements  MovementStrategy {

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        if(start.getX() != end.getX()){
            // for a horizontal movement the row number should be the same
            return false;
        }

        int step = (end.getY() > start.getY()) ? 1 : -1; // determine the direction of the movement
        int currentColumn = start.getY() + step;

        while(currentColumn != end.getY() && currentColumn >=0 && currentColumn < 8) {
            if(board.getBoard().get(start.getX()).get(currentColumn - 'a').hasPiece()) {
                return false; // there is a piece in the way
            }
            currentColumn += step;
        }

        return !end.hasPiece() || end.getPiece().get().getColor() != start.getPiece().get().getColor();
    }
}
