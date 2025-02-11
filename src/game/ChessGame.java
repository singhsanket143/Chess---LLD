package game;

import models.Board.Board;
import models.Board.ChessBoard;
import models.Helpers.Color;

public class ChessGame extends BoardGame{
    public ChessGame(ChessBoard board) {
        super(board);
        BoardFactory.prepareBoardByPlacingPieces(board);
    }

    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public void showBoard() {
        this.board.display();
    }

    private void initBoard() {

    }
}
