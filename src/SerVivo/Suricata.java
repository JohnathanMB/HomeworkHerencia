package SerVivo;

public class Suricata extends Animal{
	private String raza;
	private final static String ESPECIE = "Suricata";
	private final static String REINO = "Carnivoro";
	private final static String CANTPATAS = "4";

	public Suricata(String name, int edad, String genero,String raza) {
		super(name, edad, genero, CANTPATAS, REINO, ESPECIE);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}
	
	@Override
	public void prestarGuardia() {
		System.out.println(name + " presta guardia como una "+ESPECIE);
	}
	
}
