package com.kiryushin.pspmonitoring.security.jwt;

import com.kiryushin.pspmonitoring.entity.Role;
import com.kiryushin.pspmonitoring.entity.Status;
import com.kiryushin.pspmonitoring.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    public JwtUserFactory(){

    }

    public static JwtUser create(User user){
        return new JwtUser(
                user.getId(),
                user.getUsername(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getPassword(),
                mapToGrantedAuthorities(new ArrayList<>(user.getRoles())),
                user.getStatus().equals(Status.ACTIVE),
                user.getUpdated()
                );

    }

    private static List<GrantedAuthority> mapToGrantedAuthorities (List<Role> userRoles){
        return userRoles.stream()
                .map(role ->
                    new SimpleGrantedAuthority(role.getName())
                ).collect(Collectors.toList()); //проходим по списку ролес и конвертиурем в элементы коллекции
    }
}
