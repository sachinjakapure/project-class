package com.example.AutoGeniune.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fault {
	@Id
   private Long id;
   private String fanum;
	private String description;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFanum() {
		return fanum;
	}
	public void setFanum(String fanum) {
		this.fanum = fanum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
