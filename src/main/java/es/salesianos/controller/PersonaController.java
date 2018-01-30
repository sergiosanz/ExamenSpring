package es.salesianos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import es.salesianos.model.Persona;

@Controller
public class PersonaController {

	private Persona persona;

	@GetMapping("/")
	public ModelAndView index() {
		persona = new Persona();
		ModelAndView modelAndView = new ModelAndView("index", "command", persona);
		modelAndView.addObject("persona", this.persona);
		return modelAndView;
	}

	@PostMapping("personaInsert")
	public ModelAndView personaInsert(Persona persona) {
		ModelAndView modelAndView = new ModelAndView("index", "command", persona);
		addPageData(persona);
		modelAndView.addObject("persona", this.persona);
		return modelAndView;
	}

	private void addPageData(Persona personaForm) {

		if (!StringUtils.isEmpty(personaForm.getNombre())) {
			this.persona.setNombre(personaForm.getNombre());
		}


	}

	@PostMapping("itemInsert")
	public ModelAndView itemInsert(Persona persona) {
		addPageData(persona);
		ModelAndView modelAndView = new ModelAndView("index", "command", persona);
		modelAndView.addObject("persona", this.persona);
		return modelAndView;
	}
}
