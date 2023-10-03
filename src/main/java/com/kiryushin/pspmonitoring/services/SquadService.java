package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.SquadRepository;
import com.kiryushin.pspmonitoring.entity.Squad;
import com.kiryushin.pspmonitoring.entity.Technic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SquadService {

    private final SquadRepository squadRepository;


    public SquadService(SquadRepository squadRepository) {
        this.squadRepository = squadRepository;
    }

    public void  createSquad(Squad squad){
        squadRepository.save(squad);
    }

    public void deleteById(Long id){
        squadRepository.deleteById(id);
    }

    public Squad updateSquad(Long id, Squad squad){
        squad.setId(id);
        return squadRepository.save(squad);
    }

}
