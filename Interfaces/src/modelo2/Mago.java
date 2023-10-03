package modelo2;

public class Mago extends Personaje{

	private int mana=0;
	
	public Mago(String nombre, int vida, int velocity, int danio, int inteligencia,int PosX, int PosY, int mana) {
		super(nombre, vida, velocity, danio, inteligencia, PosX, PosY);
		recuperarMana(mana);
	}

	public int getMana() {
		return mana;
	}

	public void recuperarMana(int mana) {
		this.mana += mana;
	}
	
	@Override
	public void atacar(Personaje P) {		
		int ataque=getDanio();		
		this.mana--;	
		P.sufrirDanio(ataque);		
	}

	@Override
	public void sufrirDanio(int danio) {
		int sufrido = super.getVida();
		sufrido -= danio ;
		setVida(sufrido);
		
	}
}
