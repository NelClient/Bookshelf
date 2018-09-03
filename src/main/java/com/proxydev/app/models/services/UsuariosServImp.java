package com.proxydev.app.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.proxydev.app.models.dao.GeneralDao;
import com.proxydev.app.models.entities.Usuarios;

public class UsuariosServImp implements UsuariosServ{
	
	@Autowired
	private GeneralDao generalDao;

	@Override
	@Transactional(readOnly=true)
	public List<Usuarios> findAll() {		
		return (List<Usuarios>) generalDao.findAll();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Usuarios findOne(Long id) {		
		return generalDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void save(Usuarios usuarios) {
		generalDao.save(usuarios);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		generalDao.deleteById(id);
	}
}
