package SerVivo;

public class SerVivo {
	protected String name;
	protected int edad;
	protected String genero;
	
	public SerVivo(String name, int edad, String genero) {
		this.name = name;
		this.edad = edad;
		this.genero = genero;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

}
