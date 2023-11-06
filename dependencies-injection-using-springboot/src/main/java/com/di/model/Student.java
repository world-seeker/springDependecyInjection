package com.di.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private final Long idStudent;
	@Column(name = "id_type")
	private final Integer idType;
	@Column(name = "name")
	private final String name;
	@Column(name = "last_name")
	private final String lastName;
	@Column(name = "nationality")
	private final Integer nationality;
	@Column(name = "address")
	private String address;
	@Column(name = "birthdate")
	private Date birthDate;
	
	   public Student() {
		this.idStudent = null;
		this.idType = null;
		this.name = "";
		this.lastName = "";
		this.nationality = null;
	        // Default constructor with no arguments
	    }

	public Student(Long idStudent, Integer idType, String name, String lastName, Integer nationality) {
		this.idStudent = idStudent;
		this.idType = idType;
		this.name = name;
		this.lastName = lastName;
		this.nationality = nationality;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Long getIdStudent() {
		return idStudent;
	}

	public Integer getIdType() {
		return idType;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getNationality() {
		return nationality;
	}

}
