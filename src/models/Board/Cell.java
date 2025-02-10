package models.Board;


import models.Helpers.Pair;
import models.Pieces.ChessPiece;

import java.util.Optional;

// In a game of chess a cell may or may not contain a piece
public class Cell {

    private Optional<ChessPiece> piece;
    private final Pair position;

    public Cell(int x, int y) {
        this.position = new Pair(x, y);
        this.piece = Optional.empty();
    }

    public Optional<ChessPiece> getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = Optional.of(piece);
    }

    public boolean hasPiece() {
        return piece.isPresent();
    }

    public void removePiece() {
        this.piece = Optional.empty();
    }

    public Pair getPosition() {
        return position;
    }

    public int getX() {
        return position.getX();
    }

    public int getY() {
        return position.getY();
    }

    public int getVerticalDistance(Cell cell) {
        return Math.abs(this.getY() - cell.getY());
    }

    public int getHorizontalDistance(Cell cell) {
        return Math.abs(this.getX() - cell.getX());
    }


}
