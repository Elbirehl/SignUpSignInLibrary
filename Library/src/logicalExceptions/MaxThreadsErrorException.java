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
public class MaxThreadsErrorException extends Exception {

    /**
     * Creates a new instance of <code>MaxThreadsErrorException</code> without
     * detail message.
     */
    public MaxThreadsErrorException() {
    }

    /**
     * Constructs an instance of <code>MaxThreadsErrorException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MaxThreadsErrorException(String msg) {
        super(msg);
    }
}
