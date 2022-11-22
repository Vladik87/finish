package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.model.entity.User;
import com.example.demo.model.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

//   BCryptPasswordEncoder bCryptPasswordEncoder;

    public User findUserById(Integer id) {
        Optional<User> userFromBd = userRepository.findById(id);
        return userFromBd.orElse(new User());
    }

    public List<User> allUser() {
        return userRepository.findAll();
    }

    @Override
    public void save(UserDto userDto) {
        var user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        userRepository.save(user);
    }
}

