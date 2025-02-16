package models.Pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Helpers.Direction;
import models.Pieces.Strategy.DiagonalMovementStrategy;
import models.Pieces.Strategy.PawnVerticalMovementStrategy;

import java.util.Arrays;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(PieceName name, Color color, String symbol) {
        super(name, color, symbol);
        this.movementStrategies = Arrays.asList(new PawnVerticalMovementStrategy(this), new DiagonalMovementStrategy());
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
        // 1. If this is the first move then pawn can move one step or two step
        // 2. If this is not the first move then pawn can move only one step
        // 3. If diagonally we have an opposite color piece then pawn can move and kill that piece
        // 4. If diagonally we have an same color piece then pawn can't move
        // 5. If vertically we have a piece then pawn can't move
        // 6. If we have a black pawn then it can move in the negative direction of y-axis and if we have a white pawn
        // then it can move in the positive direction of y-axis
        if(super.canMove(startingCell, endingCell, board)) {
            return true;
        }

        throw new InvalidPieceMoveException("Invalid move for Pawn");
    }

    @Override
    public void listPossibleMoves(Cell currentCell) {

    }

}
