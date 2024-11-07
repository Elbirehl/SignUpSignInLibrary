package logicalModel.message;

import java.io.Serializable;
import logicalModel.model.User;

/**
 * The Message class represents a message containing a user and a message type,
 * intended for transmission in the form of bytes to the database.
 * 
 * @author Elbire, Irati, Meylin and Olaia
 */
public class Message implements Serializable {
    
    private User user;
    private MessageType message;

    /**
     * Default constructor for creating an empty Message instance.
     */
    public Message() {
    }

    /**
     * Constructs a Message with the specified user and message type.
     * 
     * @param user the user associated with the message
     * @param message the type of message
     */
    public Message(User user, MessageType message) {
        this.user = user;
        this.message = message;
    }

    /**
     * Gets the user associated with this message.
     * 
     * @return the user associated with this message
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets the user associated with this message.
     * 
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets the message type of this message.
     * 
     * @return the message type
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Sets the message type of this message.
     * 
     * @param message the message type to set
     */
    public void setMessage(MessageType message) {
        this.message = message;
    }
}
