package game;

import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Players.ChessPlayer;
import models.Players.PlayerFactory;

public class GameFactory {

    public static ChessGame createNewChessGame() {
        ChessBoard b = new ChessBoard();
        ChessPlayer p1 = PlayerFactory.createPlayer("Alice", Color.WHITE, b);
        ChessPlayer p2 = PlayerFactory.createPlayer("Bob", Color.BLACK, b);
        return new ChessGame(b, p1, p2);
    }
}
