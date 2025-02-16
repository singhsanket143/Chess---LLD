package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Strategy.HorizontalMovementStrategy;
import models.Pieces.Strategy.KingMovementStrategy;
import models.Pieces.Strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class King extends Piece implements ChessPiece{

    public King(PieceName name, Color color, String symbol) {
        super(name, color, symbol);
        this.movementStrategies = Arrays.asList(new KingMovementStrategy());
    }


    @Override
    public void setKilled(boolean killed) {
        this.setKilled(killed);
    }

    @Override
    public boolean isKilled() {
        return this.isKilled();
    }

    @Override
    public boolean canMove(Cell startingCell, Cell endingCell, ChessBoard board) {

        if(super.canMove(startingCell, endingCell, board)) {
            return true;
        }

        throw new InvalidPieceMoveException("Invalid move for King");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }

}
