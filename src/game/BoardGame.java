package game;

import models.Board.Board;
import models.Pieces.Move;
import models.Players.Player;

import java.util.Queue;

public abstract class BoardGame {

    protected final Board board;
    protected final Queue<Player> players;

    protected BoardGame(Board board, Queue<Player> players) {
        this.board = board;
        this.players = players;
    }

    public abstract void showBoard();

    public abstract boolean isGameOver();

    public void startGame() {
        while(true) {
            Player current = players.poll(); // get the current player
            // take a move decision from thr player
            Move move = current.makeMove();

            this.board.applyMove(move);

            if(isGameOver()) {
                System.out.println("Game Over");
                System.out.println(current.getName() + " wins");
                break;
            }
            players.add(current); // add the player back to the queue
        }
    }

}
