package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.entity.Squad;
import com.kiryushin.pspmonitoring.services.CallsService;
import com.kiryushin.pspmonitoring.services.SquadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
public class SquadController {
    @Autowired
    private SquadService squadService;


    @PostMapping("/squad")
    ResponseEntity<Void> createSquad(@RequestBody Squad squad){
        squadService.createSquad(squad);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/squad/{id}")
    ResponseEntity<Void> deleteSquad(@PathVariable Long id) {

        squadService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/squad/{id}")
    public Squad update(@PathVariable("id") Long id, @RequestBody Squad squad ){
        return squadService.updateSquad(id,squad);
    }
}
