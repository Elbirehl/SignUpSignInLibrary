package logicalModel.model;

import java.io.Serializable;

/**
 * The User class represents a user with various attributes like email, password, 
 * name, address details, and activation status. It is used for user management 
 * and authentication.
 * 
 * @author Meylin, Elbire, Olaia and Irati
 */
public class User implements Serializable {
    private String email;
    private String passwd;
    private String name;
    private String street;
    private int mobile;
    private String city;
    private int zip;
    private boolean active;

    /**
     * Default constructor for creating an empty User instance.
     */
    public User() {
    }

    /**
     * Constructs a User with the specified details.
     * 
     * @param email the email of the user
     * @param passwd the password of the user
     * @param name the name of the user
     * @param street the street address of the user
     * @param mobile the mobile number of the user
     * @param city the city of the user
     * @param zip the zip code of the user's address
     * @param active the activation status of the user
     */
    public User(String email, String passwd, String name, String street, int mobile, String city, int zip, boolean active) {
        this.email = email;
        this.passwd = passwd;
        this.name = name;
        this.street = street;
        this.mobile = mobile;
        this.city = city;
        this.zip = zip;
        this.active = active;
    }

    /**
     * Constructs a User with the specified email and password.
     * 
     * @param email the email of the user
     * @param passwd the password of the user
     */
    public User(String email, String passwd) {
        this.email = email;
        this.passwd = passwd;
    }

    /**
     * Gets the email of the user.
     * 
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email of the user.
     * 
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the password of the user.
     * 
     * @return the user's password
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * Sets the password of the user.
     * 
     * @param passwd the password to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * Gets the name of the user.
     * 
     * @return the user's name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     * 
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the street address of the user.
     * 
     * @return the user's street address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street address of the user.
     * 
     * @param street the street address to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the mobile number of the user.
     * 
     * @return the user's mobile number
     */
    public int getMobile() {
        return mobile;
    }

    /**
     * Sets the mobile number of the user.
     * 
     * @param mobile the mobile number to set
     */
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    /**
     * Gets the city of the user.
     * 
     * @return the user's city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the user.
     * 
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the zip code of the user's address.
     * 
     * @return the user's zip code
     */
    public int getZip() {
        return zip;
    }

    /**
     * Sets the zip code of the user's address.
     * 
     * @param zip the zip code to set
     */
    public void setZip(int zip) {
        this.zip = zip;
    }

    /**
     * Checks if the user is active.
     * 
     * @return true if the user is active, false otherwise
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets the activation status of the user.
     * 
     * @param active the activation status to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }
}
