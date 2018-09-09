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
@Table(name="categoria_libros")

public class categoria_libros {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "categoria_libros_seq")
	@SequenceGenerator(name = "categoria_libros_seq", sequenceName = "CATEGORIA_LIBROS_SEQ")
	private Long id_categoriaCatalogo;
	
	@Column(name = "genero")
	@NotEmpty
	private String genero;

	@Column(name = "id_recursoCL")
	@NotEmpty
	private String id_recursoCL;


	//Getter and Setter
	
	
	public Long getId_categoriaCatalogo() {
		return id_categoriaCatalogo;
	}

	public void setId_categoriaCatalogo(Long id_categoriaCatalogo) {
		this.id_categoriaCatalogo = id_categoriaCatalogo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getId_recursoCL() {
		return id_recursoCL;
	}

	public void setId_recursoCL(String id_recursoCL) {
		this.id_recursoCL = id_recursoCL;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
