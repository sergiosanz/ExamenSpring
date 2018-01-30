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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mochila getMochila() {
		return mochila;
	}

	public void setMochila(Mochila mochila) {
		this.mochila = mochila;
	}

	public Arma getArmaPrimaria() {
		return armaPrimaria;
	}

	public void setArmaPrimaria(Arma armaPrimaria) {
		this.armaPrimaria = armaPrimaria;
	}

	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}

	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
}
