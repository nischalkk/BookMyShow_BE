package dev.project.bookShow.service;

import dev.project.bookShow.exception.UserNotFoundException;
import dev.project.bookShow.model.User;
import dev.project.bookShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id " + id + " is not found")
        );
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
