package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Squad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")  // accept calls from web browser for this origin. Need for exclude an error of CORS policy
@RepositoryRestResource(collectionResourceRel = "squad", path = "squad")
public interface SquadRepository extends JpaRepository<Squad,Long> {
}
