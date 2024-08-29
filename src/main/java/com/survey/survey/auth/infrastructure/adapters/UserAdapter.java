package com.survey.survey.auth.infrastructure.adapters;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey.survey.auth.application.services.IUserService;
import com.survey.survey.auth.domain.entities.User;
import com.survey.survey.auth.infrastructure.repositories.UserRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional(rollbackOn = Exception.class)
@RequiredArgsConstructor
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
