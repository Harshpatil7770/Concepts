package com.concept.designpattern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class StudentServiceImpl {

	@Autowired
	CollegeServiceImpl collegeService;
	
	@Autowired
	CollegeServiceImpl collegeService2;
	
	
	@EventListener(ApplicationReadyEvent.class)
	public void compareInstanceReference() {
		
		/**
		 * Spring boot by default provide singleton design pattern
		 */
		
		if(collegeService==collegeService2) {
			log.info("both reference of object are equal");
		}
	}
}
