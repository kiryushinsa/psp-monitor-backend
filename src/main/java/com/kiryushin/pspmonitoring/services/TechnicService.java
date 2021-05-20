package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.TechnicRepository;
import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.entity.Technic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicService {
    @Autowired
    private final TechnicRepository technicRepository;

    public TechnicService(TechnicRepository technicRepository) {
        this.technicRepository = technicRepository;
    }

    public void createTechnic(Technic technic){
        technicRepository.save(technic);
    }

    public void deleteById(Long id){
        technicRepository.deleteById(id);
    }

    public Technic updateTechnic(Long id, Technic technic){
        technic.setId(id);
        return technicRepository.save(technic);
    }
}
