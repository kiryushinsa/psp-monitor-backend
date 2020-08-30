package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
