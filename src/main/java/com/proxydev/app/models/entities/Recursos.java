package com.proxydev.app.models.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Table(name="usuarios")

public class Recursos implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "recursos_seq")
	@SequenceGenerator(name = "recursos_seq", sequenceName = "RECURSOS_SEQ")
	private Long id_recurso;
	
	@Column(name = "titulo")
	@NotEmpty
	private String titulo;
	
	@Column(name = "id_autor")
	@NotEmpty
	private Long contacto;
	
	//Getter and Setter

	public Long getId_recurso() {
		return id_recurso;
	}

	public void setId_recurso(Long id_recurso) {
		this.id_recurso = id_recurso;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getContacto() {
		return contacto;
	}

	public void setContacto(Long contacto) {
		this.contacto = contacto;
	}
	
}
