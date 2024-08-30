package com.survey.survey.auth.infrastructure.adapters;

import java.util.List;

import org.springframework.stereotype.Service;

import com.survey.survey.auth.domain.models.Role;
import com.survey.survey.auth.domain.models.User;
import com.survey.survey.auth.infrastructure.entities.AuthResponse;
import com.survey.survey.auth.infrastructure.entities.LoginRequest;
import com.survey.survey.auth.infrastructure.entities.RegisterRequest;

import com.survey.survey.auth.infrastructure.adapters.RoleAdapter;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthAdapter {

    public AuthResponse login(LoginRequest request) {
        return null;
    }

    public AuthResponse register(RegisterRequest request) {

        List<Role> userRoles = RoleAdapter.

        User user = User.builder()
            .username(request.getUsername())
            .password(request.getPassword())
            .roles(null)
            
    }

}
