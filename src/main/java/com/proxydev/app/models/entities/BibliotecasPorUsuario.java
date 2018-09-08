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
@Table(name="bibliotecasPU")

public class BibliotecasPorUsuario {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "bibliotecasPU_seq")
	@SequenceGenerator(name = "bibliotecasPU_seq", sequenceName = "BLIBLIOTECASPU_SEQ")
	private Long id_bibliotecaPU;
	
	@Column(name = "nombreBiblioteca")
	@NotEmpty
	private String nombreBiblioteca;

	@Column(name = "id_recursoPU")
	@NotEmpty
	private String id_recursoPU;
	
	@Column(name = "id_usuario")
	@NotEmpty
	private Long id_usuario;
	
	//Getter and Setter

	public Long getId_bibliotecaPU() {
		return id_bibliotecaPU;
	}

	public void setId_bibliotecaPU(Long id_bibliotecaPU) {
		this.id_bibliotecaPU = id_bibliotecaPU;
	}

	public String getNombreBiblioteca() {
		return nombreBiblioteca;
	}

	public void setNombreBiblioteca(String nombreBiblioteca) {
		this.nombreBiblioteca = nombreBiblioteca;
	}

	public String getId_recursoPU() {
		return id_recursoPU;
	}

	public void setId_recursoPU(String id_recursoPU) {
		this.id_recursoPU = id_recursoPU;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
