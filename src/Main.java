import game.BoardGame;
import game.ChessGame;
import game.GameFactory;
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

        BoardGame game = GameFactory.createNewChessGame();
        game.startGame();
    }
}