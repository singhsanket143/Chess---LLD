package models.Pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;

public interface ChessPiece {

    void makeMove(Cell startingCell, Cell endingCell, ChessBoard board);

    void setKilled(boolean killed);

    boolean isKilled();

    boolean canMove(Cell startingCell, Cell endingCell, ChessBoard board);

    void listPossibleMoves(Cell currentCell);

    boolean isMovingForFirstTime();

    Color getColor();

    String getPieceSymbol();
}
