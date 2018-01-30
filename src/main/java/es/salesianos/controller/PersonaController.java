package es.salesianos.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Item;
import es.salesianos.model.Persona;
import es.salesianos.model.Arma;

@Controller
public class PersonaController {

	private static Logger log = LogManager.getLogger(PersonaController.class);

	private Persona person;

	@GetMapping("/")
	public ModelAndView index() {
		person = new Persona();
		person.setItem(new Item());
		ModelAndView modelAndView = new ModelAndView("index", "command", person);
		modelAndView.addObject("person", this.person);
		return modelAndView;
	}

	@PostMapping("insert")
	public ModelAndView personInsert(Persona person) {
		String type = this.person.getItem().getType();
		if ("mochila".equals(type)) {
			if (!this.person.getBag().isFull()) {
				this.person.getBag().addItem(person.getItem());

			}
			System.out
					.println("la mochila dispone de " + this.person.getBag().spaceAvalaible() + " kilos de almacenaje");
		}

		if ("custom".equals(type)) {
			this.person.getPrimary().getItems().add(person.getItem());
		}
		if ("weapon".equals(type)) {
			if (this.person.getItem().getName() != this.person.getPrimary().getName()) {
				Arma wp = new Arma();
				wp.setName(this.person.getPrimary().getName());
				this.person.setPrimary(wp);
			}
		}

		ModelAndView modelAndView = new ModelAndView("index", "command", person);

		modelAndView.addObject("person", this.person);
		return modelAndView;
	}

	@PostMapping("switchWeapon")
	public ModelAndView switchWeapon(Persona person) {
		Arma tmp;
		tmp = this.person.getPrimary();
		this.person.setPrimary(this.person.getSecondary());
		this.person.setSecondary(tmp);
		System.out.println("El arma activa es " + this.person.getPrimary().getName());
		ModelAndView modelAndView = new ModelAndView("index", "command", person);
		modelAndView.addObject("person", this.person);
		return modelAndView;
	}



}