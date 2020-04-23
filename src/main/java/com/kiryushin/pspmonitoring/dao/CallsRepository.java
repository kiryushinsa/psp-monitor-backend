package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.Calls;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CallsRepository extends JpaRepository<Calls,Long> {
}
