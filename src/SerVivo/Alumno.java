package SerVivo;

public class Alumno extends Humano{
	private String grado;

	public Alumno(String name, int edad, String genero, String id, String grado) {
		super(name, edad, genero, id);
		this.grado = grado;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
	

}
