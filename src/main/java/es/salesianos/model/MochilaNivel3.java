package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nivel3")
public class MochilaNivel3 extends AbstractMochila {


	public MochilaNivel3() {
		capacity = 100;
	}
}