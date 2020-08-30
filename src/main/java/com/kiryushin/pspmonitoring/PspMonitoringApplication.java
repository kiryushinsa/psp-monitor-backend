package com.kiryushin.pspmonitoring;

import com.kiryushin.pspmonitoring.entity.Calls;
import com.kiryushin.pspmonitoring.services.CallsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class PspMonitoringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PspMonitoringApplication.class, args);
	}



}
