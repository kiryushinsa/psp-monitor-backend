package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.ServiceTechnicRepository;
import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.entity.ServiceTechnic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTechnicService {

    private final ServiceTechnicRepository serviceTechnicRepository;

    public ServiceTechnicService(ServiceTechnicRepository serviceTechnicRepository) {
        this.serviceTechnicRepository = serviceTechnicRepository;
    }


    public void createService(ServiceTechnic serviceTechnic){
        serviceTechnicRepository.save(serviceTechnic);
    }

    public void deleteById(Long id){
        serviceTechnicRepository.deleteById(id);
    }

    public ServiceTechnic updateCall(Long id, ServiceTechnic serviceTechnic){
        serviceTechnic.setId(id);
        return serviceTechnicRepository.save(serviceTechnic);
    }

}
