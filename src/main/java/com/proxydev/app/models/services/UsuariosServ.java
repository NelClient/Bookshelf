package com.proxydev.app.models.services;

import java.util.List;
import com.proxydev.app.models.entities.Usuarios;

public interface UsuariosServ {
	
	public List<Usuarios> findAll();
	
	public void save(Usuarios customer);
	
	public Usuarios findOne(Long id);
	
	public void delete(Long id);
}
