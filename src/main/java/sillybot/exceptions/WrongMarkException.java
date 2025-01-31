package sillybot.exceptions;

/**
 * Represents an exception when the user.png inputs a wrong mark.
 */
public class WrongMarkException extends DukeException {
    /**
     * Constructor for WrongMarkException.
     *
     * @param message Error message.
     */
    public WrongMarkException(String message) {
        super(message);
    }
}
