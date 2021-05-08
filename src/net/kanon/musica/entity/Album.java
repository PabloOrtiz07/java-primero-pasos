/**
 * 
 */
package net.kanon.musica.entity;
/**
 * 
 * @author 
 *
 */
public class Album {

	private int id;

	private String nombre;

	private int anio;

	private String copiasVendidas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getCopiasVendidas() {
		return copiasVendidas;
	}

	public void setCopiasVendidas(String copiasVendidas) {
		this.copiasVendidas = copiasVendidas;
	}
}
