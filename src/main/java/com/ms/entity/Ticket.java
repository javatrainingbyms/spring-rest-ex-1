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
@Table(name="ticket")
public class Ticket {
	@Id
	@Column(name="ticket_code")
	private int tcode;
	@Column(name="ticket_text")
	private String text;
	@Column(name="raise_date")
	private Date raiseDate;
	@OneToOne (mappedBy = "ticket")
	private Solution solution;	
	@ManyToOne
	@JoinColumn(name="sc_code")
	private SubCategory subCategory;	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;	
	@ManyToOne
	@JoinColumn(name="pcode")
	private Priority priority;	
	private int status;	//0-unsolved,1-solved
}
