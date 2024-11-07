package logicalExceptions;

/**
 * Exception thrown when a user is not active.
 *
 * This class extends the Exception class to provide specific error handling for
 * situations where an action is attempted on a user account that is inactive,
 * such as trying to sign in or perform actions that require an active account
 * status.
 *
 * @author Elbire
 */
public class UserNotActiveException extends Exception {

    /**
     * Creates a new instance of UserNotActiveException without a detail
     * message.
     */
    public UserNotActiveException() {
    }

    /**
     * Constructs an instance of UserNotActiveException with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public UserNotActiveException(String msg) {
        super(msg);
    }
}
