package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Strategy.DiagonalMovementStrategy;
import models.Pieces.Strategy.HorizontalMovementStrategy;
import models.Pieces.Strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class Bishop extends Piece implements ChessPiece{

    public Bishop(PieceName name, Color color, String symbol) {
        super(name, color, symbol);
        this.movementStrategies = Arrays.asList(new DiagonalMovementStrategy());
    }

    @Override
    public boolean canMove(Cell startingCell, Cell endingCell, ChessBoard board) {

        if(super.canMove(startingCell, endingCell, board)) {
            return true;
        }

        throw new InvalidPieceMoveException("Invalid move for Bishop");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }

}
