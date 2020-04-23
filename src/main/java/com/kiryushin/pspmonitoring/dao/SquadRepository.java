package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Squad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface SquadRepository extends JpaRepository<Squad,Long> {
}
