package juegos.habilidad;

public class PruebaMarcianito {
	public static void main(String[] args) {
		Marcianito m1, m2, m3;
		
		m1 = new Marcianito();
		m2 = new Marcianito();
		m3 = new Marcianito();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println("Disparando al marciano 1...");
		for (int i = 1; i <= 100; i++)
			m1.recibirDisparo();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		System.out.println();
		
		System.out.println("Total marcianos: " + Marcianito.getTotalMarcianos());
		System.out.println("Total marcianos vivos: " + Marcianito.getTotalVivos());
		System.out.println("Total marcianos destruidos: " + Marcianito.getTotalDestruidos());

	}
}
