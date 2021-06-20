package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="USERSLIST")
@Data
public class User {
	
	@Id
	public String username;
	public String password;

}
