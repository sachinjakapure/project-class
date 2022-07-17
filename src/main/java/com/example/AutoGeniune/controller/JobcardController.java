package com.example.AutoGeniune.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AutoGeniune.entity.Jobcard;
import com.example.AutoGeniune.service.JobcardService;

@RestController
public class JobcardController {
	@Autowired // dependency injection
	JobcardService jobcardService;

	@PostMapping("/jobcard")
	public Jobcard createJobcard(@RequestBody Jobcard jobcard) {

		return jobcardService.createJobcard(jobcard);

	}
	@GetMapping("/jobcard")
	public  List<Jobcard> findAllJobcard() {
		return  jobcardService.findAllJobcard();
	}
	@GetMapping("/api/jobcard/{id}")
	public Jobcard findJobcardByid(@PathVariable Long id) {
		return jobcardService.findJobcardByid(id);
	}
	@PutMapping("/api/jobcard")
	public Jobcard editJobcard(@RequestBody Jobcard jobcard,@RequestParam Long id) {
		return jobcardService.editJobcard(jobcard,id); 
	}
	@DeleteMapping("/api/jobcard")
	public Jobcard deleteJobcard(@RequestParam Long id) {
		return jobcardService.deleteJobcardByid(id);
	}
	
}
