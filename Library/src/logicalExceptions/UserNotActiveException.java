/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicalExceptions;

/**
 *
 * @author 2dam
 */
public class UserNotActiveException extends Exception {

    /**
     * Creates a new instance of <code>UserNotActiveException</code> without
     * detail message.
     */
    public UserNotActiveException() {
    }

    /**
     * Constructs an instance of <code>UserNotActiveException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UserNotActiveException(String msg) {
        super(msg);
    }
}
