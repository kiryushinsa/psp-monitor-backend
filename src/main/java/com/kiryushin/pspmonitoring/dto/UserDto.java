package com.kiryushin.pspmonitoring.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kiryushin.pspmonitoring.entity.User;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto {
    private Long id;
    private String username;
    private String lastName;
    private String firstName;

    public User toUser(){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setLastName(lastName);
        user.setFirstName(firstName);

        return user;
    }

    public static UserDto fromUser(User user){
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
        userDto.setLastName(user.getLastName());
        userDto.setFirstName(user.getFirstName());

        return userDto;
    }

}
