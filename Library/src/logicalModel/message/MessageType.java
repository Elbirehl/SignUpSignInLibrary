/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicalModel.message;

import java.io.Serializable;

/**
 * Enumeration MessageType represents the different types of messages that can 
 * be transmitted between the client and the server during user authentication 
 * and registration processes.
 * 
 * @author Elbire, Meylin, Olaia and Irati
 */
public enum MessageType implements Serializable {
    
    /** 
     * Represents a request to sign in a user. 
     */
    SIGN_IN_REQUEST,

    /** 
     * Represents a request to sign up a new user. 
     */
    SIGN_UP_REQUEST,

    /** 
     * Indicates a successful response. 
     */
    OK_RESPONSE,

    /** 
     * Indicates an error during sign-in.
     */
    SIGN_IN_ERROR,

    /** 
     * Indicates that the user already exists when attempting to sign up. 
     */
    USER_EXISTS_ERROR,

    /** 
     * Indicates that the user is not active in the system. 
     */
    USER_NOT_ACTIVE;
}
