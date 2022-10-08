package com.springboot.LMS_Backend;

import com.springboot.LMS_Backend.Service.EmailSenderServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class LearningManagementSystemApplication {

//	@Autowired
//	private EmailSenderServiceImplementation service;

	public static void main(String[] args) {

		SpringApplication.run(LearningManagementSystemApplication.class, args);
	}

//	@EventListener(ApplicationReadyEvent.class)
//	public void triggerMail(){
//
//
//	}

}
