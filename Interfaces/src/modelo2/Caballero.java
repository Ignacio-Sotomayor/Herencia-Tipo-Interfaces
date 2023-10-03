package modelo2;

public class Caballero extends Personaje {

	private int armadura=0;
	
	public Caballero(String nombre, int vida, int velocity, int danio, int inteligencia,int PosX, int PosY, int armadura) {
		super(nombre, vida, velocity, danio, inteligencia, PosX, PosY);
		this.reforzarArmadura(armadura);
		// TODO Auto-generated constructor stub
	}

	public int getArmadura() {
		return armadura;
	}

	public void reforzarArmadura(int armadura) {
		this.armadura += armadura;
	}
	
	@Override
	public void atacar(Personaje P) {
		if(P.posicion.getPosition()<=1){
			P.sufrirDanio(getDanio());
		}
		
	}

	@Override
	public void sufrirDanio(int danio) {
		int sufrido = super.getVida();
		sufrido -= danio - armadura*0.01;
		setVida(sufrido);
		
	}



}
