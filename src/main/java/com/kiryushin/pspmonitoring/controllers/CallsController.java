package com.kiryushin.pspmonitoring.controllers;

import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.services.CallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/add")
public class CallsController {

    @Autowired
    private CallsService callsService;


    @PostMapping("/calls")
    ResponseEntity<Void> createUser(@RequestBody Calls call){
        callsService.createCall(call);
        return ResponseEntity.ok().build();
    }
    @DeleteMapping("/calls/{id}")
    ResponseEntity<Void> deleteCalls(@PathVariable Long id) {

        callsService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/calls/{id}")
    public Calls update(@PathVariable("id") Long id, @RequestBody Calls call ){
        return callsService.updateCall(id,call);
    }
}
