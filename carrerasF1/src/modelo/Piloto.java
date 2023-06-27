package modelo;

public class Piloto {
	private String nombre;
	private String nacionalidad;
	private String edad;
	private String dorsal;
	private String habilidad;
	
	
	public Piloto() {
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	public String getDorsal() {
		return dorsal;
	}


	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}


	public String getHabilidad() {
		return habilidad;
	}


	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}


	@Override
	public String toString() {
		return "Piloto [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", dorsal=" + dorsal
				+ ", habilidad=" + habilidad + "]";
	}
	
	
	
}
