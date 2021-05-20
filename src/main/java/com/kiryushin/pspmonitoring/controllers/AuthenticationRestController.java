package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.dto.AuthenticationRequestDto;
import com.kiryushin.pspmonitoring.entity.User;
import com.kiryushin.pspmonitoring.security.jwt.JwtTokenProvider;
import com.kiryushin.pspmonitoring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import org.springframework.security.core.AuthenticationException;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/api/auth/")
public class AuthenticationRestController {

    private final AuthenticationManager authenticationManager;

    private final JwtTokenProvider jwtTokenProvider;

    private final UserService userService;

    @Autowired
    public AuthenticationRestController(AuthenticationManager authenticationManager,
                                        JwtTokenProvider jwtTokenProvider,
                                        UserService userService) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.userService = userService;
    }

    @PostMapping("login")
    public ResponseEntity login(@RequestBody AuthenticationRequestDto requestDto){
        try {
            String username = requestDto.getUsername();
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,
                    requestDto.getPassword())); // На основании пароляи и логина дать аутентификацию

            User user = userService.findByUsername(username);

            if(user == null){
                throw new UsernameNotFoundException("User with username: " + username + "notfound");
            }

            String token = jwtTokenProvider.createToken(username, user.getRoles());

            Map<Object, Object> response = new HashMap<>();
            response.put ("username",username);
            response.put("token", token);
            return ResponseEntity.ok(response);

        }catch (AuthenticationException e){
            throw new BadCredentialsException("Invalid USername");
        }

    }
}
