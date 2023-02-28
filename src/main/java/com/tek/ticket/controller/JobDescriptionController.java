package com.tek.ticket.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.ticket.dto.JobDescriptionDto;
import com.tek.ticket.service.JobDescriptionServices;

@RestController
@RequestMapping("/api/jobs")
@CrossOrigin
public class JobDescriptionController {
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Autowired
	private JobDescriptionServices jobDescriptionService;

	@PostMapping(value = "/addJobDescription")
	public ResponseEntity<JobDescriptionDto> addCandidatesfile(@RequestBody JobDescriptionDto JobdescriptionDto) {
		JobDescriptionDto JobDesc = jobDescriptionService.addJobDescription(JobdescriptionDto);
		System.out.println("Hello");
		return new ResponseEntity<JobDescriptionDto>(JobDesc, HttpStatus.OK);
	}

	@GetMapping(value = "/getAllJobDescription")
	public ResponseEntity<List<JobDescriptionDto>> getJobDescription() {
		List<JobDescriptionDto> allJobDescription = jobDescriptionService.getAllJobDescription();

		return new ResponseEntity<List<JobDescriptionDto>>(allJobDescription, HttpStatus.OK);
	}
	
	 @GetMapping("/gitinfo")
	    public ResponseEntity<Map<String, Object>> getGitInfo() throws IOException {
	ClassPathResource classPathResource = new ClassPathResource("git.properties");
	        Properties properties = new Properties();
	        properties.load(classPathResource.getInputStream());
	        Map<String, Object> gitInfo = new HashMap<>();
	        gitInfo.put("branch", properties.getProperty("git.branch"));
	        gitInfo.put("commitId", properties.getProperty("git.commit.id"));
	        gitInfo.put("commitTime", properties.getProperty("git.commit.time"));
	        return ResponseEntity.ok(gitInfo);
	    }
}
