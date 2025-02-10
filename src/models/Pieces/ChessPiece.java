package models.Pieces;

import models.Board.Cell;
import models.Helpers.Color;

public interface ChessPiece {

    void makeMove(Cell startingCell, Cell endingCell);

    void setKilled(boolean killed);

    boolean isKilled();

    boolean canMove(Cell startingCell, Cell endingCell);

    void listPossibleMoves(Cell currentCell);

    boolean isMovingForFirstTime();

    Color getColor();
}
