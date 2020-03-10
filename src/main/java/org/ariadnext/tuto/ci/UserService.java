package org.ariadnext.tuto.ci;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * User service.
 */
@Component
public class UserService {

    /** user cache map. */
    private Map<String, User> users = new HashMap<>();

    /**
     * Get user by username.
     * @param username username.
     * @return user.
     */
    public User getByUsername(final String username) {
        return users.get(username);
    }

    /**
     * Save user.
     * @param user user to save.
     * @return saved user.
     */
    public User save(final User user) {
        user.setPassword(new Digest().digest(user.getPassword()));
        users.put(user.getUsername(), user);
        return user;
    }
}
