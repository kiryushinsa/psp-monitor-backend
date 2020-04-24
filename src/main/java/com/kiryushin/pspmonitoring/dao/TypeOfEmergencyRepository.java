package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.TypeOfEmergency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "typeOfEmergency",path="typesOfEmergencies")
public interface TypeOfEmergencyRepository extends JpaRepository<TypeOfEmergency,Long> {
}
