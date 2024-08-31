package com.survey.survey.auth.infrastructure.adapters;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.survey.survey.auth.domain.models.Role;
import com.survey.survey.auth.domain.models.User;
import com.survey.survey.auth.infrastructure.Jwt.JwtService;
import com.survey.survey.auth.infrastructure.entities.AuthResponse;
import com.survey.survey.auth.infrastructure.entities.LoginRequest;
import com.survey.survey.auth.infrastructure.entities.RegisterRequest;
import com.survey.survey.auth.infrastructure.repositories.RoleRepository;
import com.survey.survey.auth.infrastructure.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthAdapter {

    private final RoleRepository roleRepository;
    private final UserRepository userRepository; // Repositorio para guardar el usuario
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public AuthResponse login(LoginRequest request) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        UserDetails user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token = jwtService.getToken(user);
        return AuthResponse.builder()
                .token(token)
                .build();
    }

    public AuthResponse register(RegisterRequest request) {

        List<Role> roles = request.getRoles().stream()
                .map(roleName -> roleRepository.findByName(roleName)
                        .orElseThrow(() -> new RuntimeException("Role not found: " + roleName)))
                .collect(Collectors.toList());


        User user = User.builder()
                .username(request.getUsername())
                .password(passwordEncoder.encode( request.getPassword())) // Deberías encriptar el password aquí
                .roles(roles) // Asignar la lista de roles
                .enabled(true) // Si es necesario habilitar el usuario por defecto
                .build();

        userRepository.save(user);

        return AuthResponse.builder()
            .token(jwtService.getToken(user))
            .build();

    }

}
