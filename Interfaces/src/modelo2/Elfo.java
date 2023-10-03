package modelo2;

public class Elfo extends Personaje{

	private int flechas;
	private int punteria;
	
	public Elfo(String nombre, int vida, int velocity, int danio, int inteligencia, int flechas,int PosX, int PosY, int punteria) {
		super(nombre, vida, velocity, danio, inteligencia, PosX, PosY);
		this.flechas=flechas;
		this.punteria = punteria;
	}

	public int getFlechas() {
		return flechas;
	}

	public void recogerFlechas(int flechas) {
		this.flechas += flechas;
	}

	public int getPunteria() {
		return punteria;
	}

	public void AumentarPunteria(int punteria) {
		this.punteria += punteria;
	}

	@Override
	public void atacar(Personaje P) {
		int probabilidadFallo=-1;
		int ataque=getDanio();
		
		if(P.posicion.getPosition()<2) probabilidadFallo=25;
		if(Math.random()*10<=probabilidadFallo/10)ataque=0;
		if(Math.random()*10<=this.punteria/10)ataque*=2;
		
		this.flechas--;
		
		P.sufrirDanio(ataque);
		
	}

	@Override
	public void sufrirDanio(int danio) {
		int sufrido = super.getVida();
		sufrido -= danio ;
		setVida(sufrido);
		
	}


}
