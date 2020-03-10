package org.ariadnext.tuto.ci;

/** User bean. */
public class User {

    /** username. */
    private String username;

    /** password. */
    private String password;

    /**
     * Get username.
     * @return username.
     */
    public String getUsername() {
        return username;
    }

    /**
     * Set username.
     * @param newUsername username.
     */
    public void setUsername(final String newUsername) {
        this.username = newUsername;
    }

    /**
     * Get password.
     * @return password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Set password.
     * @param newPassword password.
     */
    public void setPassword(final String newPassword) {
        this.password = newPassword;
    }
}
