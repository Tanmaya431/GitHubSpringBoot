package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee implements Serializable {
	@Id
	@GeneratedValue
	public Integer eno;
	public String ename;
	public String eadd;
	public Float esalary;

}
