package es.salesianos.model;

public interface Mochila {

	public boolean isFull();

	public void addItem(Item item);

	public int spaceAvalaible();
}