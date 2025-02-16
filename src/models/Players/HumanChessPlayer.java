package models.Players;

import models.Board.ChessBoard;
import models.Pieces.ChessPiece;
import models.Pieces.Move;
import models.Pieces.PieceName;

import java.util.Map;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer {

    public HumanChessPlayer(String name, Map<PieceName, ChessPiece> pieces, ChessBoard board) {
        super(name, pieces, board);
    }

    @Override
    public Move makeMove() {
        // 1. Display the current state of the board
        this.getBoard().display();

        // 2. Prepare scanner for taking input
        Scanner scn = new Scanner(System.in);

        // 3. Take the input of which cell user wants to select and then move piece from that cell
        System.out.println("Enter the row and column of the piece you want to move: ");
        int row = scn.nextInt();
        char col = scn.next().charAt(0);

        // 4. Check if there is any piece present or not ?
        if(!this.getBoard().getBoard().get(row).get(col - 'a').hasPiece()) {
            throw new RuntimeException("No piece found at this location");
        }

        // 5. Take input for destination
        System.out.println("Enter the row and column of the destination: ");
        int destRow = scn.nextInt();
        char destCol = scn.next().charAt(0);

        // 6. check if we can move or not ?
        ChessPiece pieceToMove = this.getBoard().getBoard().get(row).get(col - 'a').getPiece().get();
        if(!pieceToMove.canMove(this.getBoard().getBoard().get(row).get(col - 'a'), this.getBoard().getBoard().get(destRow).get(destCol - 'a'), this.getBoard())) {
            throw new RuntimeException("Invalid move");
        }

        // 7. Prepare the move object
        return new Move(this.getBoard().getBoard().get(row).get(col - 'a'), this.getBoard().getBoard().get(destRow).get(destCol - 'a'));

    }
}
