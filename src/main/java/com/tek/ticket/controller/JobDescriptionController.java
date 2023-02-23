package com.tek.ticket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.ticket.dto.JobDescriptionDto;
import com.tek.ticket.entities.JobDescription;
import com.tek.ticket.service.JobDescriptionServices;



@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobDescriptionController {

	
	@Autowired
	private JobDescriptionServices jobDescriptionService;
	
	@PostMapping(value = "/addJobDescription")
	public ResponseEntity<JobDescriptionDto> addCandidatesfile(@RequestBody JobDescriptionDto JobdescriptionDto)  {
		 JobDescriptionDto JobDesc = jobDescriptionService.addJobDescription(JobdescriptionDto);
System.out.println("Hello");
		return new ResponseEntity<JobDescriptionDto>(JobDesc, HttpStatus.OK);
	}
	
	@GetMapping(value = "/getAllJobDescription")
	public ResponseEntity<List<JobDescriptionDto>> getJobDescription()  {
	List<JobDescriptionDto> allJobDescription = jobDescriptionService.getAllJobDescription();

		return new ResponseEntity<List<JobDescriptionDto>>(allJobDescription, HttpStatus.OK);
	}
}
