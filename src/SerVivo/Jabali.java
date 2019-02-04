package SerVivo;

public class Jabali extends Animal {
	private String raza;
	private final static String ESPECIE = "Jabali";
	private final static String REINO = "Omnivoro";
	private final static String CANTPATAS = "4";

	public Jabali(String name, int edad, String genero,String raza) {
		super(name, edad, genero, CANTPATAS, REINO, ESPECIE);
		this.raza = raza;
	}

	public String getRaza() {
		return raza;
	}
	
	@Override
	public void prestarGuardia() {
		System.out.println(name + " No presta guardia "+ESPECIE);
	}

}
