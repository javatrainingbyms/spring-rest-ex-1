package com.ms.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="solution")
public class Solution {
	@Id
	@Column(name="solution_code")
	private String scode;
	@Column(name="solution_text")
	private String text;
	@Column(name="solution_date")
	private Date date;
	
	@OneToOne
	@JoinColumn(name="ticket_code")
	private Ticket ticket;	//ticket_tcode
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;	//userid
}
