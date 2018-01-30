package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nivel2")
public class MochilaNivel2 extends AbstractMochila {


	public MochilaNivel2() {
		capacity = 50;
	}
}