package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.UsedTechnicRepository;
import com.kiryushin.pspmonitoring.entity.Technic;
import com.kiryushin.pspmonitoring.entity.UsedTechnic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsedTechnicService {


    private final UsedTechnicRepository usedTechnicRepository;

    public UsedTechnicService(UsedTechnicRepository usedTechnicRepository) {
        this.usedTechnicRepository = usedTechnicRepository;
    }

    public void createUsedTechnic(UsedTechnic usedTechnic){

        usedTechnicRepository.save(usedTechnic);
    }

    public void deleteById(Long id){

        usedTechnicRepository.deleteById(id);
    }

    public UsedTechnic updateUsedTechnic(Long id, UsedTechnic usedTechnic){
        usedTechnic.setId(id);
        return usedTechnicRepository.save(usedTechnic);
    }
}
