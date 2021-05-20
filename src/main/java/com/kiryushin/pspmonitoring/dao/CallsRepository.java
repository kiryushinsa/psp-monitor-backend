package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.services.CallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin("http://localhost:4200")  // accept calls from web browser for this origin. Need for exclude an error of CORS policy
@RepositoryRestResource(collectionResourceRel = "call", path = "calls") //renamed default json name and link
public interface CallsRepository extends JpaRepository<Calls,Long> {



}
