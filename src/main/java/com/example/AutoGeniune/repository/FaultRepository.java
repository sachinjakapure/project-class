package com.example.AutoGeniune.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AutoGeniune.entity.Fault;

@Repository
public interface FaultRepository extends JpaRepository<Fault, Long>  {

}
