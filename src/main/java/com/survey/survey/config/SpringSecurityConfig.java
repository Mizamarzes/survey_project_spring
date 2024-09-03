package com.survey.survey.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.survey.survey.auth.infrastructure.Jwt.JwtAuthenticationFilter;


import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SpringSecurityConfig {

    private final JwtAuthenticationFilter jwtAuthenticationFilter;
    private final AuthenticationProvider authProvider;

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .cors(cors -> cors
                    .configurationSource(request -> {
                        var corsConfiguration = new org.springframework.web.cors.CorsConfiguration();
                        corsConfiguration.addAllowedOrigin("http://localhost:5173");
                        corsConfiguration.addAllowedMethod("*");
                        corsConfiguration.addAllowedHeader("*");
                        corsConfiguration.setAllowCredentials(true);
                        return corsConfiguration;
                    })
                )
                .csrf(csrf -> csrf.disable()) // Deshabilitar CSRF para aplicaciones sin estado (stateless)
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                .authorizeHttpRequests(authz -> authz
                    .requestMatchers("/auth/**").permitAll() // Permitir acceso a /auth/** sin autenticación
                    .requestMatchers("/survey/**").authenticated() // Requiere autenticación para /survey/**
                    .anyRequest().authenticated()) // Autenticar cualquier otra solicitud
                .authenticationProvider(authProvider)
                .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class)
                .build();
    }
}
