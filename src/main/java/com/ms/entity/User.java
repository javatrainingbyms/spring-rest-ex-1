package com.ms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user")
public class User {
	@Id
	@Column(name="user_id")
	private String userId;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="name")
	private String name;
	@Column(name="mobile")
	private String mobile;
	@Column(name="user_type")
	private String userType;
	@OneToMany(mappedBy="user")
	private List<Ticket> tickets;	
	@OneToMany(mappedBy="user")
	private List<Solution> solutions;
	public User(String userId, String password, String name, String email, String mobile, String userType) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.userType = userType;
	}	
	
	
	
	
	
	
}
