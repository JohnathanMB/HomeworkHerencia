package SerVivo;

public class Suricata extends Animal{
	private String raza;

	public Suricata(String name, int edad, String genero,String raza) {
		super(name, edad, genero, "4", "Carnivoro", "Suricata");
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}
	
}
