package logicalExceptions;

/**
 * Exception thrown when a server error occurs.
 *
 * This class extends the Exception class to provide specific error handling for
 * situations where the server encounters an issue that prevents it from
 * fulfilling a request.
 *
 * @author Elbire
 */
public class ServerErrorException extends Exception {

    /**
     * Creates a new instance of ServerErrorException without a detail message.
     */
    public ServerErrorException() {
    }

    /**
     * Constructs an instance of ServerErrorException with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public ServerErrorException(String msg) {
        super(msg);
    }
}
