package com.example.AutoGeniune.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.AutoGeniune.entity.Jobcard;

@Repository
public interface JobcardRopository extends CrudRepository<Jobcard, Long> {

}
