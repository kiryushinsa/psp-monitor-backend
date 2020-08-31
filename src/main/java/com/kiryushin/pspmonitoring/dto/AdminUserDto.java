package com.kiryushin.pspmonitoring.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.kiryushin.pspmonitoring.entity.Status;
import com.kiryushin.pspmonitoring.entity.User;
import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdminUserDto {
    private Long id;
    private String username;
    private String lastName;
    private String firstName;
    private String status;

    public User toUser(){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setLastName(lastName);
        user.setFirstName(firstName);
        user.setStatus(Status.valueOf(status));

        return user;
    }

    public static AdminUserDto fromUser(User user){
        AdminUserDto adminUserDto = new AdminUserDto();
        adminUserDto.setId(user.getId());
        adminUserDto.setUsername(user.getUsername());
        adminUserDto.setLastName(user.getLastName());
        adminUserDto.setFirstName(user.getFirstName());
        adminUserDto.setStatus(user.getStatus().name());

       return adminUserDto;
    }
}
