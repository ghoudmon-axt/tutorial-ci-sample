package org.ariadnext.tuto.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

/**
 * User controller.
 */
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    /** Inject service. */
    @Autowired
    private UserService service;

    /**
     * Return a specific user.
     * @param username username.
     * @return user.
     */
    @GetMapping("/users/{username}")
    public User getUser(@PathParam("username") final String username) {
        return service.getByUsername(username);
    }

    /**
     * Add/update an user.
     * @param user user.
     * @return savec user.
     */
    @PostMapping("/users/")
    public User updatePassword(@RequestBody final User user) {
        return service.save(user);
    }
}
