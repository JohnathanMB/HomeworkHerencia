package SerVivo;

public class Humano extends SerVivo {
	protected String id;

	public Humano(String name, int edad, String genero, String id) {
		super(name, edad, genero);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
