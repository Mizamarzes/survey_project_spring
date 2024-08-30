package com.survey.survey.auth.infrastructure.adapters;

import org.springframework.stereotype.Service;

import com.survey.survey.auth.infrastructure.entities.AuthResponse;
import com.survey.survey.auth.infrastructure.entities.LoginRequest;
import com.survey.survey.auth.infrastructure.entities.RegisterRequest;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthAdapter {

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {

        // List<Role> userRoles = RoleAdapter.

        // User user = User.builder()
        //     .username(request.getUsername())
        //     .password(request.getPassword())
        //     .roles(null)
        return null;
    }

}
