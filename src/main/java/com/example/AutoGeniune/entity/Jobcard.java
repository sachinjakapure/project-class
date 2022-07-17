package com.example.AutoGeniune.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Jobcard {
	@Id
   Long id;
   String customer_name;
   String vehical_num;
   String jc_Number;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public String getVehical_num() {
	return vehical_num;
}
public void setVehical_num(String vehical_num) {
	this.vehical_num = vehical_num;
}
public String getJc_Number() {
	return jc_Number;
}
public void setJc_Number(String jc_Number) {
	this.jc_Number = jc_Number;
}
   
}
