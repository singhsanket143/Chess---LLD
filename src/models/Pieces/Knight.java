package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.Strategy.KingMovementStrategy;
import models.Pieces.Strategy.KnightMovementStrategy;

import java.util.Arrays;

public class Knight extends Piece implements ChessPiece{

    public Knight(PieceName name, Color color, String symbol) {
        super(name, color, symbol);
        this.movementStrategies = Arrays.asList(new KnightMovementStrategy());
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
