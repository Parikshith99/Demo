package com.tek.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tek.ticket.entities.JobDescription;

@Repository
public interface JobDescriptionRepository extends JpaRepository<JobDescription, Integer> {
	

}

