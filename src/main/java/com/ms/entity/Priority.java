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
@Table(name="priority")
public class Priority {
	@Id
	@Column(name="priority_code")
	private String pcode;
	@Column(name="priority_name")
	private String pname;
	@Column(name="solution_days")
	private int solutionDays;
	@OneToMany (mappedBy="priority")
	private List<Ticket> tickets;
}
