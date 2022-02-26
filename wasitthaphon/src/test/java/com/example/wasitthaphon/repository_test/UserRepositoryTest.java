package com.example.wasitthaphon.repository_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import com.example.wasitthaphon.models.User;
import com.example.wasitthaphon.repositories.UserRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void Find_By_Id_Success() {

        // Arrange
        User user = new User();
        user.setUserId(1);
        user.setName("Ramee");
        userRepository.save(user);

        // Act
        Optional<User> result = userRepository.findById(1);

        // Assssert
        assertEquals(1, result.get().getUserId());

    }
}
