package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.CallsRepository;
import com.kiryushin.pspmonitoring.entity.Calls;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CallsService {

    private CallsRepository callsRepository;

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
