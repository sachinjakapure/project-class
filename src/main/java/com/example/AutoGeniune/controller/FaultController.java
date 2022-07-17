package com.example.AutoGeniune.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.AutoGeniune.entity.Fault;
import com.example.AutoGeniune.service.FaultService;

@RestController
public class FaultController {
	@Autowired
	FaultService faultservice;
    @PostMapping("api/fault")
	public Fault createFault(@RequestBody Fault fault) {
		return faultservice.createFault(fault);
	}
    @GetMapping("api/fault")
    public List<Fault> getAllFaults() {
    	return faultservice.getFaults();
    }
    @GetMapping("api/fault/{id}")
    public Fault findFaultById(@PathVariable Long id) {
    	return faultservice.findfaultById(id);
    }
    @PutMapping("api/fault")
    public Fault editFault(@RequestBody Fault fault,@RequestParam Long id) {
    	return faultservice.editFault(fault,id);
    }
    @DeleteMapping("api/fault")
    public Fault deleteFault(@RequestParam Long id) {
    	return faultservice.deleteFault(id);
    }
}
