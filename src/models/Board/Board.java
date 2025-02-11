package models.Board;

import models.Pieces.ChessPiece;
import models.Pieces.Move;

public interface Board {

    void display();

    void applyMove(Move move);

    void setPiece(ChessPiece piece, int row, char col);
}
