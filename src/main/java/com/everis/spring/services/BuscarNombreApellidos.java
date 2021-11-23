package com.everis.spring.services;

import com.everis.spring.repositories.Cliente;

public interface BuscarNombreApellidos {
	
	public Cliente findByNombreAndApellidos(String nombre,String apellidos);

}
