package models.Players;

import game.BoardFactory;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.ChessPiece;
import models.Pieces.PieceName;

import java.util.Map;

public class PlayerFactory {

    public static ChessPlayer createPlayer(String name, Color color, ChessBoard board) {
        Map<PieceName, ChessPiece> pieces = (color == Color.WHITE) ? BoardFactory.prepareWhitePieces() : BoardFactory.prepareBlackPieces();
        return new HumanChessPlayer(name, pieces, board);
    }
}
