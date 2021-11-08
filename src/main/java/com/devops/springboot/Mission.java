package com.devops.springboot;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Mission implements Serializable {
	private static final long serialVersionUID = -5369734855993305723L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;
	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Mission(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	



	public Mission(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
