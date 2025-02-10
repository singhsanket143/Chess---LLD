package exceptions;

public class InvalidPieceMoveException extends RuntimeException {
    public InvalidPieceMoveException(String message) {
        super(message);
    }
}
