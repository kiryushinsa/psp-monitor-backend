package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.entity.Technic;
import com.kiryushin.pspmonitoring.services.TechnicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
public class TechnicController {

    private final TechnicService technicService;

    @Autowired
    public TechnicController(TechnicService technicService) {
        this.technicService = technicService;
    }

    @PostMapping("/technic")
    ResponseEntity<Void> createTechnic(@RequestBody Technic technic){
        technicService.createTechnic(technic);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/technic/{id}")
    ResponseEntity<Void> deleteTechnic(@PathVariable Long id) {
        technicService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/technic/{id}")
    public Technic update(@PathVariable("id") Long id, @RequestBody Technic technic ){
        return technicService.updateTechnic(id,technic);
    }
}
