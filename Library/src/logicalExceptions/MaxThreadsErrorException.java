package logicalExceptions;

/**
 * Exception thrown when the maximum number of threads is exceeded.
 * 
 * This class extends the Exception class to provide specific error handling
 * for situations where the application has reached its limit of concurrently
 * running threads.
 * 
 * @author Elbire
 */
public class MaxThreadsErrorException extends Exception {

    /**
     * Creates a new instance of MaxThreadsErrorException without
     * a detail message.
     */
    public MaxThreadsErrorException() {
    }

    /**
     * Constructs an instance of MaxThreadsErrorException with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MaxThreadsErrorException(String msg) {
        super(msg);
    }
}
