package SerVivo;

public class Jabali extends Animal {
	private String raza;

	public Jabali(String name, int edad, String genero,String raza) {
		super(name, edad, genero, "4", "Omnivoro", "Jabali");
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}
	

}
