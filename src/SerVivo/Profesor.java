package SerVivo;

public class Profesor extends Humano{
	private String materia;

	public Profesor(String name, int edad, String genero, String id, String materia) {
		super(name, edad, genero, id);
		this.materia = materia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}


}
