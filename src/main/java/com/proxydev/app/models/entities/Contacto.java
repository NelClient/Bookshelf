package com.proxydev.app.models.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="contacto")

public class Contacto {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "contacto_seq")
	@SequenceGenerator(name = "contacto_seq", sequenceName = "CONTACTO_SEQ")
	private Long id_contacto;
	
	@Column(name = "contacto1")
	@NotEmpty
	private String contacto1;

	@Column(name = "contacto2")
	@NotEmpty
	private String contacto2;
	
	@Column(name = "contacto3")
	@NotEmpty
	private String contacto3;
	
//Getter and setter

	public Long getId_contacto() {
		return id_contacto;
	}

	public void setId_contacto(Long id_contacto) {
		this.id_contacto = id_contacto;
	}

	public String getContacto1() {
		return contacto1;
	}

	public void setContacto1(String contacto1) {
		this.contacto1 = contacto1;
	}

	public String getContacto2() {
		return contacto2;
	}

	public void setContacto2(String contacto2) {
		this.contacto2 = contacto2;
	}

	public String getContacto3() {
		return contacto3;
	}

	public void setContacto3(String contacto3) {
		this.contacto3 = contacto3;
	}

	
}
