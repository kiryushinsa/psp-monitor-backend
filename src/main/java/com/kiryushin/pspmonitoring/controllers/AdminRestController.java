package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.dto.AdminUserDto;
import com.kiryushin.pspmonitoring.entity.User;
import com.kiryushin.pspmonitoring.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping(value = "/api/admin/")
public class AdminRestController {


    private final UserService userService;

    public AdminRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "users/{id}")
    public ResponseEntity<AdminUserDto> getUserById(@PathVariable(name = "id") Long id){
        User user = userService.findById(id);

        if(user== null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        AdminUserDto result = AdminUserDto.fromUser(user);

        return new ResponseEntity<>(result,HttpStatus.OK);
    }
}
