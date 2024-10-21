/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicalModel.interfaces;

import logicalExceptions.MaxThreadsErrorException;
import logicalExceptions.ServerErrorException;
import logicalExceptions.SignInErrorException;
import logicalExceptions.UserExistErrorException;
import logicalExceptions.UserNotActiveException;
import logicalModel.model.User;

/**
 * Interface Signable that defines the methods required for user authentication 
 * and session management.
 * 
 * @author Elbire, Irati, Olaia and Meylin
 */
public interface Signable {
    /**
     * Signs in a user to the system.
     * 
     * @param user the user attempting to sign in
     * @return the signed-in user with updated information
     * @throws logicalExceptions.MaxThreadsErrorException
     * @throws logicalExceptions.ServerErrorException
     * @throws logicalExceptions.SignInErrorException
     * @throws logicalExceptions.UserNotActiveException
     */
    public User signIn(User user) throws MaxThreadsErrorException, ServerErrorException, SignInErrorException,UserNotActiveException;
    
    /**
     * Registers a new user in the system.
     * 
     * @param user the user attempting to sign up
     * @return the registered user with updated information
     */
    public User signUp(User user) throws ServerErrorException, UserExistErrorException;
    
}