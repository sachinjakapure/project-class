package com.example.AutoGeniune.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AutoGeniune.entity.Fault;
import com.example.AutoGeniune.repository.FaultRepository;

@Service
public class FaultService {
@Autowired
FaultRepository faultRepository;
	public  Fault createFault(Fault fault) {
	
		return faultRepository.save(fault);
	}
	public List<Fault> getFaults() {
	
		return faultRepository.findAll();
	}
	public Fault findfaultById(Long id) {
		Optional<Fault> opFault=null;
		opFault= faultRepository.findById(id) ;
		return opFault.get();
	}
	public Fault editFault(Fault fault, Long id) {
		Optional<Fault> opFault=null;
		opFault=faultRepository.findById(id);
		Fault dbFault=opFault.get();
		dbFault.setDescription(fault.getDescription());
		dbFault.setFanum(fault.getFanum());
		return faultRepository.save(dbFault);
	}
	
	public Fault deleteFault(Long id) {
		Optional<Fault> opfault=null;
		opfault=faultRepository.findById(id);
		Fault dbfault=opfault.get();
		faultRepository.delete(dbfault);
		return dbfault;
	}

}
