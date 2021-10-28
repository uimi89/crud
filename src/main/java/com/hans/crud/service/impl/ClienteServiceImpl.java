package com.hans.crud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.hans.crud.commons.GenericServiceImpl;
import com.hans.crud.dao.api.ClienteRepository;
import com.hans.crud.model.Cliente;
import com.hans.crud.service.api.ClienteServiceAPI;

@Service
public class ClienteServiceImpl extends GenericServiceImpl<Cliente, Integer> implements ClienteServiceAPI {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public CrudRepository<Cliente, Integer> getDao() {
		return clienteRepository;
	}

}
