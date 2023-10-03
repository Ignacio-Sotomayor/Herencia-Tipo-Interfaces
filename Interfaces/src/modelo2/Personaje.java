package modelo2;

public abstract class Personaje implements Dibujable{

	private String nombre;
	public Position posicion;
	private int vida;
	private int velocity;
	private int danio;
	private int inteligencia;
	
	public Personaje(String nombre, int vida, int velocity, int danio, int inteligencia, int PosX, int PosY) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.velocity = velocity;
		this.danio = danio;
		this.inteligencia = inteligencia;
	    this.posicion.setPosX(PosX);
	    this.posicion.setPosY(PosY);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	public int getVida() {
		return vida;
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDanio() {
		return danio;
	}

	public void setFuerza(int danio) {
		this.danio = danio;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	
	public void recuperse (int vida) {
		this.vida +=vida;
	}
	
	@Override
	public String toString() {
		return  nombre + " esta en la posicion=" + posicion.getPosX() + posicion.getPosY() + " y tiene " + vida + "puntos de vida";
	}

	public void SystemOut(Personaje P) {
		System.out.println(this.toString());
		
	}
	
	public abstract void sufrirDanio(int danio);
	
	public abstract void atacar(Personaje P);
}
