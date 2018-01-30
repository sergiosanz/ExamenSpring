package es.salesianos.model;

import java.util.ArrayList;

public class Persona {
	
	public String nombre;
	public Mochila mochila;
	public Arma armaPrimaria;
	public Arma armaSecundaria;

	public Persona() {
		mochila.setItems(new ArrayList<Item>());
		armaPrimaria.setItems(new ArrayList<Item>());
		armaSecundaria.setItems(new ArrayList<Item>());
	}
}
