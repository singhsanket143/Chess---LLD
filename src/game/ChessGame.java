package game;

import models.Board.Board;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.PieceName;
import models.Players.ChessPlayer;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ChessGame extends BoardGame{

    private final ChessPlayer p1;
    private final ChessPlayer p2;

    public ChessGame(ChessBoard board, ChessPlayer p1, ChessPlayer p2) {
        super(board, new ArrayDeque<>(Arrays.asList(p1, p2)));
        this.p1 = p1;
        this.p2 = p2;
        BoardFactory.prepareBoardByPlacingPieces(board);
    }

    @Override
    public boolean isGameOver() {
        boolean isWhiteKingDead = p1.getPiece(PieceName.KING).isKilled();
        boolean isBlackKingDead = p2.getPiece(PieceName.KING).isKilled();
        return isWhiteKingDead || isBlackKingDead;
    }

    @Override
    public void showBoard() {
        this.board.display();
    }

    private void initBoard() {

    }
}
