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
@Table(name="autores")

public class autores {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "autores_seq")
	@SequenceGenerator(name = "autores_seq", sequenceName = "AUTORES_SEQ")
	private Long id_autores;
	
	@Column(name = "nombre_autor")
	@NotEmpty
	private String nombre_autor;

	@Column(name = "nacionalidad")
	@NotEmpty
	private String nacionalidad;

	
	//Getter and Setter
	
	
	public Long getId_autores() {
		return id_autores;
	}

	public void setId_autores(Long id_autores) {
		this.id_autores = id_autores;
	}

	public String getNombre_autor() {
		return nombre_autor;
	}

	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}




