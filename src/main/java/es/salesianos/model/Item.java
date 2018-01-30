package es.salesianos.model;

public class Item {
	
	private String Nombre;
	private int Peso;
	private String TipoEscritura;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPeso() {
		return Peso;
	}
	public void setPeso(int peso) {
		Peso = peso;
	}
	public String getTipoEscritura() {
		return TipoEscritura;
	}
	public void setTipoEscritura(String tipoEscritura) {
		TipoEscritura = tipoEscritura;
	}
}
