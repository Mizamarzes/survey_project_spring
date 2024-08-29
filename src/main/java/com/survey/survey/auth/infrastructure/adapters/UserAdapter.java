package com.survey.survey.auth.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.auth.application.services.IUserService;
import com.survey.survey.auth.domain.entities.User;
import com.survey.survey.auth.infrastructure.repositories.UserRepository;

@Service
public class UserAdapter implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAll(){
        return userRepository.findAll();
    }

    @Override
    public User save(User user){
        return userRepository.save(user);
    }

}
