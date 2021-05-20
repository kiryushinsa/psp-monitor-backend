package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Technic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "technic", path = "technic")
public interface TechnicRepository extends JpaRepository<Technic,Long> {
}
