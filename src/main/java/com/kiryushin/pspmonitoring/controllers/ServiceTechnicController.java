package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.entity.ServiceTechnic;
import com.kiryushin.pspmonitoring.services.CallsService;
import com.kiryushin.pspmonitoring.services.ServiceTechnicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
public class ServiceTechnicController {
    @Autowired
    private ServiceTechnicService serviceTechnicService;


    @PostMapping("/service")
    ResponseEntity<Void> createService(@RequestBody ServiceTechnic serviceTechnic){
        serviceTechnicService.createService(serviceTechnic);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/service/{id}")
    ResponseEntity<Void> deleteService(@PathVariable Long id) {

        serviceTechnicService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/service/{id}")
    public ServiceTechnic update(@PathVariable("id") Long id, @RequestBody ServiceTechnic serviceTechnic ){
        return serviceTechnicService.updateCall(id,serviceTechnic);
    }
}
