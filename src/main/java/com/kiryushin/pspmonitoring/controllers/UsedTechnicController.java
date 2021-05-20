package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.entity.Technic;
import com.kiryushin.pspmonitoring.entity.UsedTechnic;
import com.kiryushin.pspmonitoring.services.TechnicService;
import com.kiryushin.pspmonitoring.services.UsedTechnicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
public class UsedTechnicController {
    @Autowired
    private UsedTechnicService usedTechnicService;

    @PostMapping("/usedTechnic")
    ResponseEntity<Void> createUsedTechnic(@RequestBody UsedTechnic usedTechnic){
        usedTechnicService.createUsedTechnic(usedTechnic);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/usedTechnic/{id}")
    ResponseEntity<Void> deleteUseTechnic(@PathVariable Long id) {
        usedTechnicService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/usedTechnic/{id}")
    public UsedTechnic update(@PathVariable("id") Long id, @RequestBody UsedTechnic usedTechnic ){
        return usedTechnicService.updateUsedTechnic(id,usedTechnic);
    }
}
