package org.ariadnext.tuto.ci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UserServiceTest {


    @Test
    @DisplayName("Test save service")
    void testSave() {
        // Given new user name/secret
        User newUser = new User();
        newUser.setUsername(UUID.randomUUID().toString());
        newUser.setPassword(UUID.randomUUID().toString());
        // when saved it
        UserService service = new UserService();
        User saved = service.save(newUser);
        // then shall not be null
        Assertions.assertNotNull(saved);
        Assertions.assertEquals(newUser.getUsername(), saved.getUsername());
    }

    @Test
    @DisplayName("Test get service return null if unknown")
    void testGetUnknown() {
        // Given an unknown username
        String username = "unknown";
        // When ask an user with this username
        UserService service = new UserService();
        User existing = service.getByUsername(username);
        // Then expected null
        Assertions.assertNull(existing);
    }

    @Test
    @DisplayName("Test get service return good user")
    void testGetUser() {
        // Given an existing user
        User saved = new User();
        saved.setUsername(UUID.randomUUID().toString());
        saved.setPassword(UUID.randomUUID().toString());
        UserService service = new UserService();
        service.save(saved);
        // When ask a user with this username
        User read = service.getByUsername(saved.getUsername());
        // Then expected retrieve saved user
        Assertions.assertNotNull(read);
        Assertions.assertEquals(saved.getUsername(), read.getUsername());
    }
}
