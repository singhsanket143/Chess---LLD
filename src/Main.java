import game.BoardGame;
import game.ChessGame;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Players.ChessPlayer;
import models.Players.Player;
import models.Players.PlayerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ChessBoard b = new ChessBoard();
        ChessPlayer p1 = PlayerFactory.createPlayer("Alice", Color.WHITE, b);
        ChessPlayer p2 = PlayerFactory.createPlayer("Bob", Color.BLACK, b);
        BoardGame game = new ChessGame(b, p1, p2);
//        game.showBoard();
        game.startGame();
    }
}