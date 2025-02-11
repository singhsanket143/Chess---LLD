package game;

import models.Board.Board;

public abstract class BoardGame {

    protected final Board board;

    protected BoardGame(Board board) {
        this.board = board;
    }

    public abstract void showBoard();

    public abstract boolean isGameOver();

    public void startGame() {
        // TODO: Implement start of game
    }



}
