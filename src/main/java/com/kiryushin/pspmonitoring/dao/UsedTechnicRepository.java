package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Technic;
import com.kiryushin.pspmonitoring.entity.UsedTechnic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "usedTechnic", path = "usedTechnic")
public interface UsedTechnicRepository extends JpaRepository<UsedTechnic,Long>
{
}

