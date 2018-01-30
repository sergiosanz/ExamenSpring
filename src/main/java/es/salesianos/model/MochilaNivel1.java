package es.salesianos.model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("nivel1")
public class MochilaNivel1 extends AbstractMochila {


	public MochilaNivel1() {
		capacity = 20;
	}
}