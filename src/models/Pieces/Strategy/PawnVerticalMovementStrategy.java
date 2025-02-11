package models.Pieces.Strategy;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Pawn;

public class PawnVerticalMovementStrategy implements MovementStrategy {

    private final Pawn pawn;

    public PawnVerticalMovementStrategy(Pawn pawn) {
        this.pawn = pawn;
    }

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        if(start.getY() != end.getY()){
            // for a vertical movement the column character should be the same
            return false;
        }

        int step = (this.pawn.getColor() == Color.WHITE) ? 1 : -1; // determine the direction of the movement
        int displacement = end.getX() - start.getX();

        if(this.pawn.isMovingForFirstTime() && displacement == 2 * step) {
            return !end.hasPiece() && !board.getBoard().get(start.getX() + step).get(start.getY() - 'a').hasPiece();
        }

        return displacement == step && (!end.hasPiece());

    }
}
