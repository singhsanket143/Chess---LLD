package models.Pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.Helpers.Color;
import models.Helpers.Direction;
import models.Pieces.Strategy.MovementStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private final PieceName pieceName;
    private final String pieceSymbol;
    private final Color color;
    private boolean killed;
    private List<Move> movesDone;
    protected List<MovementStrategy> movementStrategies;

    public Piece(PieceName name, Color color, String symbol) {
        this.killed = false;
        this.pieceName = name;
        this.color = color;
        this.movesDone = new ArrayList<>();
        this.pieceSymbol = symbol;
    }

    public PieceName getPieceName() {
        return pieceName;
    }

    public boolean isMovingForFirstTime() {
        return movesDone.isEmpty();
    }

    public Color getColor() {
        return color;
    }

    public String getColorSymbol() {
        return (this.getColor().equals(Color.BLACK)) ? "B" : "W";
    }

    public String getPieceSymbol() {
        return this.pieceSymbol;
    }

    public boolean isKilled() {
        return killed;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    protected boolean canMove(Cell start, Cell end, ChessBoard board) {
        return movementStrategies.stream().anyMatch(strategy -> strategy.canMove(start, end, board));
    }

    protected boolean isMovingDiagonally(Cell startingCell, Cell endingCell) {
        return startingCell.getHorizontalDistance(endingCell) == 1 && startingCell.getVerticalDistance(endingCell) == 1;
    }

    protected boolean isMovingHorizontally(Cell startingCell, Cell endingCell) {
        return startingCell.getHorizontalDistance(endingCell) == 1 && startingCell.getVerticalDistance(endingCell) == 0;
    }

    protected boolean isMovingVertically(Cell startingCell, Cell endingCell) {
        return startingCell.getHorizontalDistance(endingCell) == 0 && startingCell.getVerticalDistance(endingCell) == 1;
    }

    protected Direction getMovementDirection(Cell startingCell, Cell endingCell) {
        int x = endingCell.getX() - startingCell.getX();
        int y = endingCell.getY() - startingCell.getY();
        if(x == 0 && y == 0) {
            return Direction.NONE;
        }
        if(x == 0) {
            return y > 0 ? Direction.FORWARD_Y : Direction.BACKWARD_Y;
        }
        if(y == 0) {
            return x > 0 ? Direction.FORWARD_X : Direction.BACKWARD_X;
        }
        if(x == 1 && y == 1) {
            return Direction.DIAGONAL_FORWARD_RIGHT;
        }
        if(x == 1 && y == -1) {
            return Direction.DIAGONAL_BACKWARD_RIGHT;
        }
        if(x == -1 && y == 1) {
            return Direction.DIAGONAL_FORWARD_LEFT;
        }
        if(x == -1 && y == -1) {
            return Direction.DIAGONAL_BACKWARD_LEFT;
        }
        return Direction.NONE;
    }


}
