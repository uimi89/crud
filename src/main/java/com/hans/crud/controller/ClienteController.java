package com.hans.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hans.crud.model.Cliente;
import com.hans.crud.service.api.ClienteServiceAPI;

@RestController
@RequestMapping("/cliente/api/v1")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	private ClienteServiceAPI clienteServiceAPI;
	
	@GetMapping(value="/all")
	public List<Cliente> getAll(){
		return clienteServiceAPI.getAll();
	}
	
	@GetMapping(value="/find/{id}")
	public Cliente find(@PathVariable Integer id) {
		return clienteServiceAPI.get(id);		
	}
	
	@GetMapping(value="/save")
	public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
		Cliente obj = clienteServiceAPI.save(cliente);
		return new ResponseEntity<Cliente>(obj, HttpStatus.OK);
	}
	
	@GetMapping(value="/delete/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable Integer id){
		Cliente cliente = clienteServiceAPI.get(id);
		if(cliente != null) {
			clienteServiceAPI.delete(id);
		}else {
			return new ResponseEntity<Cliente>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	
}
