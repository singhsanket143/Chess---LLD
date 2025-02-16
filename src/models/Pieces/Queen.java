package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Strategy.DiagonalMovementStrategy;
import models.Pieces.Strategy.HorizontalMovementStrategy;
import models.Pieces.Strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class Queen extends Piece implements ChessPiece{

    public Queen(PieceName name, Color color, String symbol) {
        super(name, color, symbol);
        this.movementStrategies = Arrays.asList(new VerticalMovementStrategy(), new HorizontalMovementStrategy(), new DiagonalMovementStrategy());
    }

    @Override
    public void makeMove(Cell startingCell, Cell endingCell) {

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

        throw new InvalidPieceMoveException("Invalid move for Queen");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }

}
