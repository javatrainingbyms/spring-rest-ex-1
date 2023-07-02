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
@Table(name="category")
public class Category {
	@Id
	@Column(name="category_code")
	private String catCode;
	@Column(name="category_name")
	private String catName;
	@OneToMany(mappedBy = "category")
	private List<SubCategory> subCategories;	
}
