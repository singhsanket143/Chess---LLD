package game;

import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Pieces.ChessPiece;
import models.Pieces.Pawn;
import models.Pieces.PieceName;
import models.Pieces.Rook;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardFactory {

    public static void prepareBoardByPlacingPieces(ChessBoard board) {
        Map<PieceName, ChessPiece> whitePieces = getPieces(Color.WHITE);
        Map<PieceName, ChessPiece> blackPieces = getPieces(Color.BLACK);

        placePawns(board, whitePieces, Color.WHITE); // place white pawns
        placePawns(board, blackPieces, Color.BLACK); // place black pawns
        placeRooks(board, whitePieces, Color.WHITE); // place white rooks
        placeRooks(board, blackPieces, Color.BLACK); // place black rooks
        placeBishops(board, whitePieces, Color.WHITE); // place white bishops
        placeBishops(board, blackPieces, Color.BLACK); // place black bishops
        placeQueen(board, whitePieces, Color.WHITE); // place white queen
        placeQueen(board, blackPieces, Color.BLACK); // place black queen
        placeKing(board, whitePieces, Color.WHITE); // place white king
        placeKing(board, blackPieces, Color.BLACK); // place black king
        placeKnights(board, whitePieces, Color.WHITE); // place white knights
        placeKnights(board, blackPieces, Color.BLACK); // place black knights
    }

    private static void placePawns(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 1 : 6;
        List<PieceName> pawns = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3, PieceName.PAWN4,
                PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        for(int col = 0; col < 8; col++) {
            board.setPiece(colorPieces.get(pawns.get(col)), row, (char)('a' + col));
        }
    }

    private static void placeRooks(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.ROOK1), row, 'a');
        board.setPiece(colorPieces.get(PieceName.ROOK2), row, 'h');
    }

    private static void placeBishops(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.BISHOP1), row, 'c');
        board.setPiece(colorPieces.get(PieceName.BISHOP2), row, 'f');
    }

    private static void placeQueen(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.QUEEN), row, 'd');
    }

    private static void placeKing(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.KING), row, 'e');
    }

    private static void placeKnights(ChessBoard board, Map<PieceName, ChessPiece> colorPieces, Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(colorPieces.get(PieceName.KNIGHT1), row, 'b');
        board.setPiece(colorPieces.get(PieceName.KNIGHT2), row, 'g');
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
        pieces.put(PieceName.ROOK1, new Rook(PieceName.ROOK1, color, color.toString().substring(0, 1) + "R1"));
        pieces.put(PieceName.ROOK2, new Rook(PieceName.ROOK2, color, color.toString().substring(0, 1) + "R2"));
        pieces.put(PieceName.KNIGHT1, new Pawn(PieceName.KNIGHT1, color, color.toString().substring(0, 1) + "N1"));
        pieces.put(PieceName.KNIGHT2, new Pawn(PieceName.KNIGHT2, color, color.toString().substring(0, 1) + "N2"));
        pieces.put(PieceName.BISHOP1, new Pawn(PieceName.BISHOP1, color, color.toString().substring(0, 1) + "B1"));
        pieces.put(PieceName.BISHOP2, new Pawn(PieceName.BISHOP2, color, color.toString().substring(0, 1) + "B2"));
        pieces.put(PieceName.QUEEN, new Pawn(PieceName.QUEEN, color, color.toString().substring(0, 1) + "Q1"));
        pieces.put(PieceName.KING, new Pawn(PieceName.KING, color, color.toString().substring(0, 1) + "K1"));

        return pieces;
    }

}
