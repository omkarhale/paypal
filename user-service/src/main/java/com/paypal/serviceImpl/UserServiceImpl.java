package com.paypal.serviceImpl;

import com.paypal.entity.User;
import com.paypal.service.UserService;
import com.paypal.userRepo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepo userRepository;

    public UserServiceImpl(UserRepo userRepository){this.userRepository = userRepository;}



    @Override
    public User createUser(User user) {
        return (User) userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
