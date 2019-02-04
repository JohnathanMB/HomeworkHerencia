package SerVivo;

public class Animal extends SerVivo{
	protected String cantPatas;
	protected String reinoAlimentacion;
	protected String especie;
	
	public Animal(String name, int edad, String genero, String cantPatas, String reinoAlimentacion, String especie) {
		super(name, edad, genero);
		this.cantPatas = cantPatas;
		this.reinoAlimentacion = reinoAlimentacion;
		this.especie = especie;
	}


	public String getCantPatas() {
		return cantPatas;
	}

	public void setCantPatas(String cantPatas) {
		this.cantPatas = cantPatas;
	}

	public String getReinoAlimentacion() {
		return reinoAlimentacion;
	}

	public void setReinoAlimentacion(String reinoAlimentacion) {
		this.reinoAlimentacion = reinoAlimentacion;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	


	public void prestarGuardia() {
		// TODO Auto-generated method stub
		System.out.println("ANIMAL Lo hace");
		
	}
	
	
}
