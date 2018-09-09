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
@Table(name="editorial")

public class editoriales {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "editorial_seq")
	@SequenceGenerator(name = "editorial_seq", sequenceName = "EDITORIAL_SEQ")
	private Long id_editorial;
	
	@Column(name = "nombre_editorial")
	@NotEmpty
	private String nombre_editorial;

	@Column(name = "pais")
	@NotEmpty
	private String pais;


	//Getter and Setter
	
	
	public Long getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(Long id_editorial) {
		this.id_editorial = id_editorial;
	}

	public String getNombre_editorial() {
		return nombre_editorial;
	}

	public void setNombre_editorial(String nombre_editorial) {
		this.nombre_editorial = nombre_editorial;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
