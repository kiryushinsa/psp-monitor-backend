package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.entity.Workers;
import com.kiryushin.pspmonitoring.services.WorkersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class WorkersController {

    @Autowired
    private WorkersService workersService;

    @PostMapping("/workers")
    ResponseEntity<Void> createWorker(@RequestBody Workers worker){
        workersService.createWorker(worker);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/workers/{id}")
    ResponseEntity<Void> deleteWorker(@PathVariable Long id) {

        workersService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/workers/{id}")
    public Workers update(@PathVariable("id") Long id, @RequestBody Workers worker ){
        return workersService.updateWorker(id,worker);
    }

}
