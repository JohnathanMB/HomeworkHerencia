package SerVivo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jabali  jabali1 = new Jabali("Pumba",2,"Macho","africano");
		System.out.println(jabali1.getName());
		System.out.println(jabali1.getEspecie());
		jabali1.prestarGuardia();
		
		Suricata suricata1  = new Suricata("Timon", 1, "Macho", "Africano");
		System.out.println(suricata1.getName());
		System.out.println(suricata1.getEspecie());
		suricata1.prestarGuardia();

	}

}
