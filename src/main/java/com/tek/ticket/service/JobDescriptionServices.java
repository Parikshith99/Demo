package com.tek.ticket.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tek.ticket.Exception.CannotSaveDataException;
import com.tek.ticket.Exception.ResourceNotFoundException;
import com.tek.ticket.dto.JobDescriptionDto;
import com.tek.ticket.entities.JobDescription;
import com.tek.ticket.repository.JobDescriptionRepository;

@Service
public class JobDescriptionServices {
	
	@Autowired
	private JobDescriptionRepository jobDescriptionRepository;

	
	@Autowired
	private ModelMapper modelMapper;
	
	public JobDescriptionDto addJobDescription(JobDescriptionDto jobdescriptionDto) {
		JobDescription jobdescription = this.dtoToJob(jobdescriptionDto);
		JobDescription jobdesc=null;
		try {

			 jobdesc = jobDescriptionRepository.save(jobdescription);
		}catch (CannotSaveDataException e) {
			throw new CannotSaveDataException("Data cannot be saved");
		}
		
		return this.jobToDto(jobdesc);
	}
	
	public List<JobDescriptionDto> getAllJobDescription() {
		List<JobDescriptionDto> jobDescriptionDtos=null;
		try {
			List<JobDescription> allJobDesc = jobDescriptionRepository.findAll();
			 jobDescriptionDtos = allJobDesc.stream().map(jobDescription -> this.jobToDto(jobDescription)).collect(Collectors.toList());
		}catch (ResourceNotFoundException e) {
			throw new ResourceNotFoundException("Data Not Found");
		}
		return jobDescriptionDtos;
	}
	
	public JobDescription dtoToJob(JobDescriptionDto jobDescriptionDto) {
		JobDescription jobDescription = this.modelMapper.map(jobDescriptionDto, JobDescription.class);
		return jobDescription;
	}
	
	public JobDescriptionDto jobToDto(JobDescription jobDescription) {
		JobDescriptionDto jobDescriptionDto = this.modelMapper.map(jobDescription, JobDescriptionDto.class);
		return jobDescriptionDto;
	}
	
	
}
