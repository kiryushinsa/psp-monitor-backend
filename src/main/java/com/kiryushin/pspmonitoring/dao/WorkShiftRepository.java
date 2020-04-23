package com.kiryushin.pspmonitoring.dao;

import com.kiryushin.pspmonitoring.entity.WorkShift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkShiftRepository extends JpaRepository<WorkShift, Long> {
}
