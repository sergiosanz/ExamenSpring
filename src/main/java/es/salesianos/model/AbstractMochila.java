package es.salesianos.model;

import java.util.List;

public abstract class AbstractMochila implements Mochila {
	protected List<Item> items;
	
	public int capacity;
	
	private int sumItems() {
		int sum = 0;
		for (Item item : items) {
			try {
				sum += Integer.parseInt(item.getPeso());
			} catch (Exception e) {
			}
		}
		return sum;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	@Override
	public boolean isFull() {
		return capacity == sumItems();
	}

	@Override
	public void addItem(Item item) {
		int weight = Integer.parseInt(item.getPeso());
		if (spaceAvalaible() < weight) {
			System.out.println("no se pudo añadir el elemento " + item.getName());
		}
	}

	@Override
	public int spaceAvalaible() {
		return sumItems();
	}

	public  int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}