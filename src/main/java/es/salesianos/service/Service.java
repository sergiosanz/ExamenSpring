package es.salesianos.service;

import java.util.List;

import es.salesianos.model.Persona;

public interface Service {

	public void insert(Persona persona);

	public List<Persona> listAll();

}
