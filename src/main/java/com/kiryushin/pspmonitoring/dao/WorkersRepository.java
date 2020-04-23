package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Workers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkersRepository extends JpaRepository<Workers,Long> {
}
