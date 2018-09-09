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
@Table(name="co_autores")

public class co_autores {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "co_autores_seq")
	@SequenceGenerator(name = "co_autores_seq", sequenceName = "CO_AUTORES_SEQ")
	private Long id_coautor;
	
	@Column(name = "nombre_coautor")
	@NotEmpty
	private String nombre_coautor;

	@Column(name = "nacionalidad")
	@NotEmpty
	private String nacionalidad;
	
	@Column(name = "id_editorial")
	@NotEmpty
	private String id_editorial;


	//Getter and Setter
	
	
	public Long getId_coautor() {
		return id_coautor;
	}

	public void setId_coautor(Long id_coautor) {
		this.id_coautor = id_coautor;
	}

	public String getNombre_coautor() {
		return nombre_coautor;
	}

	public void setNombre_coautor(String nombre_coautor) {
		this.nombre_coautor = nombre_coautor;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(String id_editorial) {
		this.id_editorial = id_editorial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
