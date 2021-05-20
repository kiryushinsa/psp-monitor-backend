package com.kiryushin.pspmonitoring.services;

import com.kiryushin.pspmonitoring.dao.WorkersRepository;
import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.entity.Workers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkersService {

    @Autowired
    private final WorkersRepository workersRepository;

    public WorkersService(WorkersRepository workersRepository) {
        this.workersRepository = workersRepository;
    }

    public void createWorker(Workers worker){
        workersRepository.save(worker);
    }

    public void deleteById(Long id){
        workersRepository.deleteById(id);
    }

    public Workers updateWorker(Long id, Workers worker){
        worker.setId(id);
        return workersRepository.save(worker);
    }



}
