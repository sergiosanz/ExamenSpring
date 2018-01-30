package es.salesianos.service;

import org.springframework.stereotype.Service;

import es.salesianos.model.Item;
import es.salesianos.model.Persona;
import es.salesianos.model.Arma;

@Service
public class PersonaService implements es.salesianos.service.Service {

	@Override
	public void addItem(Item item, Persona person) {
		String type = person.getItem().getType();
		if ("mochila".equals(type)) {
			if (!person.getBag().isFull()) {
				person.getBag().addItem(item);

			}
			System.out.println("la mochila dispone de " + person.getBag().spaceAvalaible() + " kilos de almacenaje");
		}

		if ("custom".equals(type)) {
			person.getPrimary().getItems().add(item);
		}
		if ("weapon".equals(type)) {
			if (person.getItem().getName() != person.getPrimary().getName()) {
				Arma wp = new Arma();
				wp.setName(person.getPrimary().getName());
				person.setPrimary(wp);
			}
		}
	}



}