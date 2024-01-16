package com.example.TaskManager.models.user;

import com.example.TaskManager.models.user.User;
import com.example.TaskManager.models.user.UserDTO;
import com.example.TaskManager.models.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(UserDTO dto) {
        return userRepository.save(User.builder()
            .name(dto.getName())
            .email(dto.getEmail())
            .password(dto.getPassword())
            .build());
    }

    public Iterable<User> readAll() {
        return userRepository.findAll();
    }

    public User readById(long id) {
        return userRepository.findById(id).orElseThrow(() -> {
            throw new RuntimeException("not this id ");
        });
    }

    public User updateName(long id, String value) {
        var res = readById(id);
        res.setName(value);
        return res;
    }
}
