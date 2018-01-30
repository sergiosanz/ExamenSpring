package es.salesianos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import es.salesianos.model.Persona;

@Service
@Profile("memory")
public class PersonaService implements es.salesianos.service.Service {

	private List<Persona> personas = new ArrayList<>();

	@Override
	public void insert(Persona persona) {
		personas.add(persona);
	}

	@Override
	public List<Persona> listAll() {
		return personas;
	}


}
