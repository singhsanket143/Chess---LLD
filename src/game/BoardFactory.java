package game;

import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.ChessPiece;
import models.Pieces.Pawn;
import models.Pieces.PieceName;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardFactory {

    public static void prepareBoardByPlacingPieces(ChessBoard board) {
        Map<PieceName, ChessPiece> whitePieces = getPieces(Color.WHITE);
        Map<PieceName, ChessPiece> blackPeces = getPieces(Color.BLACK);

        placePawns(board, whitePieces, Color.WHITE); // place white pawns
        placePawns(board, blackPeces, Color.BLACK); // place black pawns
    }

    private static void placePawns(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 1 : 6;
        List<PieceName> pawns = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4,
                PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        for(int col = 0; col < 8; col++) {
            board.setPiece(colorPieces.get(pawns.get(col)), row, (char)('a' + col));
        }
    }

    public static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName, ChessPiece> pieces = new HashMap<>();

        // Add all the pieces to the map
        pieces.put(PieceName.PAWN1, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P1"));
        pieces.put(PieceName.PAWN2, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P2"));
        pieces.put(PieceName.PAWN3, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P3"));
        pieces.put(PieceName.PAWN4, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P4"));
        pieces.put(PieceName.PAWN5, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P5"));
        pieces.put(PieceName.PAWN6, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P6"));
        pieces.put(PieceName.PAWN7, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P7"));
        pieces.put(PieceName.PAWN8, new Pawn(PieceName.PAWN1, color, color.toString().substring(0, 1) + "P8"));
//        pieces.put(PieceName.ROOK1, new Pawn(PieceName.ROOK1, color));
//        pieces.put(PieceName.ROOK2, new Pawn(PieceName.ROOK2, color));
//        pieces.put(PieceName.KNIGHT1, new Pawn(PieceName.KNIGHT1, color));
//        pieces.put(PieceName.KNIGHT2, new Pawn(PieceName.KNIGHT2, color));
//        pieces.put(PieceName.BISHOP1, new Pawn(PieceName.BISHOP1, color));
//        pieces.put(PieceName.BISHOP2, new Pawn(PieceName.BISHOP2, color));
//        pieces.put(PieceName.QUEEN, new Pawn(PieceName.QUEEN, color));
//        pieces.put(PieceName.KING, new Pawn(PieceName.KING, color));

        return pieces;
    }

}
