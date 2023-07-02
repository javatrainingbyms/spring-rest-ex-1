package com.ms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sub_category")
public class SubCategory {
	@Id
	@Column(name="sub_category_code")
	private String subCatCode;
	@Column(name="sub_category_name")
	private String subCatName;
	@ManyToOne
	@JoinColumn(name="category_code")
	private Category category;	//cat_code
	
	@OneToMany(mappedBy="subCategory")
	private List<Ticket> tickets;	
}	
