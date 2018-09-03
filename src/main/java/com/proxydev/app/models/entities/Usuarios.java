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

public class Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "usuarios_seq")
	@SequenceGenerator(name = "usuarios_seq", sequenceName = "USUARIOS_SEQ")
	private Long id_usuario;
	
	@Column(name = "nombreUsuario")
	@NotEmpty
	private String nombreUsuario;

	@Column(name = "nombre")
	@NotEmpty
	private String nombre;
	
	@Column(name = "apellido")
	@NotEmpty
	private String apellido;
	
	@Column(name = "suscripcion")
	@NotEmpty
	private Integer suscripcion;

	@Column(name = "inscripcion")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@NotNull
	private Date inscripcion;
	
	@NotEmpty
	@Email
	private String email;
	
	@Column(name = "id_Contacto")
	@NotEmpty
	private Long contacto;
	
//Getter and Setter

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Integer suscripcion) {
		this.suscripcion = suscripcion;
	}

	public Date getInscripcion() {
		return inscripcion;
	}

	public void setInscripcion(Date inscripcion) {
		this.inscripcion = inscripcion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContacto() {
		return contacto;
	}

	public void setContacto(Long contacto) {
		this.contacto = contacto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
