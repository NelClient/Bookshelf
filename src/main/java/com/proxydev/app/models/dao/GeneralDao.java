package com.proxydev.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import com.proxydev.app.models.entities.Usuarios;

public interface GeneralDao extends CrudRepository <Usuarios, Long> {

}
