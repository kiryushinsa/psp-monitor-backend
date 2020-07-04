package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.CallsRepository;
import com.kiryushin.pspmonitoring.entity.Calls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallsService {

    @Autowired
    private final CallsRepository callsRepository;

    public CallsService(CallsRepository callsRepository) {
        this.callsRepository = callsRepository;
    }

    public void createCall(Calls calls){
        callsRepository.save(calls);
    }

    public void deleteById(Long id){
        callsRepository.deleteById(id);
    }

    public Calls updateCall(Long id, Calls call){
        call.setId(id);
        return callsRepository.save(call);
    }


}
