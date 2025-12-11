package juegos.habilidad;

public class Marcianito {
	private static int totalMarcianitos = 0;
	private static int totalVivos = 0;
	private static int identificador;
	private int x;
	private int y;
	private int nivelVida;
	
	
	public Marcianito() {
		this.totalMarcianitos++;
		this.totalVivos++;
		this.identificador = this.totalMarcianitos;
		this.nivelVida = 10;
		this.x = (int)(Math.random() * 100);
		this.y = (int)(Math.random() * 100);
	}
	
	public static int getTotalMarcianos() {
		return totalMarcianitos;
	}
	
	public static int getTotalVivos() {
		return totalVivos;
	}
	
	public static int getTotalDestruidos() {
		return totalMarcianitos - totalVivos;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getNivelVida() {
		return nivelVida;
	}
	
	public void llamar(Marcianito otro) {
		System.out.println("Marcianito " + this.identificador + " llamando a Marcianito " + otro.identificador);
	}
	
	/**
	 * Le pasa 1 de vida a otro marciano. Únicamente lo hace si tiene más de 1 de vida.
	 * @param otro Marcianito que recibe el punto de vida.
	 */
	public void transferir(Marcianito otro) {
		if (this.nivelVida > 1) {
			otro.nivelVida++;
			this.nivelVida--;
		}
	}
	
	public void recibirDisparo() {
		nivelVida--;
		
		if (nivelVida == 0) {
			totalVivos--;
		} else if (nivelVida < 0) {
			nivelVida = 0;
		}
	}

	@Override
	public String toString() {
		return "Marcianito [x=" + x + ", y=" + y + ", nivelVida=" + nivelVida + "]";
	}

	
}
