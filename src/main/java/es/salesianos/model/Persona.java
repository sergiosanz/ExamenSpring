package es.salesianos.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Persona {

	@Autowired
	private Mochila mochila;
	private Arma armaPrimaria;
	private Arma armaSecundaria;
	private Item item;

	public Mochila getBag() {
		return mochila;
	}
	public void setBag(Mochila mochila) {
		this.mochila = mochila;
	}
	public Arma getPrimary() {
		return armaPrimaria;
	}
	public void setPrimary(Arma primary) {
		this.armaPrimaria = primary;
	}
	public Arma getSecondary() {
		return armaSecundaria;
	}
	public void setSecondary(Arma secondary) {
		this.armaSecundaria = secondary;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

}
