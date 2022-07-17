package com.example.AutoGeniune.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AutoGeniune.entity.Fault;
import com.example.AutoGeniune.entity.Jobcard;
import com.example.AutoGeniune.repository.JobcardRopository;

@Service
public class JobcardService {
@Autowired
JobcardRopository jobcardRepository;
	public Jobcard createJobcard(Jobcard jobcard) {
		// TODO Auto-generated method stub
		return jobcardRepository.save(jobcard);
	}
	public List<Jobcard> findAllJobcard() {
		// TODO Auto-generated method stub
		return (List<Jobcard>) jobcardRepository.findAll();
		
		
	}
	public Jobcard findJobcardByid(Long id) {
	Optional<Jobcard> opjobcard; 
	opjobcard=jobcardRepository.findById(id);
	return opjobcard.get();
	
	}
	public Jobcard editJobcard(Jobcard jobcard, Long id) {
		Optional<Jobcard> opjobcard=null;
		opjobcard=jobcardRepository.findById(id);
		Jobcard dbjobcard=opjobcard.get();
		dbjobcard.setCustomer_name(jobcard.getCustomer_name());
		dbjobcard.setVehical_num(jobcard.getVehical_num());	
		return jobcardRepository.save(dbjobcard);
	}
	public Jobcard deleteJobcardByid(Long id) {
		Optional<Jobcard>opjobcard=null;
		opjobcard=jobcardRepository.findById(id);
		Jobcard dbjobcard=opjobcard.get();
		jobcardRepository.delete(dbjobcard);
		return dbjobcard;
	}
	 
  
}
